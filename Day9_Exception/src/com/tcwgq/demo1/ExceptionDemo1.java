package com.tcwgq.demo1;

import org.junit.Test;

public class ExceptionDemo1 {
	@Test
	public void fun() {
		// 分别处理异常
		int a = 10;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("除数不能为0！");
		}
		int[] array = { 1, 2, 3 };
		try {
			System.out.println(array[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组下标越界！");
		}
		System.out.println("over");
	}

	@Test
	public void fun1() {
		int a = 10;
		int b = 0;
		int[] array = { 1, 2, 3 };
		try {
//			System.out.println(array[3]);
			System.out.println(a / b);
			System.out.println(array[3]);
			String s = a > 15 ? "hello" : null;
			System.out.println(s.length());
			System.out.println(s.length());
		} catch (ArithmeticException e) {
			System.out.println("除数不能为0！");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组下标越界！");
		}catch(Exception e){
			System.out.println("出问题了！");
		}
		System.out.println("over");
	}
	

	@Test
	public void fun2() {
		//父类放在最前面不可以
		int a = 10;
		int b = 0;
		int[] array = { 1, 2, 3 };
		try {
//			System.out.println(array[3]);
			System.out.println(a / b);
			System.out.println(array[3]);
			String s = a > 15 ? "hello" : null;
			System.out.println(s.length());
			System.out.println(s.length());
		}catch(Exception e){
			System.out.println("出问题了！");
		} 
//		catch (ArithmeticException e) {
//			System.out.println("除数不能为0！");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("数组下标越界！");
//		}
		System.out.println("over");
	}
}
