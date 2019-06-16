package com.tcwgq.demo4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * throws处理异常，针对出现的异常我们不想处理或者处理不了时，将异常抛出给调用者处理。 注意：针对这种情况，调用者可以继续抛出这个异常，但不建议这样做，
 * 特别是main方法调用 这种方法时，特别建议用try...catch...处理异常！ 另外，运行时异常不需要抛出，就算强制抛出了，调用者也不需要处理！
 * 由此可见，使用throws处理异常，虽然简单，但 效果不是很好，建议使用 try...catch...处理异常！ throws后面可以跟多个异常，对于有继承关系的异常部分前后顺序！
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("程序开始");
		try {
			method1();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		method2();
		System.out.println("程序结束");
	}

	private static void method1() throws ParseException {
		String s = "2015-11-1";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(s);
		System.out.println(date);
	}

	private static void method2() throws ArithmeticException {
		int a = 10;
		int b = 0;
		int c = a / b;
		System.out.println(c);
	}

}
