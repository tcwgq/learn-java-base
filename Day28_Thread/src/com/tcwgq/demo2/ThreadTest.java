package com.tcwgq.demo2;

public class ThreadTest {
	public static void main(String[] args) throws InterruptedException {
		MyThread mt1 = new MyThread("AAA");
		MyThread mt2 = new MyThread("BBB");
		MyThread mt3 = new MyThread("CCC");
//		Thread.sleep(10000);//主线程休眠10秒
		mt1.start();
		mt2.start();
		mt3.start();
	}
}
