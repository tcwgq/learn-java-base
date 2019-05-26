package com.tcwgq.introspector;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.tcwgq.bean.User;

public class IntrospectorTest {
	public static void main(String[] args) throws IntrospectionException, ClassNotFoundException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		Object user = Class.forName("com.tcwgq.bean.User").newInstance();
		BeanInfo info = Introspector.getBeanInfo(User.class);
		PropertyDescriptor[] propertyDescriptor = info.getPropertyDescriptors();
		for (PropertyDescriptor pd : propertyDescriptor) {
			if (pd.getName().equals("name")) {
				Method write = pd.getWriteMethod();
				write.invoke(user, "zhangSan");
			} else if (pd.getName().equals("id")) {
				Method write = pd.getWriteMethod();
				write.invoke(user, 123);
			} else {
				// 针对名为Class的情况
				// System.out.println("Nothing to do!");
			}
		}
		System.out.println(user);
	}
}
