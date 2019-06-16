package com.tcwgq.demo1;

/**
 * 老师案例 
 * 具体事物：基础班老师，就业班老师 
 * 共性：姓名，年龄，讲课。
 */
public class AbstractClassTest1 {
	public static void main(String[] args) {
		Teacher t = new BaseTeacher("aaa", 30);
		System.out.println(t.getName() + "--" + t.getAge());
		t.teach();
		System.out.println("--------------");
		t = new WorkTeacher("bbb", 35);
		System.out.println(t.getName() + "--" + t.getAge());
		t.teach();
	}
}

abstract class Teacher {
	private String name;
	private int age;

	public Teacher() {
		super();
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

	public abstract void teach();
}

class BaseTeacher extends Teacher {

	public BaseTeacher() {
		super();
	}

	public BaseTeacher(String name, int age) {
		super(name, age);
	}

	@Override
	public void teach() {
		System.out.println("JavaSe");
	}

}

class WorkTeacher extends Teacher {

	public WorkTeacher() {
		super();
	}

	public WorkTeacher(String name, int age) {
		super(name, age);
	}

	@Override
	public void teach() {
		System.out.println("JavaEE");
	}

}