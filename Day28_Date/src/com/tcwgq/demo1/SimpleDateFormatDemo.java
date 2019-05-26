package com.tcwgq.demo1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * DateFormat是日期/时间格式化子类的抽象类，它以与语言无关的方式格式化并解析日期或时间。
 * 日期/时间格式化子类（如 SimpleDateFormat）允许进行格式化（也就是日期 -> 文本）、解析（文本-> 日期）和标准化。
 * SimpleDateFormat是一个以与语言环境有关的方式来格式化和解析日期的具体类。
 * 它允许进行格式化（日期 -> 文本）、解析（文本 -> 日期）和规范化。
 * 构造方法：
 * public SimpleDateFormat()：用默认的模式和默认语言环境的日期格式符号构造 SimpleDateFormat。
 * public SimpleDateFormat(String pattern)：用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat。
 */
public class SimpleDateFormatDemo {
	public static void main(String[] args) {
		Date date = new Date();
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String d = sdf.format(date);
		System.out.println(d);
	}
}
