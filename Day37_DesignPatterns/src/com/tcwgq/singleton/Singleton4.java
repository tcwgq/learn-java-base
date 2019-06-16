package com.tcwgq.singleton;

/**
 * 静态内部类
 */
public class Singleton4 {
	private Singleton4() {

	}

	private static class SingletonFactory {
		private static Singleton4 instance = new Singleton4();
	}

	public static Singleton4 getInstance() {
		return SingletonFactory.instance;
	}

}
