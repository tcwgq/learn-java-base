package com.tcwgq.demo;

/**
 * Integer的构造方法：
 * public Integer(int value)：构造一个新分配的 Integer对象，它表示指定的 int值
 * public Integer(String s) throws NumberFormatException：构造一个新分配的 Integer对象，它表示 String参数所指示的int值。
 * 使用与parseInt方法（对基数为 10 的值）相同的方式将该字符串转换成int值。
 */
public class IntegerDemo1 {
	public static void main(String[] args) {
		Integer i = new Integer(100);
		System.out.println(i);
		String s = "200";
		Integer i1 = new Integer(s);
		System.out.println(i1);
		System.out.println(new Integer("123jkl"));//java.lang.NumberFormatException
	}
}
