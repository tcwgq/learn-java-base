package com.tcwgq.demo;

/**
 * private最常见的应用： 
 * 把成员变量用private修饰 
 * 提供对应的getXxx()/setXxx()方法 
 * 一个标准的案例的使用
 */
class PrivateDemo1 {
	public static void main(String[] args) {
		Student1 s = new Student1();
//		System.out.println(s.name + "--" + s.age);//错误，不能直接访问成员变量
		s.setName("林青霞");
		s.setAge(27);
		System.out.println(s.getName() + "--" + s.getAge());
	}
}

class Student1 {
	private String name;
	private int age;
	public String getName(){
		return name;
	}
	public void setName(String sname){
		name = sname;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int sage){
		age = sage;
	}
}