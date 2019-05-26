package com.tcwgq.demo;
/**
 * StringBuffer:线程安全的可变字符序列。
 * StringBuffer和String的区别？
 * 前者长度和内容可变，后者不可变，使用前者作字符串拼接，不会浪费太多资源。
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());//容量
		System.out.println(sb.length());//长度
	}
}
