package com.tcwgq.demo;

/**
 * public final Class<?> getClass(): 返回此 Object 的运行时类。
 * 返回的 Class 对象是由所表示类的 static synchronized 方法锁定的对象。
 * public String getName():以 String 的形式返回此 Class 对象所表示的实体（类、接口、数组类、基本类型或 void）名称。
 */
public class ObjectDemo1 {
	public static void main(String[] args) {
		Student s = new Student();
		Class<? extends Student> c = s.getClass();
		System.out.println(c.getName());
	}
}
