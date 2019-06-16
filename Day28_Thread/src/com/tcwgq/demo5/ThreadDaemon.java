package com.tcwgq.demo5;

/**
 * public final void setDaemon(boolean on):将该线程标记为守护线程或用户线程。
 * 当正在运行的线程都是守护线程时，Java虚拟机退出。 该方法必须在启动线程前调用。
 * 该方法首先调用该线程的checkAccess方法，且不带任何参数。这可能抛出 SecurityException（在当前线程中）。
 * 
 */
public class ThreadDaemon extends Thread {

	public ThreadDaemon() {
		super();
	}

	public ThreadDaemon(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(this.getName() + ":" + i);
		}
	}
}
