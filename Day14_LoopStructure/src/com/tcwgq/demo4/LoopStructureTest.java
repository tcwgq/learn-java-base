package com.tcwgq.demo4;

/**
 * 小芳的妈妈每天给她2.5元钱，她都会存起来， 但是，每当这一天是存钱的第5天或者5的倍数的话，
 * 她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱。74天存了101.0元钱
 */
public class LoopStructureTest {
	public static void main(String[] args) {
		double a = 2.5;
		double sum = 0;
		int day = 1;
		while (sum <= 100) {
			sum += a;
			if (day % 5 == 0) {
				sum -= 6;
			}
			System.out.println("day" + day + " " + "sum" + sum);
			day++;
		}
		System.out.println(day);
	}

}
