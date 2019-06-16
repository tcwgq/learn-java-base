package com.tcwgq.test;

public class Teacher {
	private String name;
	private int age;
	private String address;

	public Teacher() {
		super();
	}

	public Teacher(String name, int age, String address) {
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
		return "Teacher [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	public void show() {
		System.out.println("Teacher show");
	}

}
