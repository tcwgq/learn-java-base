package com.tcwgq.demo1;

import org.junit.Test;

/**
 * if语句和三元运算符的相互转换：
 * 三元运算符的操作都可以使用if语句改进，反之不成立
 * 什么时候不成立呢?
 * 当if语句控制的语句体是一条输出语句的时候，就不成立。
 * 因为三元运算符是一个运算符，必须要求有一个结果返回。
 * 而输出语句却不能作为一个返回结果。
 */
public class CaseStructureDemo3 {
	@Test
	public void fun1(){
		int a = 3;
		String s = (a %2 ==0)?"偶数":"奇数";
		System.out.println(s);
	}
	
	@Test
	public void fun2(){
		int a = 3;
//		String s = (a%2==0) ? System.out.println("奇数") : System.out.println("偶数");//错误，输出语句不能赋值
		System.out.println(a);
	}

}
