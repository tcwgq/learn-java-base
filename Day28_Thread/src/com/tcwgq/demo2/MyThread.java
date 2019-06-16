package com.tcwgq.demo2;

/**
 * public static void sleep(long millis) throws
 * InterruptedException:在指定的毫秒数内让当前正在执行的线程休眠（暂停执行），此操作受到系统计时器和调度程序精度和准确性的影响。
 */
public class MyThread extends Thread {
	public MyThread() {
		super();
	}

	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(this.getName() + ":" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
