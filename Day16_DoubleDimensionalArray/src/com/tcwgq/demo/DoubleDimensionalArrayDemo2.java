package com.tcwgq.demo;

/**
 * 格式2 
 * 数据类型[][] 变量名 = new 数据类型[m][]; 
 * m表示这个二维数组有多少个一维数组
 * 这一次没有直接给出一维数组的元素个数，可以动态的给出。 
 * 举例： int[][] arr = new int[3][]; 
 * arr[0] = new int[2]; 
 * arr[1] = new int[3];
 * arr[2] = new int[1];
 */
public class DoubleDimensionalArrayDemo2 {
	public static void main(String[] args) {
		int[][] a = new int[3][];
		System.out.println(a);//[[I@2a139a55
		System.out.println(a[0]);//null
		System.out.println(a[1]);//null
		System.out.println(a[2]);//null
		a[0] = new int[2];
		a[1] = new int[3];
		a[2] = new int[4];
		System.out.println(a[0]);//[I@15db9742
		System.out.println(a[1]);//[I@6d06d69c
		System.out.println(a[2]);//[I@7852e922
		System.out.println(a[0][0]);//0
		System.out.println(a[0][1]);//0
//		System.out.println(a[0][2]);//java.lang.ArrayIndexOutOfBoundsException
	}
}
