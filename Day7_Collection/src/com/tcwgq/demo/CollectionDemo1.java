package com.tcwgq.demo;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

public class CollectionDemo1 {
	/**
	 * 集合的遍历： 两种方式，一种是集合转化为相应的对象数组，另一种是使用迭代器。
	 */
	/**
	 * 方式一： 集合转化为对象数组。
	 */
	@Test
	public void fun() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("hello");
		al.add("world");
		al.add("java");
		Object[] obj = al.toArray();
		for (int i = 0; i < obj.length; i++) {
			System.out.println((String) obj[i]);
		}
	}
	
	/**
	 * 方式二：迭代器遍历。
	 */
	@Test
	public void fun1(){
		ArrayList<String> al = new ArrayList<String>();
		al.add("hello");
		al.add("world");
		al.add("java");
		Iterator<String> it = al.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
	}

}
