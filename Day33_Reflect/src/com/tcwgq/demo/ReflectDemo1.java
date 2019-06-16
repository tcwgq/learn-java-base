package com.tcwgq.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过反射获取构造方法并使用。
 * public Constructor<?>[] getConstructors()：获取所有公共构造方法。
 * public Constructor<?>[] getDeclaredConstructors()：获取所有构造方法。
 * public Constructor<T> getConstructor(Class<?>... parameterTypes)：获取单个公共构造方法。
 * public Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)：获取单个所有权限修饰的构造方法。
 * public T newInstance(Object... initargs)：
 * 使用此Constructor对象表示的构造方法来创建该构造方法的声明类的新实例，并用指定的初始化参数初始化该实例。
 */
public class ReflectDemo1 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> c = Class.forName("com.tcwgq.demo.Person");
//		Constructor<?>[] cons = c.getConstructors();
		Constructor<?>[] cons = c.getDeclaredConstructors();
		for (Constructor<?> ct : cons) {
			System.out.println(ct);
		}
		System.out.println("-----------------");
		Constructor<?> C = c.getConstructor();
		System.out.println(C.getName());
		Object obj = C.newInstance();
		System.out.println(obj);
	}
}
