package com.tcwgq.test3;

/**
 * 同步代码块：
 * 		synchronized(对象){
 * 			需要同步的代码;
 * 		}
 * 
 * 		A:对象是什么呢?
 * 			我们可以随便创建一个对象试试。
 * 		B:需要同步的代码是哪些呢?
 * 			把多条语句操作共享数据的代码的部分给包起来
 * 
 * 		注意：
 * 			同步可以解决安全问题的根本原因就在那个对象上。该对象如同锁的功能。
 * 			多个线程必须是同一把锁。
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
