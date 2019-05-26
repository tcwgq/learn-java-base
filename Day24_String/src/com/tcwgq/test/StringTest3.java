package com.tcwgq.test;

/**
 * 需求：统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符) 
 * 举例： "Hello123World" 
 * 结果： 
 * 大写字符：2个
 * 小写字符：8个 
 * 数字字符：3个
 * 
 * 练习：把给定字符串的方式，改变为键盘录入的方式。
 */
public class StringTest3 {
	public static void main(String[] args) {
		String s = "Hello123World";
		int upperCount = 0;
		int lowerCount = 0;
		int numberCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				upperCount++;
			} else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				lowerCount++;
			} else {
				numberCount++;
			}
		}
		System.out.println("大写字符：" + upperCount + "个");
		System.out.println("小写字符：" + lowerCount + "个");
		System.out.println("数字字符：" + numberCount + "个");
	}
}
