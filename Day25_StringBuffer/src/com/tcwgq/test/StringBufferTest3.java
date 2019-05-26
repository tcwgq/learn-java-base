package com.tcwgq.test;

import java.util.Scanner;

/**
 * 判断一个字符串是否是对称字符串 
 * 例如"abc"不是对称字符串，"aba"、"abba"、"aaa"、"mnanm"是对称字符串
 * 反转后和原串字符序列相同，则为对称的。
 */
public class StringBufferTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(fun1(s));
		System.out.println(fun2(s));
		sc.close();
	}

	public static boolean fun1(String s) {
		boolean flag = true;
		char[] chs = s.toCharArray();
		for (int i = 0, j = chs.length - 1; i < chs.length / 2; i++, j--) {
			if (chs[i] != chs[j]) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static boolean fun2(String s) {
		boolean flag = false;
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		String ss = sb.toString();
		if (s.equals(ss)) {
			flag = true;
		}
		return flag;
	}
}
