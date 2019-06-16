package com.tcwgq.demo13;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.tcwgq.jdbc.domain.User;

public class ReflectTest {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class<?> c = User.class;
		// c = Bean.class;
		Object obj = create(c);
		System.out.println(obj);
		System.out.println("---------------");
		myInvoke(obj, "show");
		System.out.println("---------------");
		field(obj.getClass());
		System.out.println("---------------");
		anno(obj.getClass());
	}

	public static Object create(Class<?> c) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Constructor<?> con = c.getConstructor(String.class);
		Object obj = con.newInstance("AAA");
		return obj;
	}

	public static void myInvoke(Object obj, String methodName) throws IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		Method[] methods = obj.getClass().getDeclaredMethods();// 获取本类中的所有方法
		methods = obj.getClass().getMethods();// 获取类中的所有公共方法，包括继承的
		for (Method m : methods) {
			// System.out.println(m.getName());
			if (methodName.equals(m.getName())) {
				m.invoke(obj, null);
			}
		}
		Method m = obj.getClass().getMethod(methodName, null);
		m.invoke(obj, null);
	}

	public static void field(Class<?> c) throws NoSuchFieldException, SecurityException {
		Field[] fields = c.getFields();// 获取所有公共的字段
		fields = c.getDeclaredFields();// 获取所有字段
		for (Field f : fields) {
			System.out.println(f.getName());
		}
		// Field f = c.getDeclaredField("");// 按名称获取字段
	}

	public static void anno(Class<?> c) {
		Annotation[] ats = c.getAnnotations();
		for (Annotation a : ats) {
			System.out.println(a.getClass());
		}
	}
}
