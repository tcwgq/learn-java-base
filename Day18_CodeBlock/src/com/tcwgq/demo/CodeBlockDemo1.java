package com.tcwgq.demo;

/**
 * 构造代码块 在类中方法外出现； 
 * 多个构造方法方法中相同的代码存放到一起，每次调用构造都执行，并且在构造方法前执行
 */
public class CodeBlockDemo1 {
	public static void main(String[] args) {
		CodeBlock cb = new CodeBlock();
		System.out.println(cb.getAge());
		CodeBlock cb1 = new CodeBlock(10, 20);
		System.out.println(cb1.getAge());
	}
}

class CodeBlock {
	private int age;

	{
		age = 27;
	}

	public CodeBlock() {
		// age = 27;
		// 两个构造函数有相同的代码，提取出来，使用构造代码块
	}

	public CodeBlock(int a, int b) {
		// age = 27;
		// 两个构造函数有相同的代码，提取出来，使用构造代码块
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
