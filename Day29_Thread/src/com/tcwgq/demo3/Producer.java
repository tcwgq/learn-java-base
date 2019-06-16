package com.tcwgq.demo3;

public class Producer implements Runnable {
	private Student s;
	private int num = 0;

	public Producer(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		synchronized (s) {
			while (num < 1000) {
				if (num % 2 == 0) {
					s.setName("AAA");
					s.setAge(25);
				} else {
					s.setName("OOO");
					s.setAge(30);
				}
				num++;
			}
		}
	}

}
