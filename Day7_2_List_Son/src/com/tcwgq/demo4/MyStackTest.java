package com.tcwgq.demo4;

public class MyStackTest {
	public static void main(String[] args) {
		MyStack<String> ms = new MyStack<String>();
		ms.add("hello");
		ms.add("world");
		ms.add("java");
//		System.out.println(ms.get());
//		System.out.println(ms.get());
//		System.out.println(ms.get());
//		//NoSuchElementException
//		//需提供一个判断函数
//		System.out.println(ms.get());
		while(!ms.isEmpty()){
			System.out.println(ms.get());
		}
	}

}
