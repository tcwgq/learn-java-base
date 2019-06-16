package com.tcwgq.demo7;

/**
 * public Thread(Runnable target):分配新的Thread对象。
 * public Thread(Runnable target, String name):分配新的Thread对象。
 */
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}

}
