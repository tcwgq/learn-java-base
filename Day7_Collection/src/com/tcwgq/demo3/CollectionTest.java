package com.tcwgq.demo3;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

public class CollectionTest {
	/**
	 * 集合存储字符串并遍历
	 */
	@Test
	public void fun(){
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
