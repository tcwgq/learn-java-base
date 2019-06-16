package com.tcwgq.demo1;

/**
 * 比较运算符： ==, !=, >, <, >=, <=, instanceof 运算的结果都是Boolean类型
 */
public class OperatorDemo {
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= 5);
		System.out.println(b <= 10);
		System.out.println("hello" instanceof String);
		User user = new User("tcwgq", "112113");
		System.out.println(user instanceof User);
		boolean flag = (a == b);
		System.out.println(flag);
//		boolean fg = (a = b);//把==误写成=，出现错误
//		System.out.println(fg);
		int c = a = b;
		System.out.println(a);
		System.out.println(c);
	}

}
