package com.tcwgq.demo2;

import org.junit.Test;

/**
 * 数据类型转换：默认转换和强制类型转换。 默认转换：(精度低的转换为精度高的) byte, short, char - int - long - float
 * - double byte, short, char之间不作转换，参与运算，它们首先转换成int类型。 强制类型转换： 目标类型 变量名=(目标类型)
 * 被转换的数据) ; 注意： boolean类型，不能转换为其他类型。
 */
public class DataTypeDemo2 {
	@Test
	public void fun() {
		byte b = 3;
		short s = 5;
		int i = 7;
		char ch = 'a';
		// byte c = b + i;
		// 错误，提示int类型不能转化为byte类型，说明运算时byte类型先转化为int类型，
		// 这样不会损失精度，运算结果为int类型，转换为int类型，会损失精度。
		int cc = b + i;// byte类型首先转换为int类型。
		System.out.println(b + s);
		System.out.println(b + i);
		System.out.println(b + ch);
		System.out.println(s + i);
		System.out.println(s + ch);
		System.out.println(i + ch);
		boolean b1 = true;
		boolean b2 = false;
		// int r1 = b1 + i;//布尔类型不能转换为其他类型
		// int r2 = b2 + i;//布尔类型不能转换为其他类型
	}
	//强制类型转换，从精度高的转换到精度低的。
	//不要随意使用强制类型转换，因为它隐含了精度损失问题。
	@Test
	public void fun1(){
		byte b = 10;
		int a = 5;
		byte c = (byte)(a + b);
//		byte cc = (int)a + b;//先强转a，再加b，这种方式不行
		System.out.println(c);
	}

}
