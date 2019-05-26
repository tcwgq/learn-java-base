package com.tcwgq.demo3;

import org.junit.Test;

/**
 * 获取两个整数中的最大值 获取三个整数中的最大值 比较两个整数是否相同
 */
public class OperatorTest {
	@Test
	public void fun1() {
		int a = 10;
		int b = 20;
		int max = a > b ? a : b;
		System.out.println(max);
	}

	@Test
	public void fun2() {
		int x = 10;
		int y = 15;
		int z = 20;
		int max = (x > y? x : y) > z ? (x > y? x : y):z;
		System.out.println(max);
	}

	@Test
	public void fun3() {
		int a = 10;
		int b = 20;
		boolean flag = a==b ? true:false;//没必要这样比较
		flag = a == b;
		System.out.println(flag);

	}

}
