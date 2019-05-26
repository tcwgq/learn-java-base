package com.tcwgq.demo5;

/**
 * 定义一个类Demo,其中定义一个求两个数据和的方法，定义一个测试了Test，进行测试。 
 * 变量什么时候定义为成员变量：
 * 如果这个变量是用来描述这个类的信息的，那么，该变量就应该定义为成员变量。
 * 变量到底定义在哪里好呢? 变量的范围是越小越好。因为能及时的被回收。
 */
public class OOTest {
	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		System.out.println(d1.sum());
		Demo2 d2 = new Demo2();
		System.out.println(d2.sum(10, 20));
		Demo3 d3 = new Demo3();
		d3.a = 10;
		d3.b = 20;
		System.out.println(d3.sum());
	}
}

class Demo1 {
	public Demo1() {

	}

	public int sum() {
		int a = 10;
		int b = 20;
		return a + b;
	}
}

class Demo2 {
	public Demo2() {

	}

	public int sum(int a, int b) {
		return a + b;
	}
}

class Demo3 {
	int a;
	int b;

	public Demo3() {

	}

	public int sum() {
		return a + b;
	}
}
