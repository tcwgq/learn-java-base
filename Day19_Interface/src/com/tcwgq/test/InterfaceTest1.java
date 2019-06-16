package com.tcwgq.test;

/**
 * 老师和学生案例,加入抽烟的额外功能
 */
public class InterfaceTest1 {
	public static void main(String[] args) {
		Student s = new Student("aaa", 20);
		System.out.println(s.getName() + "--" + s.getAge());
		s.eat();
		s.smoke();
		System.out.println("----------------");
		Teacher t = new Teacher("bbb", 25);
		System.out.println(t.getName() + "--" + t.getAge());
		t.eat();
		t.smoke();
	}
}

interface Smoke {
	public abstract void smoke();
}

abstract class Person {
	private String name;
	private int age;

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

	public abstract void eat();

	public void sleep() {
		System.out.println("睡觉");
	}

}

class Student extends Person implements Smoke {

	public Student() {
		super();
	}

	public Student(String name, int age) {
		super(name, age);
	}

	@Override
	public void smoke() {
		System.out.println("老师抽中华");
	}

	@Override
	public void eat() {
		System.out.println("老师爱吃肉");
	}

}

class Teacher extends Person implements Smoke {

	public Teacher() {
		super();
	}

	public Teacher(String name, int age) {
		super(name, age);
	}

	@Override
	public void smoke() {
		System.out.println("学生抽中南海");
	}

	@Override
	public void eat() {
		System.out.println("学生爱吃素");
	}

}