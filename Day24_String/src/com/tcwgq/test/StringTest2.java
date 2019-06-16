package com.tcwgq.test;

/**
 * 遍历获取字符串中的每一个字符 
 * 使用String类的char charAt(int index)方法
 */
public class StringTest2 {
	public static void main(String[] args) {
		String s = "HelloWorld";
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}
}
