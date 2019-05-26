package com.tcwgq.demo7;

import java.util.Properties;
import java.util.Set;

import org.junit.Test;

public class PropertiesDemo1 {
	/**
	 * Properties的特有方法：
	 * public Object setProperty(String key, String value)：
	 * 调用 Hashtable的方法 put。使用 getProperty方法提供并行性。
	 * 强制要求为属性的键和值使用字符串。返回值是 Hashtable调用 put的结果。
	 * public String getProperty(String key)用指定的键在此属性列表中搜索属性。
	 * 如果在此属性列表中未找到该键，则接着递归检查默认属性列表及其默认值。
	 * 如果未找到属性，则此方法返回 null。
	 * public Set<String> stringPropertyNames()：
	 * 返回此属性列表中的键集，其中该键及其对应值是字符串，
	 * 如果在主属性列表中未找到同名的键，则还包括默认属性列表中不同的键。
	 * 其键或值不是 String 类型的属性被忽略。
	 */
	@Test
	public void fun(){
		Properties prop = new Properties();
		prop.setProperty("a", "aaa");
		prop.setProperty("b", "bbb");
		prop.setProperty("c", "ccc");
		//遍历集合
		Set<String> s = prop.stringPropertyNames();
		for(String key:s){
			System.out.println(key+"--"+prop.getProperty(key));
		}
	}

}
