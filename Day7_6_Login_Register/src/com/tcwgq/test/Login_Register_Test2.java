package com.tcwgq.test;

import java.util.Scanner;

import com.tcwgq.dao.impl.UserDaoImpl;
import com.tcwgq.pojo.User;

/**
 * Scanner对象先获取整数，再获取字符串时，会出现问题。
 * @author lenovo
 */
public class Login_Register_Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("欢迎光临，请选择：");
			System.out.println("1登录");
			System.out.println("2注册");
			System.out.println("3退出");
			UserDaoImpl udi = new UserDaoImpl();
			String s = sc.nextLine();
			int choice = Integer.parseInt(s);
			switch (choice) {
			case 1:
				String username = sc.nextLine();
				String password = sc.nextLine();
				boolean b = udi.isLogin(username, password);
				if (b == true) {
					System.out.println("登录成功！");
					GuessNumberGame.start();
				} else {
					System.out.println("登录失败！");
				}
				break;
			case 2:
				String username1 = sc.nextLine();
				String password1 = sc.nextLine();
				User user = new User(username1, password1);
				udi.register(user);
				System.out.println("注册成功！");
				break;
			case 3:
				sc.close();//退出时，需要关闭输入流
				System.exit(0);
				break;
			default:
				System.out.println("您的选择错误！！！");
			}
		}
	}

}
