package com.tcwgq.demo;
/**
 * 程序执行结果：
 * CodeBlockTest 静态代码块
 * main 方法
 * Student 静态代码块
 * Student 构造代码块
 * Student 无参构造方法
 * Student 构造代码块
 * Student 无参构造方法
 */
public class CodeBlockTest {
	static {
		System.out.println("CodeBlockTest 静态代码块");
	}

	public static void main(String[] args) {
		System.out.println("main 方法");
		new Student();
		new Student();
	}
}

class Student {
	static {
		System.out.println("Student 静态代码块");
	}

	{
		System.out.println("Student 构造代码块");
	}

	public Student() {
		System.out.println("Student 无参构造方法");
	}
}
