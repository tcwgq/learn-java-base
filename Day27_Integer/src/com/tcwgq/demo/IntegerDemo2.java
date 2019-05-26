package com.tcwgq.demo;

/**
 * public static int parseInt(String s):将字符串参数作为有符号的十进制整数进行解析。
 * public static int parseInt(String s, int radix):使用第二个参数指定的基数，将字符串参数解析为有符号的整数。
 */
public class IntegerDemo2 {
	public static void main(String[] args) {
		System.out.println(Integer.parseInt("100"));
		System.out.println(Integer.parseInt("100", 2));
	}
}
