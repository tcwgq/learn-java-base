package com.tcwgq.demo6;

import java.util.Date;

/**
 * public final void stop():强迫线程停止执行。已过时。
 * public void interrupt():中断线程。把线程的状态终止，并抛出一个InterruptedException。
 */
public class ThreadStop extends Thread {

	public ThreadStop() {
		super();
	}

	public ThreadStop(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("Start:" + new Date());
		try {
			Thread.sleep(10000);// 休眠10秒钟
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End:" + new Date());
	}
}
