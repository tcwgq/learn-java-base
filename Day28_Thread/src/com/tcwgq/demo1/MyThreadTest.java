package com.tcwgq.demo1;

public class MyThreadTest {
	public static void main(String[] args) {
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();
		MyThread mt3 = new MyThread();
		mt1.setName("A");
		mt2.setName("B");
		mt3.setName("C");
		mt1.setPriority(10);
		mt2.setPriority(1);
		mt1.start();
		mt2.start();
		mt3.start();
		System.out.println(Thread.MAX_PRIORITY);//10
		System.out.println(Thread.MIN_PRIORITY);//1
		System.out.println(Thread.NORM_PRIORITY);//5
	}
}
