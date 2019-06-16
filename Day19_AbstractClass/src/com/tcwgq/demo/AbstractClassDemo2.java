package com.tcwgq.demo;

/**
 * 一个类如果没有抽象方法，可不可以定义为抽象类?如果可以，有什么意义? 
 * 		可以，这样做能够使抽象类不能实例化 
 * abstract不能和哪些关键字共存
 * private 冲突 
 * final 冲突 
 * static 无意义
 */
public class AbstractClassDemo2 {
	public static void main(String[] args) {
		Student s = new SmallStudent();
		s.show();
		System.out.println("------------------");
		Student.f();
	}
}

abstract class Student {
	public abstract void show();

	// private abstract void method();//权限修饰符只能使用public或protected
	// final abstract void function();//权限修饰符只能使用public或protected
	// abstract static void fun();//权限修饰符只能使用public或protected，无意义
	public static void f() {
		System.out.println("f");
	}
}

class SmallStudent extends Student {

	@Override
	public void show() {
		System.out.println("SmallStudent show");
	}

}