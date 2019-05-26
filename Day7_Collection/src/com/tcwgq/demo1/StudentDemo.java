package com.tcwgq.demo1;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

public class StudentDemo {
	/**
	 * 集合储存自定义对象，并遍历。 要求：创建3个学生对象，存储到集合中，然后转化为对象数组，并遍历。
	 */
	@Test
	public void fun() {
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student("aaa", 10);
		Student s2 = new Student("bbb", 20);
		Student s3 = new Student("ccc", 30);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Object[] obj = al.toArray();
		for (int i = 0; i < obj.length; i++) {
			Student s = (Student) obj[i];
			System.out.println("姓名：" + s.getName() + "年龄：" + s.getAge());
		}
	}

	@Test
	public void fun1() {
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student("aaa", 10);
		Student s2 = new Student("bbb", 20);
		Student s3 = new Student("ccc", 30);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Iterator<Student> it = al.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("姓名：" + s.getName() + "年龄：" + s.getAge());
		}
	}

}
