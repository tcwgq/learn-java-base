package com.tcwgq.demo2;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

public class IteratorTest1 {
	/**
	 * 注意的两个问题：
	 * 1.使用while循环的地方，能不能使用for循环修改呢？
	 * 2.慎重使用next方法，不要多次使用这个方法。
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
//		Iterator<Student> it = al.iterator();
//		while(it.hasNext()){
//			Student s = it.next();
//			System.out.println(s.getName()+":"+s.getAge());
//		}
		//使用for循环改写
		for(Iterator<Student> it = al.iterator();it.hasNext();){
			Student s = it.next();
			System.out.println(s.getName()+":"+s.getAge());
			System.out.println((it.next()).getName()+":"+(it.next()).getAge());//注意，这样写会出现问题，注意next的用法。
		}
	}

}
