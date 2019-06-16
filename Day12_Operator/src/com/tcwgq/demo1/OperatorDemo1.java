package com.tcwgq.demo1;

/**
 * 逻辑运算符：&, |, ^, &&, ||, ! 逻辑运算符用于连接结果是Boolean类型的表达式 &:有false则结果为false
 * |:有true则为true ^:异或运算符，相同则为false，不同则为true，情侣关系：男男，男女，女男，女女，对比记忆
 * !:逻辑非运算符，!false = true, !true = false，偶数个!不改变表达式原来的布尔值
 */
public class OperatorDemo1 {
	public static void main(String[] args) {
		int a = 5;
		int b = 15;
		System.out.println(a > 4 & b > 12);// true
		System.out.println(a > 4 & b < 12);// false
		System.out.println(a < 4 & b > 12);// false
		System.out.println(a < 4 & b < 12);// false
		System.out.println("------------");
		System.out.println(a > 4 | b > 12);// true
		System.out.println(a > 4 | b < 12);// true
		System.out.println(a < 4 | b > 12);// true
		System.out.println(a < 4 | b < 12);// false
		System.out.println("------------");
		System.out.println(a > 4 ^ b > 12);// false
		System.out.println(a > 4 ^ b < 12);// true
		System.out.println(a < 4 ^ b > 12);// true
		System.out.println(a < 4 ^ b < 12);// false
		System.out.println("------------");
		System.out.println(!(b > 12));// false
		System.out.println(!(b < 12));// true
		System.out.println(!!(b > 12));// true
		System.out.println(!!!!(b > 12));// true
		System.out.println(!!!!!!(b > 12));// true
	}

}
