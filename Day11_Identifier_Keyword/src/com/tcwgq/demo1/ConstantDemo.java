package com.tcwgq.demo1;
/**
 * 常量：在程序执行的过程中其值不可以发生改变
 * 分类：
 * 字面值常量：字符串，整数，小数，字符，布尔值，null
 * 自定义常量：final关键字修饰的变量，其值不可以被修改
 */
public class ConstantDemo {
	public static void main(String[] args) {
		String s = "Hello world, java!";//"Hello world, java!"这是字面值常量，s不是常量！
		System.out.println(s);
		int a = 10;//10是常量，a不是常量！
		System.out.println(a);
		float f = 0.134f;//同上
		System.out.println(f);
		char ch = 'a';//同上
		System.out.println(ch);
		boolean b = false;//同上
		System.out.println(b);
	}

}
