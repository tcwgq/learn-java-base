package com.tcwgq.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * 我给你ArrayList<Integer>的一个对象，我想在这个集合中添加一个字符串数据，如何实现呢？
 * 通过反射越过了泛型检查。
 */
public class ReflectTest1 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		ArrayList<Integer> al = new ArrayList<Integer>();
		// al.add("hello");
		Class<?> c = al.getClass();
		Method m = c.getMethod("add", Object.class);
		m.invoke(al, "hello");
		System.out.println(al);
	}
}
