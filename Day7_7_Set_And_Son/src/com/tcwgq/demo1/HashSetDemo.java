package com.tcwgq.demo1;

import java.util.HashSet;
import java.util.Iterator;

import org.junit.Test;

/**
 * HashSet存储字符串，并遍历
 * @author lenovo
 * 为什么存储字符串重复的只存储一个呢？
 * Set集合如何实现元素的唯一性存储？
 * Set集合实现的元素唯一性依赖底层的Map集合，Map集合实现元素的唯一性依赖
 * 元素的hashCode和equals方法。
 * 所以要实现元素的唯一性，需要重写对象的hashCode()和equals方法。
 * 不是同步的，不安全的，效率高
 */
public class HashSetDemo {
	@Test
	public void fun(){
		HashSet<String> hs = new HashSet<String>();
		hs.add("hello");
		hs.add("world");
		hs.add("world");
		hs.add("world");
		hs.add("java");
		Iterator<String> it = hs.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
	}
}
