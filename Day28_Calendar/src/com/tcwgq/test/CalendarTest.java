package com.tcwgq.test;

import java.util.Calendar;
import java.util.Date;

/**
 * 你来到世界上有多少天
 */
public class CalendarTest {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Date date = c.getTime();
		System.out.println(date);
		long now = c.getTimeInMillis();
		System.out.println(now);
	}
}
