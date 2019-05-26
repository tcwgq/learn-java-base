package com.tcwgq.demo7;

import java.util.Properties;
import java.util.Set;

import org.junit.Test;

public class PropertiesDemo {
	/**
	 * Properties概述：
	 * Properties类表示了一个持久的属性集。
	 * Properties可保存在流中或从流中加载。属性列表中每个键及其对应值都是一个字符串。 
	 * 
	 * 它是Hashtable的子类，说明它是一个Map集合。
	 * 构造方法：
	 * public Properties()：创建一个无默认值的空属性列表。
	 * public Properties(Properties defaults)：创建一个带有指定默认值的空属性列表。 
	 */
	@Test
	public void fun(){
		Properties p = new Properties();
		p.put("a", "Hello");
		p.put("b", "World");
		p.put("c", "Java");
		Set<Object> set = p.keySet();
		for(Object key:set){
			Object ob = p.get(key);
			System.out.println("key:"+key+"--"+"value:"+ob);
		}
//		System.out.println(p);
		
	}

}
