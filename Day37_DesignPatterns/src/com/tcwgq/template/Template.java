package com.tcwgq.template;

public abstract class Template {
	public long getTime() {
		long start = System.currentTimeMillis();
		templete();
		long end = System.currentTimeMillis();
		long time = end - start;
		return time;
	}

	public abstract void templete();

}
