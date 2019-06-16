package com.tcwgq.demo;

/**
 * 常用的基本进制转换 
 * public static String toBinaryString(int i):以二进制（基数 2）无符号整数形式返回一个整数参数的字符串表示形式。
 * public static String toOctalString(int i):以八进制（基数 8）无符号整数形式返回一个整数参数的字符串表示形式。
 * public static String toHexString(int i):以十六进制（基数 16）无符号整数形式返回一个整数参数的字符串表示形式。
 * 十进制到其他进制 
 * public static String toString(int i,int radix):返回用第二个参数指定基数表示的第一个参数的字符串表示形式。
 * 由这个我们也看到了进制的范围：2-36 为什么呢?0,...9,a...z
 * 其他进制到十进制 
 * public static int parseInt(String s,int radix):使用第二个参数指定的基数，将字符串参数解析为有符号的整数。
 */
public class IntegerDemo5 {
	public static void main(String[] args) {
		//// 十进制到二进制，八进制，十六进制
		System.out.println(Integer.toBinaryString(100));
		System.out.println(Integer.toOctalString(100));
		System.out.println(Integer.toHexString(100));
		System.out.println("-------------------------");
		// 十进制到其他进制
		System.out.println(Integer.toString(100, 10));
		System.out.println(Integer.toString(100, 2));
		System.out.println(Integer.toString(100, 8));
		System.out.println(Integer.toString(100, 16));
		System.out.println(Integer.toString(100, 5));
		System.out.println(Integer.toString(100, 7));
		System.out.println(Integer.toString(100, -7));
		System.out.println(Integer.toString(100, 70));
		System.out.println(Integer.toString(100, 1));
		System.out.println(Integer.toString(100, 17));
		System.out.println(Integer.toString(100, 32));
		System.out.println(Integer.toString(100, 37));
		System.out.println(Integer.toString(100, 36));
		System.out.println("-------------------------");
		//其他进制到十进制
		System.out.println(Integer.parseInt("100", 2));
		System.out.println(Integer.parseInt("100", 8));
		System.out.println(Integer.parseInt("100", 16));
		System.out.println(Integer.parseInt("100", 10));
		System.out.println(Integer.parseInt("100", 27));
//		System.out.println(Integer.parseInt("123", 2));//NumberFormatException
	}
}
