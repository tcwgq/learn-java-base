package com.tcwgq.demo2;

public class Consumer implements Runnable {
	private Student s;

	public Consumer(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		// Student s = new Student();
		System.out.println(s.getName() + "--" + s.getAge());
	}

}
