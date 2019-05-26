package com.tcwgq.demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.junit.Test;

/**
 * ArrayList存储基本包装类的元素可以排序，存储自定义对象可不可以排序呢? 答案是可以的，但是自定义对象必须实现Comparable接口！
 */
public class CollectionsDemo {
	@Test
	public void fun() {
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student("林青霞", 27);
		Student s2 = new Student("王祖贤", 34);
		Student s3 = new Student("孟庭苇", 29);
		Student s4 = new Student("邓丽君", 19);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		Collections.sort(al);
		// 同时有自然排序和比较器排序，以比较器排序为准
		Collections.sort(al, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				int a = o2.getAge() - o1.getAge();
				int b = a == 0 ? o1.getName().compareTo(o2.getName()) : a;
				return b;
			}
		});
		for (Student s : al) {
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
