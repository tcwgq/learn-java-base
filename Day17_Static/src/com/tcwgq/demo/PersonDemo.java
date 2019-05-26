package com.tcwgq.demo;

public class PersonDemo {
	public static void main(String[] args) {
		Person p = new Person("aaa", 17, "china");
		p.show();
		// Person p1 = new Person("bbb", 23, "china");
		// p1.show();
		// Person p2 = new Person("ccc", 35, "china");
		// p2.show();
		Person p3 = new Person("ddd", 67);
		p3.show();
		Person p4 = new Person("eee", 90);
		p4.show();
		Person p5 = new Person("凤姐", 21);
		p5.show();
		p5.setCountry("USA");
		p5.show();
		p3.show();
		p4.show();
	}
}

class Person {
	private String name;
	private int age;
	private static String country;

	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(String name, int age, String country) {
		this.name = name;
		this.age = age;
		// this.country = country;//The static field Person.country should be
		// accessed in a static way
		Person.country = country;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		// this.country = country;//The static field Person.country should be
		// accessed in a static way
		Person.country = country;
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
		System.out.println(name + "--" + age + "--" + country);
	}
}