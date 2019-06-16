package com.tcwgq.demo3;

public class Test {
	public static void main(String[] args) {
		UserDao ud = new UserDaoImpl();
		ud.add();
		ud.delete();
		ud.update();
		ud.query();
		System.out.println("-------------");
		UserDao ud1 = new UserDaoImpl1();
		ud1.add();
		ud1.delete();
		ud1.update();
		ud1.query();
	}
}
