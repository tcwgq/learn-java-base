package com.tcwgq.demo1;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListDemo1 {
	/**
	 * List集合的特有遍历方式
	 */
	@Test
	public void fun0(){
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}

}
