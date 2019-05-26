package com.tcwgq.demo2;

import java.util.Scanner;

/**
 * Scanner的注意事项： 
 * 对于常用的方法nextInt和nextLine，在先获取一个整数，再获取一个字符串时，出现问题。
 * 原因是获取完整数后的换行符被nextLine接收 
 * 解决办法： 
 * A:先获取一个数值后，在创建一个新的键盘录入对象获取字符串。
 * B:把所有的数据都先按照字符串获取，然后要什么，你就对应的转换为什么。
 */
public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 获取两个int类型的值
		// int a = sc.nextInt();
		// int b = sc.nextInt();
		// System.out.println("a:" + a + ",b:" + b);
		// System.out.println("-------------------");
		// 获取两个String类型的值
		// String s1 = sc.nextLine();
		// String s2 = sc.nextLine();
		// System.out.println("s1:" + s1 + ",s2:" + s2);
		// System.out.println("-------------------");
		// 先获取一个字符串，在获取一个int值
		// String s1 = sc.nextLine();
		// int b = sc.nextInt();
		// System.out.println("s1:" + s1 + ",b:" + b);
		// System.out.println("-------------------");
		// 先获取一个int值，在获取一个字符串，出现问题了
		// int a = sc.nextInt();
		// String s2 = sc.nextLine();
		// System.out.println("a:" + a + ",s2:" + s2);
		// System.out.println("-------------------");
		int a = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		String s = sc1.nextLine();
		System.out.println("a:" + a + ",s:" + s);
		sc.close();
		sc1.close();
	}
}
