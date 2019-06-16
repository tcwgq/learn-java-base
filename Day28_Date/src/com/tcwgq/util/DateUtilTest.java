package com.tcwgq.util;

import java.util.Date;

public class DateUtilTest {
	public static void main(String[] args) {
		Date date = new Date();
		String s = DateUtil.dateToString(date, "yyyy-MM-dd HH:mm:ss");
		System.out.println(s);
		String d = "2015-12-3";
		Date dd = DateUtil.stringToDate(d, "yyyy-MM-dd");//Unparseable date: "2015-12-3"
		System.out.println(dd);
	}
}
