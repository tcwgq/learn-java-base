package com.tcwgq.demo6;

public class Producer implements Runnable {
	private Student s;
	private int num = 0;

	public Producer(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			if (num % 2 == 0) {
				s.set("aaa", 27);
			} else {
				s.set("bbb", 30);
			}
			num++;
		}
	}

}
