package com.tcwgq.demo3;

/**
 * public final void join() throws InterruptedException:等待该线程终止。
 */
public class ThreadJoin extends Thread {
	public ThreadJoin() {
		super();
	}

	public ThreadJoin(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(this.getName() + ":" + i);
		}
	}

}
