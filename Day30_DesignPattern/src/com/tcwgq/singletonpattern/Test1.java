package com.tcwgq.singletonpattern;

public class Test1 {
	public static void main(String[] args) {
		Singleton1 s1 = Singleton1.getSingleton();
		Singleton1 s2 = Singleton1.getSingleton();
		System.out.println(s1 == s2);
		System.out.println(s1);
		System.out.println(s2);
	}
}
