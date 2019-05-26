package com.tcwgq.demo;
/**
 * 形式参数：
 * 		基本类型：比较简单，不再讲解
 * 		引用类型：
 * 			类：匿名对象时已经讲过，传递的是该类的对象
 * 			抽象类：传递的是该抽象类具体子类的对象
 * 			接口：传递的是该接口具体实现子类的对象
 */
public class FormalParameterDemo {
	public static void main(String[] args) {
		Student s = new Student();
		s.show();
		System.out.println("------------");
		Student ss = new Student();
		StudentDemo t = new StudentDemo();
		t.show(ss);
		System.out.println("------------");
		new StudentDemo().show(new Student());
	}
}

class Student {
	public void show(){
		System.out.println("Good good study, day day up !");
	}
}

class StudentDemo {
	public void show(Student s){
		s.show();
	}
}