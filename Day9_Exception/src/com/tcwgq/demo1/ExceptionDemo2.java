package com.tcwgq.demo1;

import org.junit.Test;
/**
 * JDK7新出现的异常处理方式：
 * try{
 * 		可能出现异常的代码
 * }catch(Exception1 | Exception2 | ...ExceptionN 变量名){
 * 		处理异常的代码
 * }
 * 注意：
 * A.多个异常必须是平级关系，不能是父子关系
 * B.只能针对多个异常做出相同的处理，不能分别处理
 * @author lenovo
 *
 */
public class ExceptionDemo2 {
	@Test
	public void fun() {
		int a = 10;
		int b = 0;
		int[] array = { 1, 2, 3 };
		try {
			System.out.println(a / b);
			System.out.println(array[3]);
			String s = a > 15 ? "hello" : null;
			System.out.println(s.length());
		} catch (ArithmeticException |ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} 
		System.out.println("over");
	}

}
