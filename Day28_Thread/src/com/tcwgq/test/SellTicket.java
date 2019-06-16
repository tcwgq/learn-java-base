package com.tcwgq.test;

/**
 * 某电影院目前正在上映贺岁大片(红高粱,少林寺传奇藏经阁)，共有100张票，而它有3个售票窗口售票，请设计一个程序模拟该电影院售票。
 * 继承Thread类来实现。
 */
public class SellTicket extends Thread {
	// 为了让多个线程对象共享这100张票，我们其实应该用静态修饰
	// private int tickets = 100;
	private static int tickets = 100;

	public SellTicket() {
		super();
	}

	public SellTicket(String name) {
		super(name);
	}

	@Override
	public void run() {
		// 每个线程进来都会走这里，这样的话，每个线程对象相当于买的是自己的那100张票，这不合理，所以应该定义到外面
		// int tickets = 100;
		while (tickets > 0) {
			System.out.println(this.getName() + ":" + tickets--);
		}
	}
}
