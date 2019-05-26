package com.tcwgq.test1;

/**
 * 数组转化为字符串使用方法改进版
 */
public class StringTest1 {
	public static void main(String[] args) {
		// 前提是数组已经存在
		int[] arr = { 1, 2, 3 };
		// 写一个功能，实现结果
		String result = arrayToString(arr);
		System.out.println("最终结果是：" + result);
	}

	public static String arrayToString(int[] arr) {
		// 定义一个字符串
		String s = "";
		// 先把字符串拼接一个"["
		s += "[";
		// 遍历int数组，得到每一个元素
		for (int x = 0; x < arr.length; x++) {
			// 先判断该元素是否为最后一个
			if (x == arr.length - 1) {
				// 就直接拼接元素和"]"
				s += arr[x];
				s += "]";
			} else {
				// 就拼接元素和逗号以及空格
				s += arr[x];
				s += ", ";
			}
		}
		return s;
	}
}
