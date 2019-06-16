package com.tcwgq.demo;

public class Person {
	private String name;
	int age;
	public String address;

	public Person() {
		super();
	}

	private Person(String name) {
		super();
		this.name = name;
	}

	Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	public void show() {
		System.out.println("show");
	}

	public void method(String s) {
		System.out.println("method:" + s);
	}

	public String getString(String s, int i) {
		return s + "--" + i;
	}

	private void function() {
		System.out.println("function");
	}

}
