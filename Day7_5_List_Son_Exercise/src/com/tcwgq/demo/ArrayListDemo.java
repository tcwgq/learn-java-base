package com.tcwgq.demo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 集合的嵌套遍历
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Student> al1 = new ArrayList<Student>();
		Student s11 = new Student("aaa1", 10);
		Student s12 = new Student("bbb1", 20);
		Student s13 = new Student("ccc1", 30);
		al1.add(s11);
		al1.add(s12);
		al1.add(s13);
		ArrayList<Student> al2 = new ArrayList<Student>();
		Student s21 = new Student("aaa2", 10);
		Student s22 = new Student("bbb2", 20);
		Student s23 = new Student("ccc2", 30);
		al2.add(s21);
		al2.add(s22);
		al2.add(s23);
		ArrayList<Student> al3 = new ArrayList<Student>();
		Student s31 = new Student("aaa3", 10);
		Student s32 = new Student("bbb3", 20);
		Student s33 = new Student("ccc3", 30);
		al3.add(s31);
		al3.add(s32);
		al3.add(s33);
		ArrayList<ArrayList<Student>> al = new ArrayList<ArrayList<Student>>();
		al.add(al1);
		al.add(al2);
		al.add(al3);
		Iterator<ArrayList<Student>> it = al.iterator();
		while(it.hasNext()){
			ArrayList<Student> arraylist = it.next();
			for(Student s:arraylist){
				System.out.println(s.getName()+"---"+s.getAge());
			}
			System.out.println("-----------------");
		}
	}

}
