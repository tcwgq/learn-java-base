package com.tcwgq.demo4;

public class Producer implements Runnable {
	private Student s;
	private int num = 0;

	public Producer(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		synchronized (s) {
			if (s.isFlag()) {
				try {
					s.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
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
			s.setFlag(true);
			s.notify();
		}
	}

}
