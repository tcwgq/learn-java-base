package com.tcwgq.demo;

/**
 * 创建新执行线程有两种方法。一种方法是将类声明为Thread的子类。该子类应重写Thread类的run方法。接下来可以分配并启动该子类的实例。
 * 创建线程的另一种方法是声明实现Runnable接口的类。该类然后实现run方法。然后可以分配该类的实例，在创建Thread时作为一个参数来传递并启动。
 * 
 * 为什么要重写run方法？
 * 不是类中的所有代码都需要被线程执行的。
 * 而这个时候，为了区分哪些代码能够被线程执行，java提供了Thread类中的run()用来包含那些被线程执行的代码。
 * 
 * 面试题：
 * run()和start()方法的区别：
 * 仅仅是封装被线程执行的代码，直接调用是普通方法
 * 首先启动了线程，然后再由jvm去调用该线程的run()方法。
 * 
 * 构造方法：
 * public Thread()：分配新的Thread对象。
 * public Thread(String name)：分配新的Thread对象。这种构造方法与Thread(null, null, name)具有相同的作用。
 * 两个方法：
 * public final String getName()：返回该线程的名称
 * public final void setName(String name)：改变线程名称，使之与参数name相同。
 * 注意：
 * 多次启动一个线程是非法的。特别是当线程已经结束执行后，不能再重新启动。
 * 
 * 针对不是Thread类的子类如何获取线程对象名称呢?
 * public static Thread currentThread():返回对当前正在执行的线程对象的引用。
 * Thread.currentThread().getName()
 */
public class ThreadDemo1 {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread1 t2 = new Thread1();
		t1.setName("线程1");
		t2.setName("线程2");
		t1.start();
//		t1.start();//IllegalThreadStateException，同一个线程不能被启动多次
		t2.start();
		Thread1 t3 = new Thread1("线程3");
		t3.start();
		//获取main方法所在的线程对象的名称
		//public static Thread currentThread():返回对当前正在执行的线程对象的引用。
		System.out.println(Thread.currentThread().getName());//main
	}
}
