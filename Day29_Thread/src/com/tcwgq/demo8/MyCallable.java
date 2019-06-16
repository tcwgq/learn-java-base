package com.tcwgq.demo8;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
		return null;
	}

}
