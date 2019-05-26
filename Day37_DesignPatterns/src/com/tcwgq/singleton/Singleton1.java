package com.tcwgq.singleton;

/**
 * 单例模式懒汉式 
 * 线程不安全
 */
public class Singleton1 {
	private static Singleton1 instance = null;

	private Singleton1() {

	}

	public static Singleton1 getInstance() {
		if (instance == null)
			instance = new Singleton1();
		return instance;
	}
}
