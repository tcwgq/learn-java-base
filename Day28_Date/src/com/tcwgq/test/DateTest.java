package com.tcwgq.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 算一下你来到这个世界多少天?
 */
public class DateTest {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String birthday = sc.nextLine();
		String pattern = "yyyy-MM-dd";//必须严格按照这个格式解析
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date d = sdf.parse(birthday);
		long start = d.getTime();
		long now = System.currentTimeMillis();
		long time = now - start;
		long day = time / 1000 / 60 / 60 / 24;
		System.out.println(day);
		sc.close();
	}
}
