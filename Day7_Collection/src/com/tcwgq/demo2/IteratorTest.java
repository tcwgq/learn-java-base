package com.tcwgq.demo2;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

public class IteratorTest {
	/**
	 * 集合中存储5个自定义对象，使用迭代器遍历。
	 */
	@Test
	public void fun(){
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student("aaa", 10);
		Student s2 = new Student("bbb", 20);
		Student s3 = new Student("ccc", 30);
		Student s4 = new Student("ddd", 40);
		Student s5 = new Student("eee", 50);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		Iterator<Student> it = al.iterator();
		while(it.hasNext()){
			Student s = it.next();
			System.out.println(s.getName()+":"+s.getAge());
		}
	}

}
