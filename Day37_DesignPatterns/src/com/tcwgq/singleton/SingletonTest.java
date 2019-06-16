package com.tcwgq.singleton;

public class SingletonTest {
	public static void main(String[] args) {
		// 饿汉式
		Singleton s = Singleton.getInstance();
		Singleton s1 = Singleton.getInstance();
		System.out.println(s == s1);
	}
}
