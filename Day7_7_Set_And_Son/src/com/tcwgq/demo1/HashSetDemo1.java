package com.tcwgq.demo1;

import java.util.HashSet;

import org.junit.Test;

/**
 * HashSet存储自定义对象，要求对象必须唯一，并遍历。
 * @author lenovo
 * 注意：
 * 需要重写自定义对象的hashCode和equals方法。
 */
public class HashSetDemo1 {
	@Test
	public void fun(){
		//实现元素的唯一性添加
		 HashSet<Student> hs = new HashSet<Student>();
		 Student s1 = new Student("张三", 10);
		 Student s2 = new Student("李四", 20);
		 Student s3 = new Student("王五", 30);
		 Student s4 = new Student("张三", 100);
		 Student s5 = new Student("赵六", 20);
		 hs.add(s1);
		 hs.add(s2);
		 hs.add(s3);
		 hs.add(s4);
		 hs.add(s5);
		 for(Student s:hs){
			 System.out.println(s.getName()+"---"+s.getAge());
		 }
	}
}
