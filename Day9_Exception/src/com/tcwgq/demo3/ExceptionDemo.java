package com.tcwgq.demo3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Throwable中的方法介绍： public String getMessage():返回此 throwable 的详细消息字符串。
 * 
 * public String toString():返回此 throwable 的简短描述。 结果是以下字符串的串联： 此对象的类的 name ": "
 * （冒号和一个空格） 调用此对象 getLocalizedMessage()方法的结果 如果 getLocalizedMessage返回
 * null，则只返回类名称。
 * 
 * public void printStackTrace():将此 throwable及其追踪输出至标准错误流。 此方法将此
 * Throwable对象的堆栈跟踪输出至错误输出流，作为字段 System.err的值。 输出的第一行包含此对象的 toString()方法的结果。
 * 剩余行表示以前由方法 fillInStackTrace()记录的数据
 * 
 * public void printStackTrace(PrintStream s):将此 throwable及其追踪输出到指定的输出流。 public
 * void printStackTrace(PrintWriter s):将此 throwable及其追踪输出到指定的 PrintWriter。
 * 
 * public Throwable fillInStackTrace():在异常堆栈跟踪中填充。 此方法在
 * Throwable对象信息中记录有关当前线程堆栈帧的当前状态。
 * 
 * public String getLocalizedMessage():创建此 throwable 的本地化描述。
 * 子类可以重写此方法，以便生成特定于语言环境的消息。 对于不重写此方法的子类，默认实现返回与 getMessage()相同的结果。
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		String s = "2015-11-1";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date date = sdf.parse(s);
			System.out.println(date);
		} catch (ParseException e) {
			// getMessage():返回此 throwable 的详细消息字符串。
			System.out.println("getMessage():" + e.getMessage());//Unparseable date: "2015-11-1"

			// String toString():返回此 throwable 的简短描述。
			System.out.println("toString():" + e.toString());//java.text.ParseException: Unparseable date: "2015-11-1"
			// printStackTrace():将此 throwable及其追踪输出至标准错误流。
			System.out.print("printStackTrace():");
			e.printStackTrace();
			/*
			 * java.text.ParseException: Unparseable date: "2015-11-1" 
			 *        at java.text.DateFormat.parse(Unknown Source) 
			 *        at com.tcwgq.demo3.ExceptionDemo.main(ExceptionDemo.java:32)
			 */
			// String getLocalizedMessage():创建此 throwable 的本地化描述。
			System.out.println("getLocalizedMessage():" + e.getLocalizedMessage());//Unparseable date: "2015-11-1"
		}
	}
}
