package com.tcwgq.demo1;

/**
 * 比较两个数据是否相等。
 * 参数类型分别为两个byte类型，两个short类型，
 * 两个int类型，两个long类型，并在main方法中进行测试
 */
public class MethodDemo1 {
	public static void main(String[] args) {
		System.out.println(isEquals(10, 5));
		System.out.println(isEquals(10, 5));
		System.out.println(isEquals(12, 3));
		System.out.println(isEquals(100000000000000L, 500000000000000L));
		
	}
	
	public static boolean isEquals(byte a, byte b){
		return a == b;
	}
	public static boolean isEquals(short a, short b){
		return a == b;
	}
	public static boolean isEquals(int a, int b){
		return a == b;
	}
	public static boolean isEquals(long a, long b){
		return a == b;
	}

}
