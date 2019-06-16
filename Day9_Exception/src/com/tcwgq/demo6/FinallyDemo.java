package com.tcwgq.demo6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * finally的特点 ：finally中的语句一定会执行，不管程序运行过程中出现异常与否。 格式： try...catch...finally...
 * 注意：finally语句之前JVM退出了，则finally语句中的代码不能被执行！
 */
public class FinallyDemo {
	public static void main(String[] args) {
		String s = "2015-11-1";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = null;
		try {
			date = sdf.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
			System.exit(0);
		} finally {
			System.out.println("这里的代码一定会执行 ");
		}
		System.out.println(date);
	}

}
