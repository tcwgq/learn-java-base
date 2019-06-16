package com.tcwgq.demo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat是一个以与语言环境有关的方式来格式化和解析日期的具体类。
 * 它允许进行格式化（日期 -> 文本）、解析（文本 -> 日期）和规范化。
 * 成员方法：
 * public final String format(Date date):Formats a Date into a date/time string.
 * public Date parse(String source) throws ParseException:Parses text from the beginning of the given string to produce a date. The method may not use the entire text of the given string.
 */
public class SimpleDateFormatDemo1 {
	public static void main(String[] args) {
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String d = "1991-01-10 12:30:30";
		try {
			Date date = sdf.parse(d);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
