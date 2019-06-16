package com.tcwgq.demo4;

import java.util.Scanner;

import org.junit.Test;

/**
 *  键盘录入练习：
 *  键盘录入两个数据，并对这两个数据求和，输出其结果
	键盘录入两个数据，获取这两个数据中的最大值
	键盘录入三个数据，获取这三个数据中的最大值
	键盘录入两个数据，比较这两个数据是否相等
 */
public class ScannerTest {
	@Test
	public void fun(){
		//键盘录入两个数据，并对这两个数据求和，输出其结果
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a + b;
		System.out.println(sum);
		sc.close();
	}
	
	@Test
	public void fun1(){
		//键盘录入两个数据，获取这两个数据中的最大值
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max =  a > b ? a : b;
		System.out.println(max);
		sc.close();
	}

}
