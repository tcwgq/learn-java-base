package com.tcwgq.demo4;

/**
 * public static void yield():暂停当前正在执行的线程对象，并执行其他线程。
 */
public class ThreadYield extends Thread {

	public ThreadYield() {
		super();
	}

	public ThreadYield(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(this.getName() + ":" + i);
			Thread.yield();
		}
	}
}
