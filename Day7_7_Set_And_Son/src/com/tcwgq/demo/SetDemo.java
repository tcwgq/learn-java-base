package com.tcwgq.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

/**
 * Set集合概述：
 * 不允许重复的无序集合，即无序不可重复的集合。
 * 无序是指存入元素的顺序与取出元素的顺序不同。
 * @author lenovo
 *
 */
public class SetDemo {
	@Test
	public void fun(){
		//验证Set集合的无序和唯一性
		Set<String> set = new HashSet<String>();
		set.add("hello");
		set.add("world");
		set.add("java");
		set.add("hello");
		set.add("world");
		set.add("java");
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
	}
}
