package com.tcwgq.test;

import java.util.Scanner;

/**
 * 用户登录案例，加入猜数字游戏
 */
public class StringTest1 {
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
				GuessNumberGame.start();
				break;
			} else {
				if (3 - i == 0) {
					System.out.println("你没有登录机会了");
				} else {
					System.out.println("你还有" + (3 - i) + "次登录机会");
				}
			}
		}
		sc.close();
	}
}
