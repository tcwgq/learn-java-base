package com.tcwgq.demo1;

/**
 * String的特点：一旦被赋值，就不能改变
 * 面试题：
 * 字符串是常量,它的值在创建之后不能更改
 * String s = “hello”; s += “world”; 问s的结果是多少?
 */
public class StringDemo {
	public static void main(String[] args) {
		String s = "hello";
		s += "world";
		System.out.println(s);// helloworld
	}
}
