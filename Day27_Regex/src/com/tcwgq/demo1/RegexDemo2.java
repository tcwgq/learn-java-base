package com.tcwgq.demo1;

/**
 * 替换功能 public String replaceAll(String regex, String
 * replacement):使用给定的replacement替换此字符串所有匹配给定的正则表达式的子字符串。
 */
public class RegexDemo2 {
	public static void main(String[] args) {
		String s = "helloqq12345worldkh622112345678java";
		String regex1 = "\\d+";//连续的数字替换为一个*
		String regex2 = "\\d";//每一个数字都替换为一个*
		String ss = s.replaceAll(regex2, "*");
		System.out.println(ss);
	}
}
