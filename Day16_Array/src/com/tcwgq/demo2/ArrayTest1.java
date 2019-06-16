package com.tcwgq.demo2;

/**
 * 数组获取最值(获取数组中的最大值最小值)
 */
public class ArrayTest1 {
	public static void main(String[] args) {
		int[] a = { 1, 3, 6, 2, 0, 5, 19, 45, 23, 4 };
		int min = a[0];
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("最大值：" + max);
		System.out.println("最小值：" + min);
	}

}
