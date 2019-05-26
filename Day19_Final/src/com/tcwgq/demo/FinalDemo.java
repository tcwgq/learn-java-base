package com.tcwgq.demo;

/**
 * final:最终的，可以修饰类，方法，变量 
 * 特点： 
 * 修饰类： 类不能被继承 
 * 修饰方法：方法不能被重写 
 * 修饰变量：变量不能被重新赋值，其实此时的变量成为常量
 * 常量：
 * 		字面值常量
 * 			10, "hello", 'a'
 * 		自定义常量
 * 			final int a = 10;
 */
public class FinalDemo {
	public static void main(String[] args) {
		Student s = new Student();
		s.show();
	}
}

class Person {
	private String name;
	private int age;
	final int num = 10;
	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void show() {
		System.out.println("Person show");
	}

}

class Student extends Person {// The type Student cannot subclass the final
								// class Person

	public Student() {
		super();
	}

	public Student(String name, int age) {
		super(name, age);
	}

	public void show() {// Cannot override the final method from Person
		System.out.println("Student show");
//		num = 100;//The final field Person.num cannot be assigned
		System.out.println(num);
	}
}