package com.tcwgq.demo;

import org.junit.Test;

/**
 * Throwable:Throwable 类是 Java语言中所有错误或异常的超类。
 * 严重问题：Error，不作处理，因为我们处理不了，比如内存溢出。
 * Exception：异常
 *   编译期异常：不是RuntimeException的异常，都是编译期异常，必须处理，不处理，编译不能通过！
 *   运行时异常：RuntimeException，不作处理，出现这个问题，说明我们的程序不够严谨，需要改正。
 *   
 * JVM对异常的默认处理：
 * 把异常出现的线程位置，异常的名称，出现的原因以及异常在程序中出现的位置信息打印在控制台。
 * 同时结束程序！
 * @author lenovo
 *
 */
public class ExceptionDemo {
	@Test
	public void fun() {
		int a = 20;
//		int b = 2;
		int b = 0;
		//ArithmeticException:/by zero
		System.out.println(a / b);
		System.out.println("over");
	}

}
