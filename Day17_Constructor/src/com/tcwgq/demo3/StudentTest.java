package com.tcwgq.demo3;

public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s);
		s.show();
		s.setName("aaa");
		s.setAge(20);
		s.show();
		System.out.println("------------");
		Student s1 = new Student("bbb", 55);
		s1.show();
	}
}
