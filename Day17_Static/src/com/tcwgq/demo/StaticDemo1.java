package com.tcwgq.demo;

/**
 * static关键字注意事项
		A:在静态方法中是没有this关键字的
			如何理解呢?
				静态是随着类的加载而加载，this是随着对象的创建而存在。
				静态比对象先存在。
		B:静态方法只能访问静态的成员变量和静态的成员方法
				静态方法：
					成员变量：只能访问静态变量
					成员方法：只能访问静态成员方法
				非静态方法：
					成员变量：可以是静态的，也可以是非静态的
					成员方法：可是是静态的成员方法，也可以是非静态的成员方法。
			简单记：
				静态只能访问静态。
 */
public class StaticDemo1 {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.show();
		System.out.println("--------------");
//		t.method();
		Teacher.method();
	}
}

class Teacher {
	int num = 10;
	static int num1 = 20;
	public void show(){
		System.out.println(num); //隐含的告诉你访问的是成员变量
		System.out.println(this.num);//明确的告诉你访问的是成员变量
		System.out.println(num1);//可以访问静态的成员变量
		System.out.println(this.num1);//The static field Teacher.num1 should be accessed in a static way
		function();//可以访问非静态的成员方法
		function1();//可以访问静态的成员方法
	}
	public static void method(){
//		System.out.println(num);//Cannot make a static reference to the non-static field num
//		System.out.println(this.num1);//Cannot use this in a static context
		System.out.println(num1);//只能访问静态的成员变量
//		function();//Cannot make a static reference to the non-static method function() from the type Teacher
		function1();//只能访问静态的成员方法
	}
	public void function(){
		System.out.println("function");
	}
	public static void function1(){
		System.out.println("function1");
	}

}