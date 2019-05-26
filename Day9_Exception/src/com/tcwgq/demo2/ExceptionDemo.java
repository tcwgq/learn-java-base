package com.tcwgq.demo2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

/**
 * 编译期异常与运行时异常的区别
 */
public class ExceptionDemo {
	@Test
	public void fun(){
		//编译期异常
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = sdf.format(date);
		System.out.println(s);
		String ss = "2015-10-31";
		try {
			Date d = sdf.parse(ss);
			System.out.println(d);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun1(){
		//运行时异常
		int a = 10;
		int b = 0;
		System.out.println(a/b);
		System.out.println("over");
	}

}
