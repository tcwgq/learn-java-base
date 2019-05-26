package com.tcwgq.test;

/**
 * Integer i = 1; i += 1;做了哪些事情
 */
public class IntegerTest {
	public static void main(String[] args) {
		Integer i = 1;//自动装箱
		i += 1;//先自动拆箱，再自动装箱
		System.out.println(i);
	}
}
