package com.tcwgq.demo6;
/**
 * A:方法重载与方法重写的区别？方法重载能改变返回值的类型么？
 * 方法重载：同一个类中出现相同的方法名称，不同的参数列表的方法，与返回值类型无关
 * 方法重写：不同类中出现的方法声明相同，方法体不同的方法
 * 方法重载可以改变返回值的类型，因为其与返回值类型无关
 * B:this关键字和super关键字分别代表什么?以及他们各自的使用场景和作用。
 * this代表当前类的引用
 * super代表父类存储空间的标识(可以理解为父类的引用，可以访问父类的成员)
 * 成员变量：
 * 		this.成员变量
 * 		super.成员变量
 * 成员方法：
 * 		this.成员方法
 * 		super.成员方法
 * 构造方法：
 * 		this(...)
 * 		super(...)
 */
public class InheritanceDemo3 {
	public static void main(String[] args) {
		Student s = new Student();
		s.show();
		s.show("aaa");
	}
}

class Student {
	public Student(){
		
	}
	public void show(){
		System.out.println("show");
	}
	public int show(String name){
		System.out.println("String show");
		return 0;
	}
	public String show(int age){
		System.out.println("int show");
		return "Hello";
	}
}
