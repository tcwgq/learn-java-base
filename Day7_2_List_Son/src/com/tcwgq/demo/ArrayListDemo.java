package com.tcwgq.demo;

import java.util.ArrayList;

import org.junit.Test;

public class ArrayListDemo {
	/**
	 * ArrayList集合的特点：
	 * 底层数据结构是对象数组，查找快，增删慢。
	 * 线程不安全，效率高
	 */
	/**
	 * ArrayList存储自定义对象并遍历
	 */
	@Test
	public void fun0(){
		ArrayList<String> al = new ArrayList<String>();
		al.add("hello");
		al.add("world");
		al.add("java");
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		
	}
	
	/**
	 * ArrayList存储自定义对象并遍历。
	 */
	@Test
	public void fun1(){
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student("aaa", 10);
		Student s2 = new Student("bbb", 20);
		Student s3 = new Student("ccc", 30);
		Student s4 = new Student("ddd", 40);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		for(int i=0;i<al.size();i++){
			Student s = al.get(i);
			System.out.println(s.getName()+"--"+s.getAge());
		}
	}

}
