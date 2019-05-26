package com.tcwgq.demo;

import java.util.Scanner;

/**
 * 键盘录入两个数据，返回两个数中的较大值 
 * 键盘录入两个数据，比较两个数是否相等 
 * 键盘录入三个数据，返回三个数中的最大值
 */
public class MethodDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(fun1(a, b));
		System.out.println(fun2(a, b));
		System.out.println(fun3(a, b, c));
		sc.close();
	}
	
	public static int fun1(int a, int b) {
		return a > b ? a : b;

	}

	
	public static boolean fun2(int a, int b) {
		return a == b;
	}

	
	public static int fun3(int a, int b, int c) {
		return (a > b ? a : b) > c ? (a > b ? a : b) : c;
	}

}
