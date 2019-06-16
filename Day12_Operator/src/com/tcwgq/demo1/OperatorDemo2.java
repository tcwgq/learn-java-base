package com.tcwgq.demo1;

/**
 * &与&&的区别，同理|与||的区别： &不论左边为true还是false，右边都进行比较
 * &&左边为假时不比较右边，左边为true时才比较右边，即只有左边为true时才比较右边！
 * |与||的区别：
 * |不管左边为true还是false，右边都进行比较
 * ||只有左边为false时，才比较右边
 */
public class OperatorDemo2 {
	public static void main(String[] args) {
		int a = 5;
		int b = 15;
		System.out.println(a > 4 && b > 12);// true
		System.out.println(a > 4 && b < 12);// false
		System.out.println(a < 4 && b > 12);// false
		System.out.println(a < 4 && b < 12);// false
		System.out.println("-----------");
		int x1 = 1;
		int y1 = 3;
		boolean f1 = (x1++ == 3 & y1++ == 4);// false & false = false
		System.out.println(f1);// false
		System.out.println(x1);// 2
		System.out.println(y1);// 4
		int x2 = 1;
		int y2 = 3;
		boolean f2 = (x2++ == 3 && y2++ == 4);// false && false = false
		System.out.println(f2);// false
		System.out.println(x2);// 2
		System.out.println(y2);// 3
		int x3 = 1;
		int y3 = 3;
		boolean f3 = (x3++ == 1 && y3++ == 4);// true && false = false
		System.out.println(f3);// false
		System.out.println(x3);// 2
		System.out.println(y3);// 4
	}

}
