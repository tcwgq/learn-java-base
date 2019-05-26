package com.tcwgq.demo;

/**
 * StringBuffer的截取功能： 
 * public String substring(int start):返回一个新的 String，它包含此字符序列当前所包含的字符子序列。该子字符串始于指定索引处的字符，一直到此字符串末尾。
 * public String substring(int start, int end):返回一个新的 String，它包含此序列当前所包含的字符子序列。该子字符串从指定的 start处开始，一直到索引 end - 1处的字符。
 */
public class StringBufferDemo6 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello").append("world");
		System.out.println(sb.substring(5));//world
		System.out.println(sb);
		System.out.println(sb.substring(3, 8));//lowor
		System.out.println(sb);//截取后，本身并没有发生改变
	}
}
