package com.tcwgq.demo2;

/**
 * 数组遍历(依次输出数组中的每一个元素)
 * length:专门用于获取数组的长度
 */
public class ArrayTest {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		System.out.println(a);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println("--------");
		System.out.println(a.length);//获取数组长度
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
}
