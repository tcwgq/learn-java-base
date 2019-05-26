package com.tcwgq.demo;

import java.util.Date;

/**
 * 类 Date表示特定的瞬间，精确到毫秒。
 * 构造方法：
 * public Date()：分配Date对象并初始化此对象，以表示分配它的时间（精确到毫秒）。
 * public Date(long date)：分配Date对象并初始化此对象，以表示自从标准基准时间（称为“历元（epoch）”， 
 */
public class DateDemo {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		Date d1 = new Date(System.currentTimeMillis());
		System.out.println(d1);
		long time = 1000 * 60 * 60;
		Date d2 = new Date(time);
		System.out.println(d2);//Thu Jan 01 09:00:00 CST 1970
		//为什么是09:00:00呢？因为我们是东八区
	}
}
