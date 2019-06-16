package com.tcwgq.demo3;

/**
 * JDK8的新特性：接口中可以有方法了。
 */
public interface Inter {
	public abstract void show();

	public default void method() {
		System.out.println("method");
	}

	public static void function() {
		System.out.println("function");
	}
}
