package com.tcwgq.demo;

/**
 * 模板设计模式
 */
public abstract class GetTime {
	public long getTime() {
		long start = System.currentTimeMillis();
		template();
		long end = System.currentTimeMillis();
		long time = end - start;
		return time;
	}

	public abstract void template();
}
