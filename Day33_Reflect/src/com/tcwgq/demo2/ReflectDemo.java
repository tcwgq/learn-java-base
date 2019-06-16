package com.tcwgq.demo2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * public Method[] getMethods()：获取类中的所有公共成员方法，包括父类的公共成员方法。
 * public Method[] getDeclaredMethods()：获取本类中的所有成员方法，不包括父类的公共成员方法。
 * public Method getMethod(String name, Class<?>... parameterTypes)：
 * 获取类中的单个成员方法。
 * public Method getDeclaredMethod(String name, Class<?>... parameterTypes)：
 * 获取类中的单个成员方法，不受权限修饰符限制。
 * public Object invoke(Object obj, Object... args)：
 * 对带有指定参数的指定对象调用由此Method对象表示的底层方法。
 */
public class ReflectDemo {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> c = Class.forName("com.tcwgq.demo.Person");
//		Method[] methods = c.getMethods();
//		Method[] methods = c.getDeclaredMethods();
//		for(Method m : methods ){
//			System.out.println(m);
//		}
		//获取类的对象
		Constructor<?> con = c.getConstructor();
		Object obj = con.newInstance();
		//public void show()
		Method m = c.getMethod("show");
		m.invoke(obj);
		//public void method(String s)
		Method m1 = c.getMethod("method", String.class);
		m1.invoke(obj, "HelloWorld");
		//public String getString(String s, int i)
		Method m2 = c.getMethod("getString", String.class, int.class);
		Object objString = m2.invoke(obj, "Helloworld", 100);
		System.out.println(objString);
		//private void function()
		Method m3 = c.getDeclaredMethod("function");
		m3.setAccessible(true);
		m3.invoke(obj);
				
	}
}
