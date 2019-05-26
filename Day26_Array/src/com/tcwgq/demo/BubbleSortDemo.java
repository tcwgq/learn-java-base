package com.tcwgq.demo;

/**
 * 冒泡排序：从小到大排序或者从大到小排序。 
 * 从小到大排序：相邻的两个元素相互比较，大的就往后放。
 * 从大到小排序: 相邻的两个元素相互比较，小的就往后放。
 * 总的比较次数为数组的长度-1。
 */
public class BubbleSortDemo {
	public static void main(String[] args) {
		// 从小到大排序
		int[] arr = { 5, 9, 3, 1, 0, 12, -3, 8, 9, 25 };
		bubbleSort1(arr);
		traverse(arr);
	}

	public static void traverse(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
	}
	
	public static void bubbleSort1(int[] arr){//从小到大排序
		for (int i = 0; i < arr.length - 1; i++) {//外层循环控制比较次数
			for (int j = 0; j < arr.length - 1 - i; j++) {//内层循环控制相邻两个元素比较
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	
	public static void bubbleSort2(int[] arr){//从大到小排序
		for (int i = 0; i < arr.length - 1; i++) {//外层循环控制比较次数
			for (int j = 0; j < arr.length - 1 - i; j++) {//内层循环控制相邻两个元素比较
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
