package com.tcwgq.demo2;
/**
 * public boolean equals(Object obj):指示其他某个对象是否与此对象“相等”。 
 * equals方法源码：
 *  public boolean equals(Object obj) {
 *       return (this == obj);
 *  }
 * 默认比较的是对象的地址值，没什么意义
 * 比较对象的属性值才有意义，重写这个方法时就是比较对象的成员变量值
 * 注意：
 * == 
 * 基本类型：值是否相等
 * 引用类型：地址值是否相等
 * equals方法
 * 默认比较的是地址值是否相同
 * 重写该方法后，比较的是对象的成员变量值是否相同
 */
public class ObjectDemo {
	public static void main(String[] args) {
		Student s1 = new Student("aaa", 15);
		Student s2 = new Student("aaa", 15);
		System.out.println(s1 == s2);
		Student s3 = s1;
		System.out.println(s1 == s3);
		System.out.println("---------------");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s1));
		System.out.println(s1.equals(s3));
		Student s4 = new Student("bbb", 25);
		System.out.println(s1.equals(s4));
		System.out.println("------------");
		Teacher t = new Teacher("teacher", 37);
		System.out.println(s1.equals(t));//ClassCastException
	}
}
