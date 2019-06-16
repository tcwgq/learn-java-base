package com.tcwgq.demo1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过反射获取成员变量并使用。
 * public Field[] getFields()：获取所有公共成员变量。
 * public Field[] getDeclaredFields()：获取所有的成员变量。
 * public Field getField(String name)：获取由name指定的公共字段。
 * public Field getDeclaredField(String name)：获取由name指定的类字段。
 * public void set(Object obj, Object value)：将指定对象变量上此Field对象表示的字段设置为指定的新值。
 */
public class ReflectDemo {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
		Class<?> c = Class.forName("com.tcwgq.demo.Person");
//		Field[] fields = c.getFields();
//		Field[] fields = c.getDeclaredFields();
//		for (Field f : fields) {
//			System.out.println(f);
//		}
		/*
		 * Person p = new Person(); p.address = "北京"; System.out.println(p);
		 */
		Constructor<?> con = c.getConstructor();
		Object obj = con.newInstance();
		Field addressField = c.getField("address");
		addressField.set(obj, "BeiJing");
		System.out.println(obj);
		//获取age并对其赋值
		Field ageField = c.getDeclaredField("age");
		ageField.setAccessible(true);
		ageField.set(obj, 25);
		System.out.println(obj);
		//获取name并对其赋值
		Field nameField = c.getDeclaredField("name");
		nameField.setAccessible(true);
		nameField.set(obj, "AAA");
		System.out.println(obj);
	}
}
