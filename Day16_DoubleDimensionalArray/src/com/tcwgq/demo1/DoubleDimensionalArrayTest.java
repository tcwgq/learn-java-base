package com.tcwgq.demo1;

/**
 * 二维数组的遍历：
 * 数组值arr[x][y]表示指定的是第x行第y列的值。 
 * 在使用二维数组对象时，注意length所代表的长度，
 * 数组名后直接加上length(如arry.length)，所指的是有几行(Row)；
 * 指定索引后加上length(如arry[0].length)，指的是该行所拥有的元素，也就是列(Column)数目。
 */
public class DoubleDimensionalArrayTest {
	public static void main(String[] args) {
		int[][] a = new int[][] { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 0, 3 } };
		// 遍历二维数组
		System.out.println(a[0][0]);//原始的遍历方法
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][2]);
		System.out.println(a[1][3]);
		System.out.println(a[2][0]);
		System.out.println(a[2][1]);
		// System.out.println(a[2][2]);//java.lang.ArrayIndexOutOfBoundsException
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}
		
	}
}
