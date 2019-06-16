package com.tcwgq.test;

import java.util.Scanner;

/**
 * 1517806580@qq.com 
 * liuyi@163.com 
 * linqingxia@126.com 
 * fengqingyang@sina.com.cn
 * fqy@itcast.cn
 */
public class RegexTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine();
		System.out.println(check(email));
		sc.close();
	}

	public static boolean check(String email) {
		String regex = "[a-zA-Z_0-9]+@[a-zA-z_0-9]{2,6}(\\.[a-zA-Z_0-9]{2,3})+";
		//[a-zA-Z_0-9]可以用\w表示，于是可得
//		String reg = "\\w+@\\w{2, 6}(\\.\\w{2,3})+";
		return email.matches(regex);
	}
}
