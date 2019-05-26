package com.tcwgq.test;

import java.util.Scanner;

/**
 * 模拟用户登录案例，只给3次机会。
 */
public class StringTest {
	public static void main(String[] args) {
		String Username = "admin";
		String Password = "admin";
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {
			System.out.println("请输入账号：");
			String username = sc.nextLine();
			System.out.println("请输入密码：");
			String password = sc.nextLine();
			if (username.equals(Username) && password.equals(Password)) {
				System.out.println("恭喜你，登录成功！");
				break;
			} else {
				if (3 - i == 0) {
					System.out.println("你没有登录机会了");
					// System.out.println("账号被锁定，请联系工作人员");
				} else {
					System.out.println("你还有" + (3 - i) + "次登录机会");
				}
			}
		}
		sc.close();
	}
}
