package com.tcwgq.demo;

import java.util.Calendar;

/**
 * Calendar类是一个抽象类，它为特定瞬间与一组诸如 YEAR、MONTH、DAY_OF_MONTH、HOUR 等
 * 日历字段之间的转换提供了一些方法，并为操作日历字段（例如获得下星期的日期）提供了一些方法。
 * public static Calendar getInstance():使用默认时区和语言环境获得一个日历。返回的Calendar基于当前时间，使用了默认时区和默认语言环境。
 * public int get(int field):返回给定日历字段的值。日历类中的每个日历字段都是静态的成员变量，并且是int类型。
 */
public class CalendarDemo {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		int month = c.get(Calendar.MONTH);//month从0开始的
		System.out.println(month);
		int day = c.get(Calendar.DATE);//DATE和DAY_OF_MONTH效果相同
		int d = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(d);
		System.out.println(day);
		System.out.println(year + "-" + (month + 1) + "-" + day);
	}
}
