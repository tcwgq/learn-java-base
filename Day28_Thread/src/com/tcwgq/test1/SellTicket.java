package com.tcwgq.test1;

public class SellTicket implements Runnable {
	private int tickets = 100;

	@Override
	public void run() {
		while (tickets > 0) {
			System.out.println(Thread.currentThread().getName() + ":" + tickets--);
		}
	}

}
