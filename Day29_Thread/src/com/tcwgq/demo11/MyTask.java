package com.tcwgq.demo11;

import java.util.Timer;
import java.util.TimerTask;

public class MyTask extends TimerTask {
	private Timer t;

	public MyTask() {
		super();
	}

	public MyTask(Timer t) {
		this.t = t;
	}

	@Override
	public void run() {
		System.out.println("爆炸了！");
//		t.cancel();
	}

}
