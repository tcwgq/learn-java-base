package com.tcwgq.test;

public class ThreadTest {
	public static void main(String[] args) {
		SellTicket st1 = new SellTicket("窗口1");
		SellTicket st2 = new SellTicket("窗口2");
		SellTicket st3 = new SellTicket("窗口3");
		st1.start();
		st2.start();
		st3.start();
	}
}
