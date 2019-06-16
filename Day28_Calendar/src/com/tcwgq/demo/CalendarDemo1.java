package com.tcwgq.demo;

import java.util.Calendar;

/**
 * public abstract void add(int field, int amount):根据日历的规则，为给定的日历字段添加或减去指定的时间量。
 * public final void set(int year, int month, int date):设置日历字段 YEAR、MONTH
 * 和DAY_OF_MONTH的值。 保留其他日历字段以前的值。如果不需要这样做，则先调用 clear()。
 */
public class CalendarDemo1 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		// 三年前的今天
		// c.add(Calendar.YEAR, -3);
		// 5年后的10天前
		// c.add(Calendar.YEAR, 5);
		// c.add(Calendar.DAY_OF_MONTH, -10);
		// 直接设置时间
		//注意，月是从0开始的
//		c.set(2011, 11, 12);//2011-12-12
		c.set(2012, 12, 12);//2013-1-12
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "-" + (month + 1) + "-" + day);
	}
}
