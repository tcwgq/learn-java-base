package com.tcwgq.demo2;

public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("aaa");
		s.setAge(30);
		System.out.println(s.getName());
		System.out.println(s.getAge());
		s.show();
		s.method("bbb", 55);
	}
}
