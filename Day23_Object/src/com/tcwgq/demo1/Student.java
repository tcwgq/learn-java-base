package com.tcwgq.demo1;

public class Student {
	private String name;
	private int age;
	
	public Student() {
		super();
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
//	@Override
//	public String toString(){
////		return super.toString();//跟没重写一样
////		return "HelloWorld";//没有意义
////		return name + age;//返回姓名和年龄，这样不够好
//		return "姓名：" + name + ", " + "年龄：" + age;
//	}
//	
	//自动生成
	
}
