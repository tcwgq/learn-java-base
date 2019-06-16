package com.tcwgq.demo1;
/**
 * 返回值类型：
 * 		基本类型：太简单，不讲
 * 		引用类型：
 * 			类：返回的是该类的对象
 * 			抽象类：
 * 			接口：
 */
class FormalParameterDemo {
	public static void main(String[] args) {
		StudentDemo sd = new StudentDemo();
		Student s = sd.getStudent();
		s.show();
	}
}

class Student {
	public void show() {
		System.out.println("Good good study, day day up !");
	}
}

class StudentDemo {
	public Student getStudent(){
//		Student s = new Student();
//		return s;
		return new Student();
	}
}
