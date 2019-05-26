package com.tcwgq.demo;

import org.junit.Test;

public class ObjectArrayDemo {
	/**
	 * 请完成下面的代码:
	 * 我有5个学生，请把这个5个学生的信息存储到数组中，并遍历数组，获取得到每一个学生信息。
	 * 学生：Student
	 * 成员变量：name,age
	 * 构造方法：无参,带参
	 * 成员方法：getXxx()/setXxx()
	 * 存储学生的数组?自己想想应该是什么样子的。
	 */
	@Test
	public void fun(){
		Object[] obj = new Object[5];
		Student s1 = new Student("1", 1);
		Student s2 = new Student("2", 2);
		Student s3 = new Student("3", 3);
		Student s4 = new Student("4", 4);
		Student s5 = new Student("5", 5);
		obj[0] = s1;
		obj[1] = s2;
		obj[2] = s3;
		obj[3] = s4;
		obj[4] = s5;
		for(int i = 0;i < obj.length; i++){
			Student s = (Student)obj[i];
			System.out.println("姓名："+s.getName()+"年龄:"+s.getAge());
		}
//		for(Object o:obj){
//			Student s = (Student)o;
//			System.out.println("姓名："+s.getName()+"年龄:"+s.getAge());
//		}
	}

}
