package com.tcwgq.demo4;

import java.util.Iterator;
import java.util.LinkedList;

import org.junit.Test;

public class LinkedListDemo {
	/**
	 * 请用LinkedList模拟栈数据结构的集合，并测试
	 */
	@Test
	public void fun(){
		LinkedList<String> ll = new LinkedList<String>();
		ll.addFirst("hello");
		ll.addFirst("world");
		ll.addFirst("java");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
	}
	//这样做就错了，没读懂题意，人家要模拟一个类，不是算法实现。

}
