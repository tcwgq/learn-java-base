package com.tcwgq.demo;
/**
 * StringBuffer的构造方法：
 * public StringBuffer()：构造一个其中不带字符的字符串缓冲区，其初始容量为16个字符。
 * public StringBuffer(int capacity)：构造一个不带字符，但具有指定初始容量的字符串缓冲区。
 * public StringBuffer(String str)：构造一个字符串缓冲区，并将其内容初始化为指定的字符串内容。
 * 该字符串的初始容量为16加上字符串参数的长度。
 * public StringBuffer(CharSequence seq)：构造一个字符串缓冲区，它包含与指定的CharSequence相同的字符。
 * 该字符串缓冲区的初始容量为16加上 CharSequence参数的长度。
 * 
 * 两个与长度相关的方法：
 * public int capacity()：返回当前容量。容量指可用于最新插入的字符的存储量，超过这一容量就需要再次进行分配。
 * public int length()：返回长度（字符数）。
 */
public class StringBufferDemo1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb);//重写了toString方法
		System.out.println(sb.capacity());//16
		System.out.println(sb.length());//0
		StringBuffer sb1 = new StringBuffer(20);
		System.out.println(sb1.capacity());//20
		System.out.println(sb1.length());//0
		StringBuffer sb2 = new StringBuffer("HelloWorld");
		System.out.println(sb2);//HelloWorld
		System.out.println(sb2.capacity());//26
		System.out.println(sb2.length());//10
	}
}
