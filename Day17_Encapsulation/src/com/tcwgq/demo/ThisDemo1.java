package com.tcwgq.demo;

class ThisDemo1 {
	public static void main(String[] args) {
		Student3 s = new Student3();
		System.out.println(s.getName() + "--" + s.getAge());
		System.out.println("-------------");
		s.setName("林青霞");
		s.setAge(27);
		System.out.println(s.getName() + "--" + s.getAge());
	}
}

class Student3 {
	private String name;
	private int age;

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
