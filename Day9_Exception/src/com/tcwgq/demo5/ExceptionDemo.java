package com.tcwgq.demo5;

/**
 * throw处理异常，如果出现了异常，我们可以把异常抛出，抛出的异常对象！
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		method();
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void method() {
		// 抛出的是运行时异常
		int a = 10;
		int b = 0;
		if (b == 0) {
			throw new ArithmeticException();
		} else {
			System.out.println(a / b);
		}
	}

	private static void method1() throws Exception {
		// 抛出的是编译时异常，调用者必须处理，建议使用try...catch...处理
		int a = 10;
		int b = 0;
		if (b == 0) {
			throw new Exception();
		} else {
			System.out.println(a / b);
		}
	}
}
