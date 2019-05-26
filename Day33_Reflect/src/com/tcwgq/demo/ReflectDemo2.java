package com.tcwgq.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 需求：通过反射去获取该构造方法并使用：
 * public Person(String name, int age, String address)。
 * 即实现下面的效果：
 * Person p = new Person("aaa", 25, "北京");
 */
public class ReflectDemo2 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> c = Class.forName("com.tcwgq.demo.Person");
		Constructor<?> con = c.getConstructor(String.class, int.class, String.class);
		Object obj = con.newInstance("aaa", 25, "BeiJing");
		System.out.println(obj);
	}
}
