package com.tcwgq.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class ListDemo1 {
	/**
	 * List<E>集合的特点： 1.允许重复的有序集合，有序指添加元素顺序与遍历元素顺序相同 2.用户可以对列表中的元素插入位置进行精确的控制
	 * 3.用户可以根据列表中的整数索引精确的搜索列表中的元素。
	 */
	@Test
	public void fun() {
		// 测试List集合的有序和可重复特点
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("java");
		list.add(null);// 直接添加null，遍历时显示的也是null
		list.add("world");
		list.add("java");
		list.add("world");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}

}
