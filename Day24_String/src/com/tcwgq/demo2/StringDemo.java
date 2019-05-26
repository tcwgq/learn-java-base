package com.tcwgq.demo2;

/**
 * String类的判断功能： 
 * boolean equals(Object obj)：这个不说了
 * boolean equalsIgnoreCase(String str)：忽略大小写比较是否相同
 * boolean contains(CharSequence s)：判断是否包含指定串
 * boolean startsWith(String str)：判断是否以指定串开始
 * boolean endsWith(String str)：判断是否以指定串结束
 * boolean isEmpty()：判断是否为空
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1 = "helloworld";
		String s2 = "HELLOWORLD";
		String s3 = "HelloWorld";
		String s4 = "helloworld";
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.contains("hello"));
		CharSequence cs = "hello";
		System.out.println(s1.contains(cs));
		System.out.println(s1.contains("hw"));
		System.out.println(s1.startsWith("hello"));
		System.out.println(s1.endsWith("rld"));
		System.out.println(s1.isEmpty());
		
		String s5 = "";
		System.out.println(s5.isEmpty());
//		String s6 = null;
//		System.out.println(s6.isEmpty());//NullPointerException
	}
}
