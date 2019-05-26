package com.tcwgq.demo1;

import java.util.Scanner;

/**
 * 方法重载的特点： 
 * 与返回值类型无关，只看方法名和参数列表 在调用时，
 * 虚拟机通过参数列表的不同来区分同名方法
 */
public class MethodDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		System.out.println(sum(a, b));
		System.out.println(sum(a, b, c));
		System.out.println(sum(a, b, c, d));
		sc.close();
	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static int sum(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	public static int sum(int a, String s) {
		return a + s.length();
	}

}
