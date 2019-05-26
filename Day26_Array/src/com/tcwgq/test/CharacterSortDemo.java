package com.tcwgq.test;

/**
 * 把字符串中的字符进行排序。 举例：”dacgebf” 结果：”abcdefg”
 */
public class CharacterSortDemo {
	public static void main(String[] args) {
		String s = "dacgebf";
		char[] chs = s.toCharArray();
		// bubbleSort(chs);
		// String ss = String.valueOf(chs);
		// String ss = new String(chs);
		selectionSort(chs);
//		String ss = String.valueOf(chs);
		String ss = new String(chs);
		System.out.println(ss);
	}

	public static void bubbleSort(char[] arr) {// 从小到大排序
		for (int i = 0; i < arr.length - 1; i++) {// 外层循环控制比较次数
			for (int j = 0; j < arr.length - 1 - i; j++) {// 内层循环控制相邻两个元素比较
				if (arr[j] > arr[j + 1]) {
					char temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void selectionSort(char[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
