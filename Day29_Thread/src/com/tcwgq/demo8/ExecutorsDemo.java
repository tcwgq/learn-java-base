package com.tcwgq.demo8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Callable<V>:返回结果并且可能抛出异常的任务。实现者定义了一个不带任何参数的叫做call的方法。
 */
public class ExecutorsDemo {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(10);
		es.submit(new MyCallable());
		es.submit(new MyCallable());
		es.submit(new MyCallable());
		es.shutdown();
	}
}
