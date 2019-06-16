package com.tcwgq.demo9;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Callable<V>:返回结果并且可能抛出异常的任务。实现者定义了一个不带任何参数的叫做call的方法。
 */
public class ExecutorsDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(10);
		Future<Integer> f1 = es.submit(new MyCallable(100));
		Future<Integer> f2 = es.submit(new MyCallable(200));
		System.out.println(f1.get());
		System.out.println(f2.get());
		es.shutdown();
	}
}
