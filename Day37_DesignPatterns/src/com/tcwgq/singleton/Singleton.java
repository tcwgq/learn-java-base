package com.tcwgq.singleton;

/**
 * 单例模式饿汉式
 */
public class Singleton {
	private static Singleton instance = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstance() {
		return instance;
	}
}
