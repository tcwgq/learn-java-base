package com.tcwgq.demo;

public class ReflectDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		// 方式一
		Person p1 = new Person();
		Class<?> c1 = p1.getClass();
		Person p2 = new Person();
		Class<?> c2 = p2.getClass();
		System.out.println(p1 == p2);
		System.out.println(c1 == c2);
		// 方式二
		Class<?> c3 = Person.class;
		System.out.println(c1 == c3);
		System.out.println(int.class);
		System.out.println(String.class);
		// 方式三
		Class<?> c4 = Class.forName("com.tcwgq.demo.Person");
		// 此处必须写为类的带包名称
		System.out.println(c1 == c4);
	}
}
