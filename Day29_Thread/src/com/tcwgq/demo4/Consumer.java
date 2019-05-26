package com.tcwgq.demo4;

public class Consumer implements Runnable {
	private Student s;
	private int num = 0;

	public Consumer(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		synchronized (s) {
			if (!s.isFlag()) {
				try {
					s.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			while (num < 1000) {
				System.out.println(s.getName() + "--" + s.getAge());
				num++;
			}
			s.setFlag(false);
			s.notify();
		}
	}

}
