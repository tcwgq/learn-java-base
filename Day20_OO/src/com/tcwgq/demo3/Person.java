package com.tcwgq.demo3;
/**
 * 几种权限修饰符的介绍：
 * 同一个包
 * 		子类：
 * 		非子类：
 * 不同包
 * 		子类：
 * 		非子类：
 * 
 * 注意：
 * A:private不能用来修饰类
 * B:protected不能用来修饰类
 * 结果：
 * 				同包子类		同包非子类		非同包子类		非同包非子类		同一个类
 * private																		y
 * default			y			y												y
 * protected		y			y				y								y
 * public			y			y				y				y				y
 */
public class Person {
	private void show1() {
		System.out.println("show1");
	}

	void show2() {
		System.out.println("show2");
	}

	protected void show3() {
		System.out.println("show3");
	}

	public void show4() {
		System.out.println("show4");
	}

	public static void main(String[] args) {
		Person p = new Person();
		p.show1();
		p.show2();
		p.show3();
		p.show4();
	}

}
