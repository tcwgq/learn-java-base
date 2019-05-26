package com.tcwgq.demo2;

import java.util.LinkedHashMap;
import java.util.Set;

import org.junit.Test;

/**
 * Map接口的哈希表和链接表的实现，具有可预知的迭代顺序。
 * 由哈希表保证元素的唯一性，由链表保证有序性。
 * @author lenovo
 *
 */
public class LinkedHashMapDemo {
	@Test
	public void fun(){
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		lhm.put("aaa", "111");
		lhm.put("bbb", "222");
		lhm.put("ccc", "333");
		lhm.put("ddd", "444");
		lhm.put("aaa", "asdf");
		Set<String> set = lhm.keySet();
		for(String key : set){
			String value = lhm.get(key);
			System.out.println(key + "---"+ value);
		}
	}

}
