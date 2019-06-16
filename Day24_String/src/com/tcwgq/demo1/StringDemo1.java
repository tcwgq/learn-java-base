package com.tcwgq.demo1;

/**
 * 面试题: String s = new String(“hello”)和String s = “hello”;的区别?
 * 有，前者创建两个对象，后者创建一个对象
 * ==:
 * 基本类型：比较的是值
 * 引用类型：比较的是地址值
 * equals：
 * 只能比较引用类型，默认比较的是地址值，重写后可以比较值
 */
public class StringDemo1 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";
		System.out.println(s1 == s2);//false
		System.out.println(s1.equals(s2));//true
	}
}
