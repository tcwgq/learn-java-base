package com.tcwgq.demo2;

/**
 * 链式编程，对象调用方法再调用方法再调用方法...
 * 特点： 对象每次调用方法后，返回的是一个对象
 */
public class ChainedProgrammeDemo {
	public static void main(String[] args) {
		StudentDemo sd = new StudentDemo();
		Student s = sd.getStudent();
		s.show();
		System.out.println("--------------");
	}
}

class Student {
	public void show() {
		System.out.println("Good good study, day day up !");
	}
}

class StudentDemo {
	public Student getStudent() {
		return new Student();
	}
}
