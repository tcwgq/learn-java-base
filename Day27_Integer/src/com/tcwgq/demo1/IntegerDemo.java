package com.tcwgq.demo1;

/**
 * JDK5的新特性
 * 自动装箱：把基本类型转换为包装类类型 int --> Integer
 * 自动拆箱：把包装类类型转换为基本类型 Integer --> int
 * 
 * 注意一个小问题：
 * 		在使用时，Integer  x = null;代码就会出现NullPointerException。
 * 		建议先判断是否为null，然后再使用。
 */
public class IntegerDemo {
	public static void main(String[] args) {
		Integer i = new Integer(100);
		Integer ii = 200;
		ii += 100;
		System.out.println(ii);
		/**
		 * 反编译后的结果：
		 * Integer i = new Integer(100);
		 * Integer ii = Integer.valueOf(200);//自动装箱
		 * ii = Integer.valueOf(ii.intValue() + 100);//自动拆箱，再自动装箱
		 * System.out.println(ii);
		 */
		
		Integer iii = null;
		iii += 200;//NullPointerException
		System.out.println(iii);
	}
}
