package com.tcwgq.test3;

public class ExtendsTest1 {
	public static void main(String[] args) {
		S s = new S();
		s.setName("aaa");
		s.setAge(30);
		System.out.println(s.getName() + "--" + s.getAge());
		System.out.println("---------------");
		S s1 = new S("bbb", 43);
		System.out.println(s1.getName() + "--" + s1.getAge());
		System.out.println("----------------");
		T t = new T("ccc", 56);
		System.out.println(t.getName() + "--" + t.getAge());
	}
}

class Person {
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

}

class S extends Person {
	public S() {
		super();
	}

	public S(String name, int age) {
		// this.name = name;
		// this.age = age;
		super(name, age);
	}
}

class T extends Person {
	public T() {
		super();
	}

	public T(String name, int age) {
		super(name, age);
	}
}