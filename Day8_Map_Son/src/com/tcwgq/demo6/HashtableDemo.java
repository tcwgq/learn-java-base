package com.tcwgq.demo6;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

import org.junit.Test;

/**
 * HashMap和Hashtable的区别：
 * HashMap:线程不安全，允许使用null作为键或值，效率高。
 * Hashtable:线程安全，不允许使用null作为键或值，效率低。
 */
public class HashtableDemo {
	@Test
	public void fun(){
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("111", "hello");
		hm.put(null, "world");
		hm.put("333", null);
		Set<String> set = hm.keySet();
		for(String key : set){
			String value = hm.get(key);
			System.out.println(key + "---" + value);
		}
	}
	
	@Test
	public void fun1(){
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("111", "hello");
//		ht.put(null, "world");
//		ht.put("333", null);
		Set<String> set = ht.keySet();
		for(String key : set){
			String value = ht.get(key);
			System.out.println(key + "---" + value);
		}
	}
}
