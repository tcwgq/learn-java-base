package com.tcwgq.demo;

/**
 * 多态的代码体现
 * 多态中成员访问的特点：
 * 成员变量：编译看左边，运行看左边
 * 构造方法：创建子类对象时，先访问父类的构造方法，对父类的数据进行初始化
 * 成员方法：编译看左边，运行看右边
 * 静态方法：编译看左边，运行看左边，静态和类相关，算不上重写，所以看左边
 * 总结：
 * 由于成员方法能够重写，所以运行看右边
 */
public class PolymorphismDemo1 {
	public static void main(String[] args) {
		Fu f = new Zi();
		System.out.println(f.a);
//		System.out.println(f.b);//b cannot be resolved or is not a field
		f.show();//子父类中都有这个方法
//		f.method();//The method method() is undefined for the type Fu
		f.function();//Fu function
	}
}

class Fu {
	int a = 10;
	public Fu() {
		super();
	}

	public void show() {
		System.out.println("Fu show");
	}
	
	public static void function(){
		System.out.println("Fu function");
	}

}

class Zi extends Fu {
	int a = 100;
	int b = 200;
	public Zi() {
		super();
	}

	public void show() {
		System.out.println("Zi show");
	}
	
	public void method(){
		System.out.println("Zi method");
	}
	
	public static void function(){
		System.out.println("Zi function");
	}
}