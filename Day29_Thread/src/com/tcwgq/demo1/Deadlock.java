package com.tcwgq.demo1;

public class Deadlock extends Thread {
	private boolean flag;

	public Deadlock(boolean flag) {
		this.flag = flag;
	}

	public Deadlock(String name) {
		super(name);
	}

	@Override
	public void run() {
		if (flag) {
			synchronized (MyLock.la) {
				System.out.println("if la");
				synchronized (MyLock.lb) {
					System.out.println("if lb");
				}
			}
		} else {
			synchronized (MyLock.lb) {
				System.out.println("else lb");
				synchronized (MyLock.la) {
					System.out.println("else la");
				}
			}
		}
	}
}
