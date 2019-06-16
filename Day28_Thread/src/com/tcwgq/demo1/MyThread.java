package com.tcwgq.demo1;

/**
 * Java使用的是抢占式调度模型。 
 * public final int getPriority():返回线程的优先级。 
 * public final void setPriority(int newPriority):更改线程的优先级。
 * public static final int MAX_PRIORITY线程可以具有的最高优先级。10
 * public static final int MIN_PRIORITY线程可以具有的最低优先级。1
 * public static final int NORM_PRIORITY分配给线程的默认优先级。5
 * java.lang.IllegalArgumentException:抛出的异常表明向方法传递了一个不合法或不正确的参数。
 * 
 * 注意：
 * 		线程默认优先级是5。
 * 		线程优先级的范围是：1-10。
 * 		线程优先级高仅仅表示线程获取的 CPU时间片的几率高，但是要在次数比较多，或者多次运行的时候才能看到比较好的效果。
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
		for(int i = 0; i < 100; i++){
			System.out.println(this.getName() + ":" + i);
		}
	}
}
