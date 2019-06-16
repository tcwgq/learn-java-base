package com.tcwgq.demo;

/**
 * final修饰变量的初始化时机：
 * A:被final修饰的变量只能被赋值一次
 * B:初始化时机是在构造方法完成前（静态的除外）
 */
public class FinalDemo2 {
	public static void main(String[] args) {
		F f = new F();
		System.out.println(f.a);
		System.out.println(f.c);
		System.out.println(f.d);
	}
}

class F {
	int a = 10;
	final int b = 20;
	int c;
	final int d;

	{
		d = 10;
	}

	public F() {
		a = 100;
		// b = 200;//The final field F.b cannot be assigned
		c = 50;
//		d = 60;// The final field d may already have been assigned
	}
}