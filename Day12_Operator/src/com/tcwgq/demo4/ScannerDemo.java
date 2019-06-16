package com.tcwgq.demo4;

import java.util.Scanner;

/**
 * 键盘录入数据
 */
public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a);
		sc.close();
	}
}
