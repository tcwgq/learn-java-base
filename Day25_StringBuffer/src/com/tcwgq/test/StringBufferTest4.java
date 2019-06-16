package com.tcwgq.test;

/**
 * 面试题：
 * String,StringBuffer,StringBuilder的区别
 * String中的内容不可变，StringBuffer， StringBuilder中的内容可变。
 * StringBuffer是同步的，线程安全，效率低；StringBuilder不是同步的，线程不安全，效率高。
 * 
 * StringBuffer和数组的区别
 * 二者都可以看做是一个容器，可以装载其他类型的数据。
 * StringBuffer的数据最终是字符串数据
 * 数组可以放置任意类型的同一种数据
 * 
 * 形式参数问题
 * String作为参数传递
 * StringBuffer作为参数传递
 * 
 * 
 * 形式参数：
 * 		基本类型：形式参数的改变不影响实际参数
 * 		引用类型：形式参数的改变直接影响实际参数
 * 
 * 注意：
 * 		String作为参数传递，效果和基本类型作为参数传递是一样的。
 */
public class StringBufferTest4 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		System.out.println(s1 + "---" + s2);//hello---world
		change(s1, s2);
		System.out.println(s1 + "---" + s2);//hello---world

		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("world");
		System.out.println(sb1 + "---" + sb2);//hello---world
		change(sb1, sb2);
		System.out.println(sb1 + "---" + sb2);//world---worldworld
	}
	
	public static void change(StringBuffer sb1, StringBuffer sb2) {
		sb1 = sb2;//sb1=world
		sb2.append(sb1);//worldworld
	}

	public static void change(String s1, String s2) {
		s1 = s2;//s1=world
		s2 = s1 + s2;//s2=worldworld
	}
}
