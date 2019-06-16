package com.tcwgq.demo1;

class StudentDemo {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s);// com.tcwgq.demo1.Student@2a139a55
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.address);
		s.name = "HelloWorld";
		s.age = 20;
		s.address = "北京";
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.address);
		s.study();
		s.eat();
		s.sleep();
	}
}

class Student {
	String name;
	int age;
	String address;

	public void study() {
		System.out.println("学生爱学习");
	}

	public void eat() {
		System.out.println("学习饿了，要吃饭");
	}

	public void sleep() {
		System.out.println("学习累了，要睡觉");
	}
}