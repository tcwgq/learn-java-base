package com.tcwgq.demo6;

public class Consumer implements Runnable {
	private Student s;

	public Consumer(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			s.get();
		}
	}

}
