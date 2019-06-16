package com.tcwgq.test;

/**
 * StringBuffer与String的相互转换
 */
public class StringBufferTest {
	public static void main(String[] args) {
		//String --> StringBuffer
		String s = "hello";
//		StringBuffer sb = "hello";//Type mismatch: cannot convert from String to StringBuffer
//		StringBuffer sb = s;//Type mismatch: cannot convert from String to StringBuffer
		//方式一，通过构造方法
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb);
		//方式二，通过append方法
		StringBuffer sb1 = new StringBuffer();
		sb1.append(s);
		System.out.println(sb1);
		System.out.println("---------------------");
		//StringBuffer --> String
		StringBuffer sb2 = new StringBuffer("world");
		//通过String的构造方法：String(StringBuffer buffer)
		String s1 = new String(sb2);
		System.out.println(s1);
		//方式二， 通过StringBuffer的toString方法
		String s2 = sb2.toString();
		System.out.println(s2);
	}
}
