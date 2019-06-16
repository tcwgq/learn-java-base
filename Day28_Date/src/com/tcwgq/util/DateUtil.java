package com.tcwgq.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 这是针对日期与字符串之间转换的工具类
 * 
 * @author tcwgq
 * @version 1.0
 * @since 1.7
 */
public class DateUtil {

	private DateUtil() {

	}

	public static String dateToString(Date date, String pattern) {
		return new SimpleDateFormat(pattern).format(date);
	}

	public static Date stringToDate(String s, String pattern) {
		Date date = null;
		try {
			date = new SimpleDateFormat(pattern).parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
}
