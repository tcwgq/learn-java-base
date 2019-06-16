package com.tcwgq.test;

import java.util.Scanner;

/**
 * 需求：请设计一个方法，可以实现获取任意范围内的随机数。
 */
public class MathTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		// int num = (int) (Math.random() * 100) + 1;// 1-100之间的随机数
		// int num1 = (int) (Math.random() * end) + start;//不正确
		// int num2 = (int) (Math.random() * (end - start + 1)) + start;
		for (int i = 0; i < 100; i++) {
			int num2 = (int) (Math.random() * (end - start + 1)) + start;
			System.out.println(num2);
		}
		sc.close();
	}
}
