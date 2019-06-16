package com.tcwgq.demo2;

public class ThreadTest {
	public static void main(String[] args) {
		Student s = new Student();
		Producer p = new Producer(s);
		Consumer c = new Consumer(s);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
	}
}
