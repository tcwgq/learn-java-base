package com.tcwgq.demo2;

import java.util.Scanner;

/**
 * 猜数字小游戏(数据在1~100之间)
 */
public class GuessNumberGame {
	public static void main(String[] args) {

		guessNumber();
	}

	public static void guessNumber() {
		Scanner sc = new Scanner(System.in);
		int n = (int) (Math.random() * 100) + 1;
		int count = 0;
		while (true) {
			System.out.println("请输入你要猜的数字（1~100）：");
			int num = sc.nextInt();
			if (num > n) {
				System.out.println("你猜的数据" + num + "大了");
				count++;
			} else if (num < n) {
				System.out.println("你猜的数据" + num + "小了");
				count++;
			} else {
				System.out.println("恭喜你" + count + "猜中了");
				count++;
				break;
			}
		}
		sc.close();
	}
}
