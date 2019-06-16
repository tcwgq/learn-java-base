package com.tcwgq.test;

import java.lang.reflect.Field;

/**
 * 写一个方法： 
 * public void setProperty(Object obj, String propertyName, Object value){} 
 * 此方法可将obj对象中名为propertyName的属性的值设置为value。
 */
public class ReflectUtil {
	public void setProperty(Object obj, String propertyName, Object value)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Class<?> c = obj.getClass();
		Field f = c.getDeclaredField(propertyName);
		f.setAccessible(true);
		f.set(obj, value);
	}
}
