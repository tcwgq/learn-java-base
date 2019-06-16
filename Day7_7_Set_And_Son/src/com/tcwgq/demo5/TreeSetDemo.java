package com.tcwgq.demo5;

import java.util.TreeSet;

import org.junit.Test;

import com.tcwgq.demo5.Student;

/**
 * TreeSet实现自定义对象排序，并遍历，要求按姓名长度从小到大进行排序。
 * @author lenovo
 *
 */
public class TreeSetDemo {
	@Test
	public void fun(){
		TreeSet<Student> ts = new TreeSet<Student>();
		Student s1 = new Student("ab", 10);
		Student s2 = new Student("def", 20);
		Student s3 = new Student("aaaa", 30);
		Student s4 = new Student("a", 40);
		Student s5 = new Student("abc", 10);
		Student s6 = new Student("a", 40);
		Student s7 = new Student("ab", 50);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		ts.add(s7);
		for(Student s:ts){
			System.out.println(s.getName()+"---"+s.getAge());
		}
	}

}
