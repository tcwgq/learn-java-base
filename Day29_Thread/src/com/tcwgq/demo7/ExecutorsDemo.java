package com.tcwgq.demo7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * JDK5新增了一个Executors工厂类来产生线程池，有如下几个方法 
 * public static ExecutorService newCachedThreadPool() 
 * public static ExecutorService newFixedThreadPool(int nThreads) 
 * public static ExecutorService newSingleThreadExecutor()
 * 这些方法的返回值是ExecutorService对象，该对象表示一个线程池，可以执行Runnable对象或者Callable对象代表的线程。
 * 它提供了如下方法 Future<?> submit(Runnable task) 
 * <T> Future<T> submit(Callable <T> task) 
 * 案例演示 
 * 创建线程池对象 
 * 创建Runnable实例 
 * 提交Runnable实例 
 * 关闭线程池
 * void shutdown():启动一次顺序关闭，执行以前提交的任务，但不接受新任务。如果已经关闭，则调用没有其他作用。
 */
public class ExecutorsDemo {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(10);
		es.submit(new MyRunnable());
		es.submit(new MyRunnable());
		es.submit(new MyRunnable());
		es.shutdown();
	}
}
