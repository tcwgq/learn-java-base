package com.tcwgq.demo6;

import java.util.Comparator;
import java.util.TreeSet;

import org.junit.Test;
/**
 * TreeSet存储自定义对象，实现排序，并遍历，要求使用比较器排序。
 * 按年龄进行排序，年龄相同，按照名字自然排序。
 * @author lenovo
 *
 */

public class TreeSetDemo {
	@Test
	public void fun(){
		MyComparator mc = new MyComparator();
		TreeSet<Student> ts = new TreeSet<Student>(mc);
		Student s1 = new Student("ab", 10);
		Student s2 = new Student("def", 20);
		Student s3 = new Student("aaaa", 30);
		Student s4 = new Student("a", 40);
		Student s5 = new Student("bc", 10);
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
	
	@Test
	public void fun1(){
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>(){

			@Override
			public int compare(Student o1, Student o2) {
				int a = o1.getAge() - o2.getAge();
				int b = a == 0 ? o1.getName().compareTo(o2.getName()):a;
				return b;
			}
		});
		Student s1 = new Student("ab", 10);
		Student s2 = new Student("def", 20);
		Student s3 = new Student("aaaa", 30);
		Student s4 = new Student("a", 40);
		Student s5 = new Student("bc", 10);
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
