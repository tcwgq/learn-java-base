package com.tcwgq.demo2;

/**
 * 成员方法其实就是我们前面讲过的方法 
 * 方法具体划分： 
 * 	根据返回值 
 * 		有明确返回值方法 
 * 		返回void类型的方法 
 * 	根据形式参数 
 * 		无参方法 
 * 		带参方法
 */
public class Student {
	private String name;
	private int age;

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
	public void show(){
		System.out.println(name + "--" + age);
	}
	public void method(String name, int age){
		System.out.println(name + "--" + age);
	}
	
}
