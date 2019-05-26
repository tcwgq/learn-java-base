package com.tcwgq.demo3;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

public class ArrayListDemo2 {
	/**
	 * 去除集合中自定义对象的重复值(对象的成员变量值都相同)
	 */
	@Test
	public void fun0() {
		/**
		 * contains方法的底层依赖equals方法。
		 * Student类中没有重写equals方法，则使用Object的equals方式，从而比较的是地址值。
		 * 解决上述问题：需要重写Student的equals方法，自动生成即可。
		 */
		/**
		 * 注意复制代码时容易把别的包下的类导入进来！！！
		 */
		ArrayList<Student> al = new ArrayList<Student>();
		ArrayList<Student> nal = new ArrayList<Student>();
		Student s1 = new Student("aaa", 10);
		Student s2 = new Student("bbb", 20);
		Student s3 = new Student("ccc", 30);
		Student s4 = new Student("aaa", 20);
		Student s5 = new Student("ddd", 10);
		Student s6 = new Student("aaa", 10);
		Student s7 = new Student("aaa", 10);
		Student s8 = new Student("aaa", 10);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		al.add(s6);
		al.add(s7);
		al.add(s8);
		Iterator<Student> it = al.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			if (!nal.contains(s)) {
				nal.add(s);
			}
		}
		for (int i = 0; i < nal.size(); i++) {
			Student s = nal.get(i);
			System.out.println(s.getName() + "--" + s.getAge());
		}

	}

}
