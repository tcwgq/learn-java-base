package com.tcwgq.demo;

/*
   运算符：
   算术运算符
   赋值运算符
   比较运算符
   逻辑运算符
   位运算符
    三目运算符
 */
/**
 * 算数运算符： +, -, *, /, %, ++, --
 */
public class OperatorDemo {
	public static void main(String[] args) {
		int a = 3;
		int b = 2;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);// 注意，整数与整数相除，结果仍为整数。
		System.out.println(b * 1.0 / a);
		// 就是想获取小数结果，那么可以在运算过程中引入小数，b * 1.0转换为double类型，
		// 再除以a，结果为double类型
		System.out.println(a % b);// 取余运算符
	}

}
