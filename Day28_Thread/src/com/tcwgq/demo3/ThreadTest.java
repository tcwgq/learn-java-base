package com.tcwgq.demo3;

public class ThreadTest {
	public static void main(String[] args) throws InterruptedException {
		ThreadJoin tj1 = new ThreadJoin("AAA");
		ThreadJoin tj2 = new ThreadJoin("BBB");
		ThreadJoin tj3 = new ThreadJoin("CCC");
		// tj1.join();//必须放在start之后
		tj1.start();
		tj1.join();
		tj2.start();
		tj3.start();
	}
}
