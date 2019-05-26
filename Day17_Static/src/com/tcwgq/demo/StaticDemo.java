package com.tcwgq.demo;

/**
 * 可以修饰成员变量和成员方法
 * static关键字特点 
 * 随着类的加载而加载
 * 优先于对象存在 
 * 被类的所有对象共享
 * 这也是我们判断是否使用静态关键字的条件
 * 		如果某个成员变量是被所有对象共享的，那么它就应该定义为静态的。
 * 可以通过类名调用，也可以通过对象名调用，推荐通过类名调用
 * static关键字注意事项 
 * 在静态方法中是没有this关键字的 
 * 静态方法只能访问静态的成员变量和静态的成员方法
 * 静态修饰的内容我们称其为：与类相关的，类成员
 * 静态的内容存在于方法区的静态区
 */
public class StaticDemo {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.name);
		System.out.println(Student.name1);
		System.out.println(s.name1);//The static field Student.name1 should be accessed in a static way
	}
}

class Student{
	String name = "Hello";
	static String name1 = "Hello1";
}
