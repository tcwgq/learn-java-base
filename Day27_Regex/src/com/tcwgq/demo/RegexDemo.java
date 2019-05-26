package com.tcwgq.demo;

import java.util.Scanner;

/**
 * 校验qq号码. 1:要求必须是5-15位数字 2:0不能开头
 */
public class RegexDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String qq = sc.nextLine();
		boolean r = check(qq);
		System.out.println(r);
		sc.close();
	}

	public static boolean check(String qq) {
		boolean flag = true;
		if (qq.length() >= 5 && qq.length() <= 15) {
			if (!qq.startsWith("0")) {
				char[] chs = qq.toCharArray();
				for (int i = 0; i < chs.length; i++) {
					if (!Character.isDigit(chs[i])) {
						flag = false;
						break;
					}
				}
			}
		} else {
			flag = false;
		}
		return flag;
	}
}
