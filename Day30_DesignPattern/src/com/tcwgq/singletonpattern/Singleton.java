package com.tcwgq.singletonpattern;

/**
 * 单例模式就是要确保类在内存中只有一个对象，该实例必须自动创建，并且对外提供。
 * 下面是饿汉式的单例模式
 */
public class Singleton {
	// 为了不让外界直接访问修改这个值，加private
	private static Singleton s = new Singleton();

	private Singleton() {
		super();
	}

	public static Singleton getSingleton() {
		return s;
	}

}
