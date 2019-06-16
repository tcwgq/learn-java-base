package com.tcwgq.singleton;

public class Singleton5 {

	private static Singleton5 instance = null;

	private Singleton5() {

	}

	// 实例化的时候进行同步，将创建与getInstance分开，单独为创建添加synchronized关键字
	private static synchronized void instanceInit() {
		if (instance == null) {
			instance = new Singleton5();
		}
	}

	public static Singleton5 getInstance() {
		if (instance == null) {
			instanceInit();
		}
		return instance;
	}
}