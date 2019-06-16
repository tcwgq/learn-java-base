package com.tcwgq.singleton;

/**
 * 双重检查锁定
 */
public class Singleton3 {
	private static Singleton3 instance = null;

	private Singleton3() {

	}

	public static synchronized Singleton3 getInstance() {
		if (instance == null) {
			synchronized (instance) {
				if (instance == null) {
					instance = new Singleton3();
				}
			}
		}
		return instance;
	}
}
