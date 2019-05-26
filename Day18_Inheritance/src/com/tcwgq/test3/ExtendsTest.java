package com.tcwgq.test3;

public class ExtendsTest {
	public static void main(String[] args) {
		Student s = new Student("aaa", 30);
		System.out.println(s.getName() + "--" + s.getAge());
		System.out.println("-------------");
		Teacher t = new Teacher("bbb", 37);
		System.out.println(t.getName() + "--" + t.getAge());
	}
}

class Student {
	private String name;
	private int age;

	public Student() {

	}

	public Student(String name, int age) {
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

}

class Teacher {
	private String name;
	private int age;

	public Teacher() {

	}

	public Teacher(String name, int age) {
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

}