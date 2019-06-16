package com.tcwgq.test;
/**
 * 字符串反转
 */
public class StringBufferTest2 {
	public static void main(String[] args) {
		String s = "helloworld";
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		String ss = sb.toString();
		System.out.println(ss);
		System.out.println(new StringBuffer(s).reverse().toString());//链式编程
	}
}
