package com.tcwgq.test5;

/**
 * A:同步代码块的锁对象是谁呢?
 * 		任意对象。
 * 
 * B:同步方法的格式及锁对象问题?
 * 		把同步关键字加在方法上。
 * 
 * 		同步方法是谁呢?
 * 			this
 * 
 * C:静态方法及锁对象问题?
 * 		静态方法的锁对象是谁呢?
 * 			类的字节码文件对象。(反射会讲)
 */
public class SellTicket implements Runnable {

	private static int tickets = 100;

	private Object obj = new Object();

	private Demo d = new Demo();

	private int num = 0;

	@Override
	public void run() {
		while (tickets > 0) {
			if (num % 2 == 0) {
				synchronized (d) {
					if (tickets > 0) {
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName() + ":" + tickets--);
					}
				}
			} else {
				synchronized (d) {
					if (tickets > 0) {
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName() + ":" + tickets--);
					}
				}
				// sellTicket2();
				// sellTicket3();
			}
			num++;
		}
	}

	private void sellTicket1() {
		synchronized (obj) {
			if (tickets > 0) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + ":" + tickets--);
			}
		}
	}

	private synchronized void sellTicket2() {
		if (tickets > 0) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ":" + tickets--);
		}
	}

	private synchronized static void sellTicket3() {
		if (tickets > 0) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ":" + tickets--);
		}
	}
}

class Demo {
	public Demo() {
		super();
	}
}
