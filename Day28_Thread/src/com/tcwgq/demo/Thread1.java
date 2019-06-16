package com.tcwgq.demo;

public class Thread1 extends Thread {

	public Thread1() {
		super();
	}

	public Thread1(Runnable target, String name) {
		super(target, name);
	}

	public Thread1(Runnable target) {
		super(target);
	}

	public Thread1(ThreadGroup group, Runnable target, String name, long stackSize) {
		super(group, target, name, stackSize);
	}

	public Thread1(ThreadGroup group, Runnable target, String name) {
		super(group, target, name);
	}

	public Thread1(ThreadGroup group, Runnable target) {
		super(group, target);
	}

	public Thread1(ThreadGroup group, String name) {
		super(group, name);
	}

	public Thread1(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(this.getName() + ":" + i);
		}
	}
}
