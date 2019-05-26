package com.tcwgq.demo2;

/**
 * ^的特点： 一个数据对另一个数据异或两次，被异或的数据不变。
 */
public class OperatorDemo1 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a ^ b ^ b);// 10
		System.out.println(b ^ a ^ b);// 10
		System.out.println(b ^ b ^ a);// 10
		System.out.println(b ^ a ^ a);// 20
		System.out.println(a ^ b ^ a);// 20
		System.out.println(a ^ a ^ b);// 20
	}

}
