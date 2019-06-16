package com.tcwgq.demo;

/**
 * public static boolean isUpperCase(char ch):判断是否是大写字符
 * public static boolean isLowerCase(char ch):判断是否是小写字符
 * public static boolean isDigit(char ch):确定指定字符是否为数字。
 * public static char toUpperCase(char ch):转换为大写字符
 * public static char toLowerCase(char ch):转换为小写字符
 */
public class CharacterDemo1 {
	public static void main(String[] args) {
		System.out.println(Character.isUpperCase('a'));
		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.isUpperCase('0'));
		System.out.println("-------------------------");
		System.out.println(Character.isLowerCase('B'));
		System.out.println(Character.isLowerCase('b'));
		System.out.println(Character.isLowerCase('1'));
		System.out.println("-------------------------");
		System.out.println(Character.isDigit('c'));
		System.out.println(Character.isDigit('K'));
		System.out.println(Character.isDigit('9'));
		System.out.println("-------------------------");
		System.out.println(Character.toUpperCase('n'));
		System.out.println(Character.toLowerCase('M'));
	}
}
