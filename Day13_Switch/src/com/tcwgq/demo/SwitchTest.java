package com.tcwgq.demo;

import java.util.Scanner;

import org.junit.Test;

/**
 * 1.模拟做单项选择题，根据你的选择，给出对应的答案。(表达式是字符的情况)
 * 2.键盘录入字符串，根据给定的字符串，来输出你选择的字符串是什么?(表达式是字符串的情况) 
 * 3.用switch语句实现键盘录入月份，输出对应的季节
 * 4.看程序写结果
 */
public class SwitchTest {
	@Test
	public void fun1() {
		int x = 2;
		int y = 3;
		switch (x) {
		default:
			y++;
			break;
		case 3:
			y++;
		case 4:
			y++;
		}
		System.out.println("y=" + y);//4
		System.out.println("---------------");

		int a = 2;
		int b = 3;
		switch (a) {
		default:
			b++;
		case 3:
			b++;
		case 4:
			b++;
		}
		System.out.println("b=" + b);//6
	}

	@Test
	public void fun2() {
		// 出一个选择题，然后供你选择。
		// 由于我们现在没有办法键盘录入得到一个'A','B'
		// 这样的东西，我就用65，66这样的值替代
		// 将来我们获取到这样的值以后，强制转换为字符类型
		System.out.println("下面的几个人你最爱谁?");
		System.out.println("65 林青霞");
		System.out.println("66 张曼玉");
		System.out.println("67 刘德华");
		System.out.println("68 王力宏");

		// 键盘录入选择的数据。
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入你的选择：");
		int choiceNumber = sc.nextInt();

		// 强制转换为字符类型
		char choice = (char) choiceNumber;//没有录入单个字符的函数，可以这样强制类型转换
		switch (choice) {
		case 'A':
			System.out.println("恭喜你,选择正确");
			break;
		case 'B':
			System.out.println("不好意思，你选择有误");
			break;
		case 'C':
			System.out.println("不好意思，你选择有误");
			break;
		case 'D':
			System.out.println("不好意思，你选择有误");
			break;
		default:
			System.out.println("没有该选项");
			break;
		}
		sc.close();
	}

	@Test
	public void fun3() {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		// 录入数据
		System.out.println("请输入你要判断的字符串：");
		String s = sc.nextLine();

		switch (s) {
		case "hello":
			System.out.println("你输入的是hello");
			break;
		case "world":
			System.out.println("你输入的是world");
			break;
		case "java":
			System.out.println("你输入的是java");
			break;
		default:
			System.out.println("没有找到你输入的数据");
			// break;
		}
		sc.close();
	}

	@Test
	public void fun4() {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		// 录入数据
		System.out.println("请输入月份(1-12)：");
		int month = sc.nextInt();

		/*
		 * switch(month) { case 1: System.out.println("冬季"); break; case 2:
		 * System.out.println("冬季"); break; case 3: System.out.println("春季");
		 * break; case 4: System.out.println("春季"); break; case 5:
		 * System.out.println("春季"); break; case 6: System.out.println("夏季");
		 * break; case 7: System.out.println("夏季"); break; case 8:
		 * System.out.println("夏季"); break; case 9: System.out.println("秋季");
		 * break; case 10: System.out.println("秋季"); break; case 11:
		 * System.out.println("秋季"); break; case 12: System.out.println("冬季");
		 * break; default: System.out.println("你输入的月份有误"); }
		 */

		// 这样写太麻烦了，我们使用一个我们不想使用的东西：case穿透
		switch (month) {
		case 1:
		case 2:
		case 12:
			System.out.println("冬季");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋季");
			break;
		default:
			System.out.println("你输入的月份有误");
		}
		sc.close();
	}

}
