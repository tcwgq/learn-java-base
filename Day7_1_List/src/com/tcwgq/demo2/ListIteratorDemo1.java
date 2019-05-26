package com.tcwgq.demo2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.junit.Test;

public class ListIteratorDemo1 {
	/**
	 * 集合修改元素时的并发修改异常问题。 需求：判断List集合中是否有"world"这个元素，有则添加"javaee"。
	 */
	/**
	 * ConcurrentModificationException: 当方法检测到对象的并发修改，但不允许这种修改时，抛出此异常。 例如，某个线程在
	 * Collection 上进行迭代时，通常不允许另一个线性修改该 Collection。
	 */
	/**
	 * 原因： 迭代器是依赖集合存在的，当往集合中添加元素时，迭代器却不知道，此时就会抛出此异常。 即：迭代器在遍历集合时，通过集合是不能修改元素的。
	 */
	/**
	 * 解决办法： A：迭代器迭代元素，迭代器修改元素。 新添加的元素紧跟该元素之后。 B:集合遍历元素，集合修改元素。 新添加的元素在集合末尾。
	 */
	@Test
	public void fun0() {
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next();
			if (s.equals("world")) {
				list.add("javaee");
			}
		}
		System.out.println(list);
	}

	@Test
	public void fun1() {
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");
		ListIterator<String> it = list.listIterator();
		while (it.hasNext()) {
			String s = it.next();
			if (s.equals("world")) {
				it.add("javaee");
			}
		}
		System.out.println(list);
	}

	@Test
	public void fun2(){
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");
		for(int i=0;i<list.size();i++){
			String s = list.get(i);
			if(s.equals("world")){
				list.add("javaee");
			}
		}
			
		System.out.println(list);
	}

}
