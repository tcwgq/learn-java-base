package com.tcwgq.demo11;

import java.util.Timer;

/**
 * public void schedule(TimerTask task,long delay,long period)：安排指定的任务从指定的延迟后开始进行重复的固定延迟执行。
 */
public class TimerDemo1 {
	public static void main(String[] args) {
		Timer t = new Timer();
		t.schedule(new MyTask(), 2000, 1000);
	}
}
