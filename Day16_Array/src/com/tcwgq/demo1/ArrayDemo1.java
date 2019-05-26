package com.tcwgq.demo1;

/**
 * 数组操作中常见的两个小问题：
 * 数组索引越界
 * ArrayIndexOutOfBoundsException 访问到了数组中的不存在的索引时发生。 
 * 空指针异常
 * NullPointerException 数组引用没有指向实体，却在操作实体中的元素时。
 */
public class ArrayDemo1 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3};
//		System.out.println(a[3]);//java.lang.ArrayIndexOutOfBoundsException
		a = null;
//		System.out.println(a[0]);//java.lang.NullPointerException
	}

}
