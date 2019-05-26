package com.tcwgq.demo3;

/**
 * 三目运算符：表达式? 表达式1:表达式2 表达式为true时，取表达式1的值 表达式为false时，取表达式2的值
 */
public class OperatorDemo {
	public static void main(String[] args) {
		//获取两个整数中的最大值
		int a = 10;
		int b = 20;
		int c = b > a ? b : a;
		System.out.println(c);
	}

}
