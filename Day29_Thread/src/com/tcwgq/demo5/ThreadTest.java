package com.tcwgq.demo5;

/**
 * ThreadGroup:线程组表示一个线程的集合。此外，线程组也可以包含其他线程组。线程组构成一棵树，在树中，除了初始线程组外，
 * 每个线程组都有一个父线程组。 public ThreadGroup(String
 * name):构造一个新线程组。新线程组的父线程组是目前正在运行线程的线程组。 public ThreadGroup(ThreadGroup parent,
 * String name):创建一个新线程组。新线程组的父线程组是指定的线程组。 public final String
 * getName():返回此线程组的名称。
 * 
 * public Thread(ThreadGroup group,Runnable target,String name):
 * 分配新的Thread对象，以便将target作为其运行对象，将指定的name作为其名称，并作为group所引用的线程组的一员。
 */
public class ThreadTest {
	public static void main(String[] args) {
//		method1();
		method2();
	}

	private static void method1() {
		MyRunnable mr = new MyRunnable();
		Thread t1 = new Thread(mr, "AAA");
		Thread t2 = new Thread(mr, "BBB");
		// t1.start();
		// t2.start();
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
		System.out.println(tg1.getName());
		System.out.println(tg2.getName());
		// 通过结果我们知道了：线程默认情况下属于main线程组
		// 通过下面的测试，你应该能够看到，默任情况下，所有的线程都属于同一个组
		System.out.println(Thread.currentThread().getName());
	}

	private static void method2() {
		ThreadGroup tg = new ThreadGroup("线程组");
		MyRunnable mr = new MyRunnable();
		Thread t1 = new Thread(tg, mr, "A");
		Thread t2 = new Thread(tg, mr, "B");
//		t1.start();
//		t2.start();
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t2.getThreadGroup().getName());
		//通过组名称设置后台线程，表示该组的线程都是后台线程
		tg.setDaemon(true);
	}
}
