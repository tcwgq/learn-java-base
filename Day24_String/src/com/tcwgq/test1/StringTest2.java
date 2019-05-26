package com.tcwgq.test1;

import java.util.Scanner;

/**
 * 字符串反转 
 * 举例：键盘录入”abc” 输出结果：”cba”
 */
public class StringTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String ss = reverse(s);
		System.out.println(ss);
		sc.close();
	}
	
	public static String reverse(String s){
		String ss = "";
		char[] chs = s.toCharArray();
		for(int i = chs.length - 1; i >= 0; i--){
			ss += chs[i];
		}
		return ss;
	}
}
