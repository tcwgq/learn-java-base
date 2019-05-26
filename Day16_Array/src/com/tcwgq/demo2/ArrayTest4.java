package com.tcwgq.demo2;

import java.util.Scanner;

/**
 * 数组元素查找(查找指定元素第一次在数组中出现的索引)
 */
public class ArrayTest4 {
	public static void main(String[] args) {
		int[] a = { 4, 2, 9, 0, 5, 1, 29, 67, 0, 1, 2, 23, 90 };
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int flag = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == num) {
				flag = i;
				break;
			}
		}
		if (flag == -1) {
			System.out.println("您要查找的数据不存在");
		} else {
			System.out.println("您要查找的数据在数组中的索引为" + flag);
		}
		sc.close();
	}

}
