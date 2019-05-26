package com.tcwgq.demo9;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
	private int end;

	public MyCallable(int end) {
		this.end = end;
	}

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 1; i <= end; i++) {
			sum += i;
		}
		return sum;
	}

}
