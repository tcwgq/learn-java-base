package com.tcwgq.demo4;

import java.util.TreeSet;

import org.junit.Test;

/**
 * TreeSet存储自定义对象，实现排序，并遍历！
 * @author lenovo
 *
 */
/**
 * ClassCastException:Student cannot be cast to java.lang.Comparable
 * @author lenovo
 *
 */
/**
 * A:没告诉我怎么排序
 *   按年龄大小排序
 * B：没告诉我怎么保证元素的唯一性
 *   属性值都相同即为相同的元素
 * @author lenovo
 *
 */
public class TreeSetDemo1 {
	@Test
	public void fun(){
		TreeSet<Student> ts = new TreeSet<Student>();
		Student s1 = new Student("aaa", 10);
		Student s2 = new Student("bbb", 20);
		Student s3 = new Student("ccc", 30);
		Student s4 = new Student("aaa", 40);
		Student s5 = new Student("ddd", 10);
		Student s6 = new Student("aaa", 10);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		for(Student s:ts){
			System.out.println(s.getName()+"---"+s.getAge());
		}
	}

}
