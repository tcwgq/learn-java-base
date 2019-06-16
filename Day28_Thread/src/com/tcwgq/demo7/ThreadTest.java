package com.tcwgq.demo7;

public class ThreadTest {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable());
		Thread t2 = new Thread(new MyRunnable());
		Thread t3 = new Thread(new MyRunnable(), "CCC");
		t1.setName("AAA");
		t2.setName("BBB");
		t1.start();
		t2.start();
		t3.start();
	}
}
