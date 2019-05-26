package com.tcwgq.demo3;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

public class ArrayListDemo {
	/**
	 * 去除集合中字符串的重复值(字符串的内容相同)
	 * 使用两个集合来做，相对简单，请思考，如何在O(1)空间复杂度下实现这个算法。
	 */
	@Test
	public void fun0(){
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> al1 = new ArrayList<String>();
		al.add("hello");
		al.add("world");
		al.add("java");
		al.add("javaee");
		al.add("hello");
		al.add("android");
		al.add("java");
		Iterator<String> it = al.iterator();	
		while(it.hasNext()){
			String s = it.next();
			if(!al1.contains(s)){
				al1.add(s);
			}
		}
		System.out.println(al1);
	}

}
