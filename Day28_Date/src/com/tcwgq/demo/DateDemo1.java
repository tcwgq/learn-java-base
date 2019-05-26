package com.tcwgq.demo;

import java.util.Date;

/**
 * 成员方法 
 * public long getTime():返回自1970年1月1日 00:00:00 GMT以来此Date对象表示的毫秒数。
 * public void setTime(long time):设置此Date对象，以表示1970年1月1日 00:00:00 GMT以后time毫秒的时间点。
 * 
 */
public class DateDemo1 {
	public static void main(String[] args) {
		Date d = new Date();
		long time = d.getTime();
		System.out.println(time);
		System.out.println(System.currentTimeMillis());
		System.out.println(d);
		d.setTime(1000);
		System.out.println(d);//Thu Jan 01 08:00:01 CST 1970，东八区
	}
}
