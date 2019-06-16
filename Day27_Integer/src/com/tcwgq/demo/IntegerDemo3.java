package com.tcwgq.demo;

/**
 * int类型和String类型的相互转换。 
 * int --> String
 * String --> int
 */
public class IntegerDemo3 {
	public static void main(String[] args) {
		//int --> String
		//方式一
		int a = 100;
		String s = "" + a;
		System.out.println(s);
		//方式二
		System.out.println(String.valueOf(a));
		//方式三
		Integer i = new Integer(a);
		System.out.println(i.toString());
		//方式四
		System.out.println(Integer.toString(a));
		//String --> int
		//方式一
		Integer ii = new Integer("100");
		//public int intValue():以 int类型返回该Integer的值。
		int aa = ii.intValue();
		System.out.println(aa);
		//方式二
		//public static int parseInt(String s):将字符串参数作为有符号的十进制整数进行解析。
		System.out.println(Integer.parseInt("100"));
	}
}
