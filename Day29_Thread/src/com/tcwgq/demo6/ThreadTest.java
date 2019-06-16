package com.tcwgq.demo6;

/**
 * public final void wait() throws InterruptedException:在其他线程调用此对象的notify()方法或notifyAll()方法前，导致当前线程等待。
 * public final void notify():唤醒在此对象监视器上等待的单个线程。
 * 
 * 最终版代码中：
 * 		把Student的成员变量给私有的了。
 * 		把设置和获取的操作给封装成了功能，并加了同步。
 * 		设置或者获取的线程里面只需要调用方法即可。
 */
public class ThreadTest {
	public static void main(String[] args) {
		Student s = new Student();
		Producer p = new Producer(s);
		Consumer c = new Consumer(s);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		t2.start();
		t1.start();
	}
}
