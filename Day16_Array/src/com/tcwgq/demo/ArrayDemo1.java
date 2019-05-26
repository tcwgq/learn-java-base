package com.tcwgq.demo;

/**
 * 动态初始化：初始化时只指定数组长度，由系统为数组分配初始值。
 * 格式：数据类型[] 数组名 = new 数据类型[数组长度];
 * 数组长度其实就是数组中元素的个数。 
 * 举例： int[] arr = new int[3];
 * 解释：定义了一个int类型的数组，这个数组中可以存放3个int类型的值。
 */
public class ArrayDemo1 {
	public static void main(String[] args) {
//		int[] a;
//		System.out.println(a);//错误，a没有初始化
		int[] b = new int[5];
		System.out.println(b);//[I@2a139a55，int类型的数组
		System.out.println(b[0]);//0，系统给定默认值0
		System.out.println(b[1]);//0
		System.out.println(b[2]);//0
		System.out.println(b[3]);//0
		System.out.println(b[4]);//0
		int[] array = new int[3];//0
		for(int i = 0; i < 3; i++){
			array[i] = i;
		}
		for(int i : array){
			System.out.println(i);
		}
	}

}
