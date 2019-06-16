package com.tcwgq.demo;

/**
 * 二维数组： 数组的每一个元素是一维数组的数组 
 * 格式1： 
 * 数据类型[][] 变量名 = new 数据类型[m][n]; 
 * m表示这个二维数组有多少个一维数组
 * n表示每一个一维数组的元素个数 
 * 举例：
 * int[][] arr = new int[3][2]; 
 * 定义了一个二维数组arr
 * 这个二维数组有3个一维数组，名称是arr[0],arr[1],arr[2] 
 * 每个一维数组有2个元素，可以通过arr[m][n]来获取
 * 表示获取第m+1个一维数组的第n+1个元素
 * 
 * 注意：
 * A:这两种定义格式都可以
 * 		1.数据类型[][] 变量名 = new 数据类型[m][n]; 
 * 		2.数据类型[] 变量名[] = new 数据类型[m][n];
 * B:注意下面定义的区别：
 * 		int x;
 * 		int y;
 * 		int x, y;
 * 		
 * 		int[] x, y[];//定义了一个一维数组和一个二维数组
 * 		int[] x;//这是一个一维数组
 * 		int[] y[];//这是二维数组
 */
/**
   数组值arr[x][y]表示指定的是第x行第y列的值。
   在使用二维数组对象时，注意length所代表的长度，
   数组名后直接加上length(如arry.length)，所指的是有几行(Row)；
   指定索引后加上length(如arry[0].length)，指的是该行所拥有的元素，也就是列(Column)数目。
 */
public class DoubleDimensionalArrayDemo {
	public static void main(String[] args) {
		int[][] a = new int[2][3];
		System.out.println(a);//[[I@2a139a55
		System.out.println(a[0]);//[I@15db9742
		System.out.println(a[1]);//[I@6d06d69c
//		System.out.println(a[2]);//java.lang.ArrayIndexOutOfBoundsException
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		System.out.println(a.length);//指的是二维数组的行数
//		System.out.println(a[0][3]);//java.lang.ArrayIndexOutOfBoundsException
	}
}
