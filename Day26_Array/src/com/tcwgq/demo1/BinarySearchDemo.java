package com.tcwgq.demo1;

/**
 * 前提：数组查找之前有序！
 * 注意：
 * 下面这种做法是有问题的。
 * 因为数组本身是无序的，所以这种情况下的查找不能使用二分查找。
 * 所以你先排序了，但是你排序的时候已经改变了我最原始的元素索引。
 * 如果排序后的数组中包含多个带有指定值的元素，则无法保证找到的是哪一个。
 */
public class BinarySearchDemo {
	public static void main(String[] args) {
		int[] arr = { 5, 9, 3, 1, 0, 12, -3, 8, 9, 25 };
		selectionSort(arr);
		traverse(arr);
		// [-3, 0, 1, 3, 5, 8, 9, 9, 12, 25]
		int i = binarySearch(arr, 9);
		System.out.println(i);
	}

	public static int binarySearch(int[] arr, int num) {
		int index = -1;
		for (int begin = 0, end = arr.length - 1; begin <= end;) {
			int middle = (begin + end) / 2;
			if (num > arr[middle]) {
				begin = middle + 1;
			} else if (num < arr[middle]) {
				end = middle - 1;
			} else {
				index = middle;
				break;
			}
		}
		return index;
	}

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
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
		System.out.println();
	}
}
