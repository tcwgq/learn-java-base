package com.tcwgq.demo;

import java.util.Scanner;

/**
 * 正则表达式
 * String类的方法：
 * public boolean matches(String regex):告知此字符串是否匹配给定的正则表达式。
 */
public class RegexDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String qq = sc.nextLine();
		System.out.println(check(qq));
		sc.close();
	}

	public static boolean check(String qq) {
		String regex = "[1-9][0-9]{4,14}";
		return qq.matches(regex);
	}
}
