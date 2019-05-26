package com.tcwgq.demo;

/**
 * 构造方法作用概述 
 * 给对象的数据进行初始化 
 * 构造方法格式 方法名与类名相同 
 * 没有返回值类型，连void都没有 
 * 没有具体的返回值 
 * 构造方法注意事项
 * 如果你不提供构造方法，系统会给出默认构造方法 
 * 如果你提供了构造方法，系统将不再提供 
 * 构造方法也是可以重载的
 */
class ConstructorDemo {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s);//com.tcwgq.demo.Student@2a139a55
		System.out.println(s.getName() + "--" + s.getAge());
		s.setName("Hello");
		s.setAge(10);
		System.out.println(s.getName() + "--" +s.getAge());
	}
}

class Student {
	private String name;
	private int age;
	public Student(){
		System.out.println("无参构造方法");
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
	
}
