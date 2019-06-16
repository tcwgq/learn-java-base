package com.tcwgq.demo;

/**
 * public int intValue():以 int类型返回该 Integer的值。
 * public static int parseInt(String s):将字符串参数作为有符号的十进制整数进行解析。
 * public static String toString(int i):返回一个表示指定整数的 String对象 
 * public static Integer valueOf(int i):返回一个表示指定的 int值的 Integer实例
 * public static Integer valueOf(String s):返回保存指定的 String的值的 Integer对象。
 */
public class IntegerDemo4 {
	public static void main(String[] args) {
		Integer i = new Integer(100);
		System.out.println(i.intValue());
		System.out.println(Integer.parseInt("100"));
		System.out.println(Integer.toString(200));
		System.out.println(Integer.valueOf(500));
		System.out.println(Integer.valueOf("12345"));
	}
}
