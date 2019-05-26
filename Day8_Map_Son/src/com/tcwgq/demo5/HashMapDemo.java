package com.tcwgq.demo5;

import java.util.HashMap;
import java.util.Set;

import org.junit.Test;

/**
 * HashMap嵌套HashMap嵌套HashMap(三层嵌套)
 */
public class HashMapDemo {
	@Test
	public void fun() {
		//此题用HashMap多重嵌套代码阅读起来很困难，不如使用ArrayList
		HashMap<String, HashMap<String, HashMap<String, String>>> hm = new HashMap<String, HashMap<String, HashMap<String, String>>>();
		HashMap<String, String> shm1 = new HashMap<String, String>();
		shm1.put("张三", "男");
		shm1.put("李四", "女");
		shm1.put("王五", "男");
		HashMap<String, String> shm2 = new HashMap<String, String>();
		shm2.put("aaa", "aaa");
		shm2.put("bbb", "bbb");
		shm2.put("ccc", "ccc");
		HashMap<String, String> shm3 = new HashMap<String, String>();
		shm3.put("111", "111");
		shm3.put("222", "222");
		shm3.put("333", "333");
		HashMap<String, HashMap<String, String>> chm1 = new HashMap<String, HashMap<String, String>>();
		chm1.put("一班", shm1);
		chm1.put("二班", shm2);
		chm1.put("三班", shm3);
		hm.put("BeiJing", chm1);
		Set<String> set = hm.keySet();
		for (String key : set) {
			HashMap<String, HashMap<String, String>> chm = hm.get(key);
			Set<String> cset = chm.keySet();
			for (String ck : cset) {
				HashMap<String, String> shm = chm.get(ck);
				Set<String> sset = shm.keySet();
				for (String sk : sset) {
					String value = shm.get(sk);
					System.out.println(key + "---" + ck + "---" + sk + "---" + value);
				}
			}
		}
	}
}
