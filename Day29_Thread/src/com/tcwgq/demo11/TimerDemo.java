package com.tcwgq.demo11;

import java.util.Timer;

/**
 * Timer:一种工具，线程用其安排以后在后台线程中执行的任务。可安排任务执行一次，或者定期重复执行。
 * 构造方法：
 * public Timer()：创建一个新计时器。相关的线程不 作为守护程序运行。
 * 方法：
 * public void schedule(TimerTask task,Date time):安排在指定的时间执行指定的任务。如果此时间已过去，则安排立即执行该任务。
 * public void schedule(TimerTask task,Date firstTime,long period):安排指定的任务在指定的时间开始进行重复的固定延迟执行。
 * public void schedule(TimerTask task,long delay):安排在指定延迟后执行指定的任务。
 * public void schedule(TimerTask task,long delay,long period)：安排指定的任务从指定的延迟后开始进行重复的固定延迟执行。
 * public void cancel():终止此计时器，丢弃所有当前已安排的任务。
 * TimerTask:由Timer安排为一次执行或重复执行的任务。
 */
public class TimerDemo {
	public static void main(String[] args) {
		Timer t = new Timer();
		t.schedule(new MyTask(t), 2000);
//		t.cancel();
	}
}
