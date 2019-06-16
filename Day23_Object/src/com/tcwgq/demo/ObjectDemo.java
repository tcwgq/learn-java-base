package com.tcwgq.demo;

/**
 * 类 Object 是类层次结构的根类。每个类都使用 Object 作为超类。 
 * 所有对象（包括数组）都实现这个类的方法。
 * 
 * 构造方法:
 * public Object():
 * 回想面向对象中为什么说：
 * 子类的构造方法默认访问的是父类的无参构造方法
 * 成员方法：
 * public int hashCode():返回对象的哈希码值，注意哈希码值使用哈希算法得到的，
 * 不是实际的地址值，而是根据地址值得到的一个值
 * public final Class getClass()
 * public String toString()
 * public boolean equals(Object obj)
 * protected void finalize()
 * protected Object clone()
 */
public class ObjectDemo {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.hashCode());//705927765
		Student s1 = new Student();
		System.out.println(s1.hashCode());//366712642
		Student s2 = s;
		System.out.println(s2.hashCode());//705927765
	}
}
