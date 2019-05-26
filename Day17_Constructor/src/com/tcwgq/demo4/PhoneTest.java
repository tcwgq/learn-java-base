package com.tcwgq.demo4;

public class PhoneTest {
	public static void main(String[] args) {
		Phone p = new Phone();
		System.out.println(p);
		p.setBrand("apple");
		p.setPrice(5288);
		p.setColor("black");
		System.out.println(p);
		Phone p1 = new Phone("nokia", 1999, "white");
		System.out.println(p1);
	}
}
