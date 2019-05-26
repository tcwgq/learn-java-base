package com.tcwgq.test;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
	private GuessNumberGame() {

	}

	public static void start() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int guessNumber = r.nextInt(100) + 1;
		int count = 0;
		int num;
		while (true) {
			count++;
			num = sc.nextInt();
			if (num > guessNumber) {
				System.out.println("您猜的" + num + "大了");
			} else if (num < guessNumber) {
				System.out.println("您猜的" + num + "小了");
			} else {
				System.out.println("恭喜你" + count + "次猜中了！");
				break;
			}
		}
		//sc.close();
	}

}
