package com.tcwgq.demo2;

import org.junit.Test;

/**
 * 面试题 1.请用最有效率的方式写出计算2乘以8的结果 2.请自己实现两个整数变量的交换，提示可以结合^的特点
 */
public class OperatorTest {
	@Test
	public void fun1() {
		int a = 2;
		int b = 8;
		System.out.println(a * b);//不是效率最高的的
		System.out.println(a << 3);//这才是效率最高的
	}

	@Test
	public void fun2() {
		// 方式一，使用中间变量
		int a = 10;
		int b = 20;
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);
		// 使用^运算符的特点
		a = a ^ b;
		b = a ^ b;// b = a ^ b ^ b = a;
		a = a ^ b;// a = a ^ b ^ a = b;
		// 注意上面的顺序不能打乱

		// 方式三，用变量相加
		a = a + b;
		b = a - b;// b = a + b - b = a;
		a = a - b;// a = a + b - a = b;
		// 注意上面顺序不能打乱

		// 方式四，一句话搞定
		b = (a + b) - (a = b);// a = b, b = a + b - b = a

	}

}
