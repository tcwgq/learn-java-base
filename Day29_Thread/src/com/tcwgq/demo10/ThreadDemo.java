package com.tcwgq.demo10;

/**
 * 匿名内部类方式使用多线程 
 * new Thread(){代码…}.start(); 
 * New Thread(new Runnable(){代码…}).start();
 */
public class ThreadDemo {
	public static void main(String[] args) {
		new Thread() {
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + ":" + i);
				}
			}
		}.start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + ":" + i);
				}
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + ":" + i);
				}
			}
		}) {
			// 空方法体
		}.start();

		// 两个run一块写，走的是作为Thread子类的run方法
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("Hello" + ":" + i);
				}
			}
		}) {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("World" + ":" + i);
				}
			}
		}.start();
	}
}
