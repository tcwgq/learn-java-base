package com.tcwgq.demo;
/**
 * =运算符
 * =, +=, -=, *=, /=, %=...
 * =为基本的赋值运算符，其他的为扩展的赋值运算符
 */
public class OperatorDemo3 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a + b);
		System.out.println(a+=10);
		System.out.println(b-=20);
		System.out.println(a*=10);
		System.out.println(a/=10);
		System.out.println(a%=3);
	}

}
