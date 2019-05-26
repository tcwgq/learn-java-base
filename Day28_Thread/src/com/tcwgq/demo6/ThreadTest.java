package com.tcwgq.demo6;

public class ThreadTest {
	public static void main(String[] args) {
		ThreadStop ts = new ThreadStop("AAA");
		ts.start();
		try {
			Thread.sleep(3000);
//			ts.stop();
			ts.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
