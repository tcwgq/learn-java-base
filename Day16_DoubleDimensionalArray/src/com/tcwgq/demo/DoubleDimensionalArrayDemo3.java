package com.tcwgq.demo;

/**
 * 格式3 
 * 数据类型[][] 变量名 = new 数据类型[][]{{元素…},{元素…},{元素…}}; 
 * 简化版格式： 数据类型[][] 变量名 = {{元素…},{元素…},{元素…}}; 
 * 举例： int[][] arr = {{1,2,3},{4,6},{6}};
 * 
 * 注意：不要两种初始化方式都使用！
 * 数据类型[][] 变量名 = new 数据类型[3][2]{{元素…},{元素…},{元素…}}; //错误
 * 数据类型[][] 变量名 = new 数据类型[3][]{{元素…},{元素…},{元素…}}; //错误
 * 数据类型[][] 变量名 = new 数据类型[][2]{{元素…},{元素…},{元素…}}; //错误
 * 上面三种都提示错误：
 * Cannot define dimension expressions when an array initializer is provided
 */
public class DoubleDimensionalArrayDemo3 {
	public static void main(String[] args) {
		int[][] a = new int[][]{{1, 2, 3}, {4, 5, 6, 7}, {0, 3}};
		//遍历二维数组
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][2]);
		System.out.println(a[1][3]);
		System.out.println(a[2][0]);
		System.out.println(a[2][1]);
//		System.out.println(a[2][2]);//java.lang.ArrayIndexOutOfBoundsException
		int[][] b = {{0}, {1, 3}, {5, 9}, {11, 15, 19}};
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				System.out.println(a[i][j]);
			}
		}
		System.out.println("-----------");
		for(int i = 0; i < b.length; i++){
			for(int j = 0; j < b[i].length; j++){
				System.out.println(b[i][j]);
			}
		}
	}
}
