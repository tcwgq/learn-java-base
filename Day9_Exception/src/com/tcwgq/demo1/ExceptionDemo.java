package com.tcwgq.demo1;

import org.junit.Test;

/**
 * 异常处理方案：
 * A.try...catch...finally
 * B.throws
 */
/**
 * try...catch...finally 变形格式： A:try...catch... B:try...catch...catch...catch...
 */
public class ExceptionDemo {
	@Test
	public void fun() {
		int a = 10;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException ae) {
			System.out.println("除数不能为0！！！");
		}
		System.out.println("over");
	}

}
