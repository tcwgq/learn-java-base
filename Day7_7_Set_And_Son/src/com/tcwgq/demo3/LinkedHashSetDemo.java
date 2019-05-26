package com.tcwgq.demo3;

import java.util.LinkedHashSet;

import org.junit.Test;

/**
 * LinkedHashSet概述：
 * 有序的不可重复的集合，它是HashSet集合的子类
 * 底层是由哈希表和链表实现
 * 哈希表保证元素的唯一性，链表保证元素的有序性
 * 不是同步的，不安全，效率高
 * @author lenovo
 *
 */
public class LinkedHashSetDemo {
	@Test
	public void fun(){
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("hello");
		lhs.add("world");
		lhs.add("java");
		lhs.add("hello");
		for(String s:lhs){
			System.out.println(s);
		}
	}
}
