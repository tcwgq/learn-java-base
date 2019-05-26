package com.tcwgq.demo2;

/**
 * 数组元素逆序 (就是把元素对调)
 */
public class ArrayTest2 {
	public static void main(String[] args) {
		int[] a = { 3, 6, 2, 7, 9, 0, 1, 15, 24};
		for (int i = 0; i < a.length; i++) {
			if (i == a.length - 1) {
				System.out.println(a[i]);
			} else {
				System.out.print(a[i] + ", ");
			}
		}
		for (int i = 0, j = a.length - 1; i < a.length / 2; i++, j--) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		for (int i = 0; i < a.length; i++) {
			if (i == a.length - 1) {
				System.out.println(a[i]);
			} else {
				System.out.print(a[i] + ", ");
			}
		}
	}
	
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int x=0; x<arr.length; x++) {
			if(x == arr.length-1) { //这是最后一个元素
				System.out.println(arr[x]+"]");
			}else {
				System.out.print(arr[x]+", ");
			}
		}
	}
	
	public static void reverse(int[] arr) {
		/*
		//第一次交换
		int temp = arr[0];
		arr[0] = arr[arr.length-1-0];
		arr[arr.length-1-0] = temp;
		
		//第二次交换
		int temp = arr[1];
		arr[1] = arr[arr.length-1-1];
		arr[arr.length-1-1] = temp;
		
		//第三次交换
		int temp = arr[2];
		arr[2] = arr[arr.length-1-2];
		arr[arr.length-1-2] = temp;
		*/
		//用循环改进
		for(int x=0; x<arr.length/2; x++) {
			int temp = arr[x];
			arr[x] = arr[arr.length-1-x];
			arr[arr.length-1-x] = temp;
		}
	}
	
	public static void reverse2(int[] arr) {
		for(int start=0,end=arr.length-1; start<=end; start++,end--) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
	}
	
}
