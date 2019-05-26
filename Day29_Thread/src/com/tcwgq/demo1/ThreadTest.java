package com.tcwgq.demo1;

public class ThreadTest {
	public static void main(String[] args) {
		Deadlock dl1 = new Deadlock(true);
		Deadlock dl2 = new Deadlock(false);
		dl1.start();
		dl2.start();
	}
}
