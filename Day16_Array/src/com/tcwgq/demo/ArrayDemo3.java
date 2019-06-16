package com.tcwgq.demo;

/**
 * 定义两个数组，分别输出数组名及元素。
 * 然后分别给数组中的元素赋值，分别再次输出数组名及元素。
 */
public class ArrayDemo3 {
	public static void main(String[] args) {
		int[] a = new int[2];
		System.out.println(a);
		System.out.println(a[0]);
		System.out.println(a[1]);
		a[0] = 1;
		a[1] = 2;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println("-----------");
		char[] chs = new char[3];
		System.out.println(chs);
		System.out.println(chs[0]);
		System.out.println(chs[1]);
		System.out.println(chs[2]);
		chs[0] = 'a';
		chs[2] = 'c';
		System.out.println(chs[0]);
		System.out.println(chs[1]);
		System.out.println(chs[2]);
		
	}
}
