package com.tcwgq.demo2;

public class Producer implements Runnable {
	private Student s;

	public Producer(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		// Student s = new Student();
		s.setName("AAA");
		s.setAge(25);
	}

}
