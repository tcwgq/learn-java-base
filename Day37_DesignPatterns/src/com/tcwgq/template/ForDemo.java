package com.tcwgq.template;

public class ForDemo extends Template {
	@Override
	public void templete() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}

}
