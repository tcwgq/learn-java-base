package com.tcwgq.demo4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import org.junit.Test;

/**
 * HashMap嵌套ArrayList
 */
public class HashMapDemo1 {
	@Test
	public void fun() {
		HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("aaa");
		al1.add("bbb");
		al1.add("ccc");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("刘备");
		al2.add("关羽");
		al2.add("张飞");
		hm.put("字母", al1);
		hm.put("三国", al2);
		Set<String> set = hm.keySet();
		for(String key : set){
			ArrayList<String> al = hm.get(key);
			for(String s:al){
				System.out.println(key+"---"+s);
			}
		}
	}
}
