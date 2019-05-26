package com.tcwgq.demo1;

import java.util.Scanner;

/**
 * 判断功能
 * String类： 
 * public boolean matches(String regex)：告知此字符串是否匹配给定的正则表达式。
 */
public class RegexDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phone = sc.nextLine();
		System.out.println(check(phone));
		sc.close();
	}
	
	public static boolean check(String s){
//		return s.matches("[1][358]\\d{9}");
		return s.matches("[1][358][0-9]{9}");
	}
}
