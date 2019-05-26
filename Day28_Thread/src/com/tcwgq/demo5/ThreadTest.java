package com.tcwgq.demo5;

public class ThreadTest {
	public static void main(String[] args) {
		ThreadDaemon td1 = new ThreadDaemon("AAA");
		ThreadDaemon td2 = new ThreadDaemon("BBB");
		td1.setDaemon(true);
		td2.setDaemon(true);
		td1.start();
		td2.start();
		for (int j = 0; j < 10; j++) {
			System.out.println(Thread.currentThread().getName() + ":" + j);
		}
	}
}
