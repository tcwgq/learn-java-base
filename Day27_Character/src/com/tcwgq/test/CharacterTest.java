package com.tcwgq.test;

import java.util.Scanner;

/**
 * 统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
 */
public class CharacterTest {
	public static void main(String[] args) {
		int low = 0;
		int upper = 0;
		int digit = 0;
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] chs = s.toCharArray();
		for (int i = 0; i < chs.length; i++) {
			if (Character.isUpperCase(chs[i])) {
				upper++;
			}
			if (Character.isLowerCase(chs[i])) {
				low++;
			}
			if (Character.isDigit(chs[i])) {
				digit++;
			}
		}
		System.out.println("大写字符：" + upper + "个");
		System.out.println("小写字符：" + low + "个");
		System.out.println("数字字符：" + digit + "个");
		sc.close();
	}
}
