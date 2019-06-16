package com.tcwgq.demo4;

public class ThreadTest {
	public static void main(String[] args) {
		ThreadYield ty1 = new ThreadYield("AAA");
		ThreadYield ty2 = new ThreadYield("BBB");
		ty1.start();
		ty2.start();
	}
}
