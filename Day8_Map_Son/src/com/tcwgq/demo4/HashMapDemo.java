package com.tcwgq.demo4;

import java.util.HashMap;
import java.util.Set;

import org.junit.Test;

/**
 * HashMap嵌套HashMap
 */
public class HashMapDemo {
	@Test
	public void fun() {
		HashMap<String, HashMap<String, Integer>> hm = new HashMap<String, HashMap<String, Integer>>();
		HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
		hm1.put("aaa", 20);
		hm1.put("bbb", 25);
		hm1.put("ccc", 39);
		HashMap<String, Integer> hm2 = new HashMap<String, Integer>();
		hm2.put("张三", 10);
		hm2.put("李四", 20);
		hm2.put("王五", 35);
		HashMap<String, Integer> hm3 = new HashMap<String, Integer>();
		hm3.put("林青霞", 27);
		hm3.put("王祖贤", 30);
		hm3.put("孟庭苇", 32);
		hm.put("字母", hm1);
		hm.put("男生", hm2);
		hm.put("女生", hm3);
		Set<String> set = hm.keySet();
		for (String key : set) {
			HashMap<String, Integer> map = hm.get(key);
			Set<String> keySet = map.keySet();
			for (String k : keySet) {
				Integer value = map.get(k);
				System.out.println(key + "---" + k + "---" + value);

			}
		}

	}

}
