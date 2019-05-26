package com.tcwgq.demo4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import org.junit.Test;

/**
 * ArrayList嵌套HashMap
 */
public class ArrayListDemo {
	@Test
	public void fun(){
		ArrayList<HashMap<String, String>> al = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> hm1 = new HashMap<String, String>();
		hm1.put("杨过", "小龙女");
		hm1.put("许仙", "白娘子");
		hm1.put("梁山伯", "祝英台");
		HashMap<String, String> hm2 = new HashMap<String, String>();
		hm2.put("aaa", "aaa");
		hm2.put("bbb", "bbb");
		hm2.put("ccc", "ccc");
		al.add(hm1);
		al.add(hm2);
		for(HashMap<String, String> hm : al){
			Set<String> set = hm.keySet();
			for(String key : set){
				String value = hm.get(key);
				System.out.println(key + "---" +value);
			}
		}
	}
}
