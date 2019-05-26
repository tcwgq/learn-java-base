package com.tcwgq.test2;

public class SellTicket implements Runnable {
	private int tickets = 100;

	@Override
	public void run() {
		while (tickets > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ":" + tickets--);
		}
	}

}
