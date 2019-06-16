package com.tcwgq.demo1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * String:
 * public String[] split(String regex):根据给定正则表达式的匹配拆分此字符串。
 */
public class RegexDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String regex = "-";
		String[] strs = s.split(regex);
		System.out.println(Arrays.toString(strs));
		sc.close();
	}
}
