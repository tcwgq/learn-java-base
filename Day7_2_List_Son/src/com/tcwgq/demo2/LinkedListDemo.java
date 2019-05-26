package com.tcwgq.demo2;

import java.util.LinkedList;

import org.junit.Test;

public class LinkedListDemo {
	/**
	 * LinkedList概述：
	 * List接口的链接列表实现。实现所有可选的列表操作，并且允许所有元素（包括 null）。
	 * 除了实现 List接口外，LinkedList类还为在列表的开头及结尾 get、remove和 insert元素提供了统一的命名方法。
	 * 这些操作允许将链接列表用作堆栈、队列或双端队列。
	 * 特殊方法：
	 * A.添加功能
	 *   public void addFirst(E e)将指定元素插入此列表的开头。
	 *   public void addLast(E e)将指定元素添加到此列表的结尾。实质上等于集合的add方法。
	 * B.获取功能：
	 *   public E getFirst()返回此列表的第一个元素。
	 *   public E getLast()返回此列表的最后一个元素。
	 * C.移除功能
	 *   public E removeFirst()移除并返回此列表的第一个元素。
	 *   public E removeLast()移除并返回此列表的最后一个元素。
	 * 
	 */
	@Test
	public void fun0(){
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("hello");
		ll.add("world");
		ll.addLast("android");
		ll.add("java");
		ll.addFirst("javaee");
//		ll.addLast("android");
		System.out.println("getFirst:"+ll.getFirst());
		System.out.println("getLast:"+ll.getLast());
		System.out.println("removeFirst:"+ll.removeFirst());
		System.out.println("removeLast:"+ll.removeLast());
		System.out.println(ll);
	}

}
