package com.tcwgq.test;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 获取任意一年的二月有多少天
 */
public class CalendarTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		Calendar c = Calendar.getInstance();
		c.set(year, 2, 1);//其实是这一年的3月1日
		c.add(Calendar.DAY_OF_MONTH, -1);
		int day = c.get(Calendar.DATE);
		System.out.println(day);
		sc.close();
	}
}
