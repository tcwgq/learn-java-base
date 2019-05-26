package com.tcwgq.demo1;

class ArrayDemo {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 6, 19, 0, 15, 20 };
		ArrayTool.printArray(arr);
		System.out.println(ArrayTool.getMax(arr));
		System.out.println(ArrayTool.getMin(arr));
		System.out.println(ArrayTool.getIndex(arr, 19));

	}
}
