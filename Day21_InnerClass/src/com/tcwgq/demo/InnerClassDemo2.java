package com.tcwgq.demo;

/**
 * 成员内部类：在成员位置定义的内部类
 * 如何直接访问内部类的成员呢？
 * 格式：
 * 外部类.内部类 对象名 = new 外部类().内部类();
 */
public class InnerClassDemo2 {
	public static void main(String[] args) {
		Outer2 o = new Outer2();
//		The method show() is undefined for the type Outer2
//		o.show();
//		Inner2 i = new Inner2();
//		i.show();
		Outer2.Inner2 oi = new Outer2().new Inner2();
		oi.show();
	}
}

class Outer2 {
	private int num = 10;
	class Inner2 {
		public void show(){
			System.out.println(num);
		}
	}
}
