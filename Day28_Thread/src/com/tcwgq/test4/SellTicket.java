package com.tcwgq.test4;

/**
 * 同步的前提 
 * 多个线程 
 * 多个线程使用的是同一个锁对象 
 * 同步的好处 
 * 同步的出现解决了多线程的安全问题。 
 * 同步的弊端
 * 当线程相当多时，因为每个线程都会去判断同步上的锁，这是很耗费资源的，无形中会降低程序的运行效率。
 */
public class SellTicket implements Runnable {
	private int tickets = 100;
	private Object obj = new Object();

	@Override
	public void run() {
		synchronized (obj) {
			while (tickets > 0) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + ":" + tickets--);
			}
		}
	}
}
