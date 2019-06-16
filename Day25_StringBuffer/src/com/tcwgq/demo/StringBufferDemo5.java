package com.tcwgq.demo;
/**
 * StringBuffer的反转功能：
 * public StringBuffer reverse()：将此字符序列用其反转形式取代。
 */
public class StringBufferDemo5 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Hello").append("World");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}
