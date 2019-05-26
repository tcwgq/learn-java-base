package com.tcwgq.demo1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/**
 * HashMap概述：
 * 基于哈希表的Map接口实现
 * 哈希表的作用是保证元素的唯一性
 */
/**
 * HashMap案例：
 * HashMap<String,String>
 * HashMap<Integer,String>
 * HashMap<String,Student>
 * HashMap<Student,String>
 */
/**
 * HashMap<String,String>
 * @author lenovo
 *
 */
public class HashMapDemo {
	@Test
	public void fun(){
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("杨过", "小龙女");
		hm.put("梁山伯", "祝英台");
		hm.put("牛郎", "织女");
		Set<Map.Entry<String, String>> set = hm.entrySet();
		for(Map.Entry<String, String> entry:set){
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+"---"+value);
		}
	}
	
	/**
	 * HashMap<Integer,String>
	 */
	@Test
	public void fun1(){
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "aaa");
		hm.put(2, "bbb");
		hm.put(3, "ccc");
		hm.put(4, "ddd");
		Set<Integer> set = hm.keySet();
		for(Integer key : set){
			String value = hm.get(key);
			System.out.println(key+"---"+value);
		}
	}
	
	/**
	 * HashMap<String,Student>
	 */
	@Test
	public void fun2(){
		HashMap<String, Student> hm = new HashMap<String, Student>();
		Student s1 = new Student("刘德华", 54);
		Student s2 = new Student("张学友", 48);
		Student s3 = new Student("王杰", 57);
		Student s4 = new Student("黄家驹", 61);
		hm.put("a", s1);
		hm.put("b", s2);
		hm.put("c", s3);
		hm.put("d", s4);
		Set<String> set = hm.keySet();
		for(String key:set){
			Student s = hm.get(key);
			System.out.println(s.getName()+"---"+s.getAge());
		}
	}
	
	/**
	 * HashMap<Student,String>
	 * Student:
	 * 如果两个成员变量的属性值都相同，则为同一个对象！
	 * 键相同，值覆盖！
	 * 此时必须重写Student类的hashCode和equals方法。
	 */
	@Test
	public void fun3(){
		HashMap<Student, String> hm = new HashMap<Student, String>();
		Student s1 = new Student("刘德华", 54);
		Student s2 = new Student("张学友", 48);
		Student s3 = new Student("王杰", 57);
		Student s4 = new Student("黄家驹", 61);
		Student s5 = new Student("刘德华", 54);
		hm.put(s1, "aaa");
		hm.put(s2, "bbb");
		hm.put(s3, "ccc");
		hm.put(s4, "ddd");
		hm.put(s5, "eee");
		Set<Student> set = hm.keySet();
		for(Student key:set){
			String value = hm.get(key);
			System.out.println(key.getName()+"---"+key.getAge()+"---"+value);
		}
	}

}
