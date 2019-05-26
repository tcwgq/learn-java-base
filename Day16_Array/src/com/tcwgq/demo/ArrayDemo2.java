package com.tcwgq.demo;

/**
 * 定义一个数组，输出数组名及元素。然后给数组中的元素赋值，再次输出数组名及元素。
 */
public class ArrayDemo2 {
	public static void main(String[] args) {
		int[] a = new int[3];
		System.out.println(a);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("--------");
		a[0] = 1;
		a[2] = 3;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
	}

}
