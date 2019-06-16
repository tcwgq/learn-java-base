package com.tcwgq.demo2;

import java.util.Scanner;

public class EncodeDemo1 {
	public static void main(String[] args) {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		// 请输入一个数据
		System.out.println("请输入一个数据(小于8位)：");
		int number = sc.nextInt();

		// 写功能实现把number进行加密
		// 调用
		String result = encode(number);
		System.out.println("加密后的结果是：" + result);
		sc.close();
	}

	/*
	 * 需求：写一个功能，把数据number实现加密。 两个明确： 返回值类型：String 做一个字符串的拼接。 参数列表：int number
	 */
	public static String encode(int number) {
		// 定义数组
		int[] arr = new int[8];

		// 定义索引
		int index = 0;

		// 把number中的数据想办法放到数组中
		while (number > 0) {
			arr[index] = number % 10;
			index++;
			number /= 10;
		}

		// 把每个数据加5，然后对10取得余数
		for (int x = 0; x < index; x++) {
			arr[x] += 5;
			arr[x] %= 10;
		}

		// 把第一位和最后一位交换
		int temp = arr[0];
		arr[0] = arr[index - 1];
		arr[index - 1] = temp;

		// 把数组的元素拼接成一个字符串返回
		// 定义一个空内容字符串
		String s = "";

		for (int x = 0; x < index; x++) {
			s += arr[x];
		}

		return s;
	}
}
