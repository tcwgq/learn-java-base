package com.tcwgq.test;

/**
 * 写一个方法： 
 * public void setProperty(Object obj, String propertyName, Object value){}
 * 此方法可将obj对象中名为propertyName的属性的值设置为value。
 */
public class ReflectTest2 {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Student s = new Student();
		ReflectUtil ru = new ReflectUtil();
		ru.setProperty(s, "name", "AAA");
		System.out.println(s);
	}
	
}
