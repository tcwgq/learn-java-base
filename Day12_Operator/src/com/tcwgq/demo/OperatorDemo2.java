package com.tcwgq.demo;

/**
 * +的几种用法： A:算数运算符+，表示加法 B:表示正数的正号 C:字符串连接符
 */
public class OperatorDemo2 {
	public static void main(String[] args) {
		System.out.println(3 + 2);
		System.out.println(+4);//正号
		System.out.println(-5);//负号
		System.out.println(+4-5);//运算
		System.out.println('a');//a
		System.out.println('a'+1);//98
		System.out.println("hello"+'a'+1);//helloa1
		System.out.println('a'+1+"hello");//98hello
		System.out.println("5+5="+5+5);//5+5=55
		System.out.println(5+5+"=5+5");//10=5+5
	}

}
