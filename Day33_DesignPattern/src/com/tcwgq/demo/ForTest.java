package com.tcwgq.demo;

public class ForTest extends GetTime {

	@Override
	public void template() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(i);
		}
	}

}
