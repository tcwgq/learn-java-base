package com.tcwgq.demo2;

import java.util.Arrays;

/**
 * Arrays: 此类包含用来操作数组（比如排序和搜索）的各种方法。 
 * 此类还包含一个允许将数组作为列表来查看的静态工厂。 
 * 里面的方法都是静态方法。
 * 
 * public static String toString(int[] a):返回指定数组内容的字符串表示形式。
 * public static void sort(int[] a):对指定的int型数组按数字升序进行排序。该排序算法是一个经过调优的快速排序法。
 * public static int binarySearch(int[] a,int key):使用二分搜索法来搜索指定的int型数组，以获得指定的值。
 * 必须在进行此调用之前对数组进行排序（通过 sort(int[]) 方法）。
 * 如果没有对数组进行排序，则结果是不确定的。如果数组包含多个带有指定值的元素，则无法保证找到的是哪一个。 
 */
public class ArraysDemo {
	public static void main(String[] args) {
		int[] arr = { 24, 69, 80, 57, 13 };
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		//[13, 24, 57, 69, 80]
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr, 57));//2
		System.out.println(Arrays.binarySearch(arr, 577));//-6
	}
}
