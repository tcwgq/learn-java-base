package com.tcwgq.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class GenericDemo {
	/**
	 * ArrayList存储字符串，并遍历。
	 */
	@Test
	public void fun0(){
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");
//		list.add(new Integer(100));//存储的是引用类型
//		list.add(10);//自动装箱
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			//ClassCastException
//			String s  = (String)it.next();
			String s = it.next();
			System.out.println(s);
//			Object obj = it.next();
//			System.out.println(obj);
		}
		
	}

}
