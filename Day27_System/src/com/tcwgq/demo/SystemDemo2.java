package com.tcwgq.demo;

/**
 * public static long currentTimeMillis():返回以毫秒为单位的当前时间。
 */
public class SystemDemo2 {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());// 毫秒值
		System.out.println(System.currentTimeMillis());// 单独获取毫秒值没意义
		// 可用于计算程序的运行时间
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			System.out.println("Hello" + i);
		}
		long end = System.currentTimeMillis();
		long time = end - start;
		System.out.println(time);
	}
}
