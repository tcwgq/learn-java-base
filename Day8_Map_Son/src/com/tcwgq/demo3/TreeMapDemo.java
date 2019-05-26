package com.tcwgq.demo3;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Test;

/**
 * TreeMap: 基于红黑树（Red-Black tree）的 NavigableMap 实现。 该映射根据其键的Comparable进行排序，
 * 或者根据创建映射时提供的 Comparator进行排序，具体取决于使用的构造方法。
 * 
 * TreeMap<String,String>
 */
public class TreeMapDemo {
	@Test
	public void fun() {
		TreeMap<String, String> tm = new TreeMap<String, String>();
		tm.put("pouh", "ccc");
		tm.put("fghbpiu", "bbb");
		tm.put("ew", "ddd");
		tm.put("uio", "aaa");
		Set<String> set = tm.keySet();
		for (String key : set) {
			String value = tm.get(key);
			System.out.println(key + "---" + value);
		}
	}
	
	/**
	 * TreeMap<String,String>
	 * 要求按照学生年龄进行排序。
	 */
	@Test
	public void fun1(){
		TreeMap<Student, String> tm = new TreeMap<Student, String>();
		Student s1 = new Student("林青霞", 27);
		Student s2 = new Student("王祖贤", 30);
		Student s3 = new Student("孟庭苇", 41);
		Student s4 = new Student("邓丽君", 56);
		tm.put(s1, "aaa");
		tm.put(s2, "bbb");
		tm.put(s3, "ccc");
		tm.put(s4, "ddd");
		Set<Student> set = tm.keySet();
		for(Student key : set){
			String value = tm.get(key);
			System.out.println(key.getName() + "---" +key.getAge() + "---" + value);
		}
		
	}
	
	@Test
	public void fun2(){
		TreeMap<Student, String> tm = new TreeMap<Student, String>(new Comparator<Student>(){
			@Override
			public int compare(Student o1, Student o2) {
				int a = o1.getAge() - o2.getAge();
				int b = a==0?o1.getName().compareTo(o2.getName()):a;
				return b;
			}
		});
		Student s1 = new Student("林青霞", 27);
		Student s2 = new Student("王祖贤", 30);
		Student s3 = new Student("孟庭苇", 41);
		Student s4 = new Student("邓丽君", 56);
		tm.put(s1, "aaa");
		tm.put(s2, "bbb");
		tm.put(s3, "ccc");
		tm.put(s4, "ddd");
		Set<Student> set = tm.keySet();
		for(Student key : set){
			String value = tm.get(key);
			System.out.println(key.getName() + "---" +key.getAge() + "---" + value);
		}
		
	}
}
