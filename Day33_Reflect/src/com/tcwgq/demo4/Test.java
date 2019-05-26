package com.tcwgq.demo4;

import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) {
		UserDao ud = new UserDaoImpl();
		ud.add();
		ud.delete();
		ud.update();
		ud.query();
		System.out.println("--------------");
		Object proxy = Proxy.newProxyInstance(ud.getClass().getClassLoader(), ud.getClass().getInterfaces(),
				new IH(ud));
		ud = (UserDao) proxy;
		ud.add();
		ud.delete();
		ud.update();
		ud.query();
	}
}
