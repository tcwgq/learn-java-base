package com.tcwgq.demo;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Lock实现提供了比使用synchronized方法和语句可获得的更广泛的锁定操作。
 * ReentrantLock:一个可重入的互斥锁 Lock，它具有与使用synchronized方法和语句所访问的隐式监视器锁相同的一些基本行为和语义，但功能更强大。
 * void lock():获取锁。
 * void unlock():释放锁。
 */
public class SellTicket implements Runnable {
	private int tickets = 100;
	private ReentrantLock rl = new ReentrantLock();

	@Override
	public void run() {
		try{
			rl.lock();
			while (tickets > 0) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + ":" + tickets--);
			}
		}finally{
			rl.unlock();
		}
	}

}
