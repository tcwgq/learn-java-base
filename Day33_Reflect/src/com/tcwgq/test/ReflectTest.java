package com.tcwgq.test;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {
	public static void main(String[] args)
			throws IOException, ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		FileReader fr = new FileReader("properties.txt");
		Properties p = new Properties();
		p.load(fr);
		String className = p.getProperty("className");
		String methodName = p.getProperty("methodName");
		Class<?> c = Class.forName(className);
		Constructor<?> con = c.getConstructor();
		Object obj = con.newInstance();
		Method m = c.getMethod(methodName);
		m.invoke(obj);
	}
}
