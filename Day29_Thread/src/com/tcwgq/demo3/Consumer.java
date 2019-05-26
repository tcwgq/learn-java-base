package com.tcwgq.demo3;

public class Consumer implements Runnable {
	private Student s;
	private int num = 0;

	public Consumer(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		synchronized (s) {
			while (num < 1000) {
				System.out.println(s.getName() + "--" + s.getAge());
				num++;
			}
		}
	}

}
