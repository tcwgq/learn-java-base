package com.tcwgq.demo5;

/**
 * 定义一个类MyMath,提供基本的加减乘除功能，然后进行测试。
 */
public class OOTest3 {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		System.out.println(mm.addition(10, 20));
		System.out.println(mm.subtraction(20, 5));
		System.out.println(mm.division(20, 10));
		System.out.println(mm.multiplication(10, 20));
	}
}

class MyMath {
	public int addition(int a, int b) {
		return a + b;
	}

	public int subtraction(int a, int b) {
		return a - b;
	}

	public int multiplication(int a, int b) {
		return a * b;
	}

	public int division(int a, int b) {
		return a / b;
	}
}