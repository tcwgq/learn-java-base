package com.tcwgq.demo;

import java.util.Arrays;

/**
 * public static void arraycopy(Object src,int srcPos,Object dest,int
 * destPos,int length):从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
 */
public class SystemDemo3 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 11, 22, 33, 44, 55 };
		System.arraycopy(a, 0, b, 1, 2);
		// System.arraycopy(a, 0, b, 1, 3);
		// System.arraycopy(a, 0, b, 1, 4);
		// System.arraycopy(a, 0, b, 1, 5);//ArrayIndexOutOfBoundsException
		// System.arraycopy(a, 2, b, 1, 2);
		// System.arraycopy(a, 3, b, 1, 2);
		// System.arraycopy(a, 4, b, 1, 2);//ArrayIndexOutOfBoundsException
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}
