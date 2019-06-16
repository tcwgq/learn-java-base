package com.tcwgq.demo;

import java.math.BigInteger;

/**
 * BigInteger:不可变的任意精度的整数。
 * 构造方法：
 * public BigInteger(String val)：将BigInteger的十进制字符串表示形式转换为 BigInteger。
 * public BigInteger(String val,int radix)：将指定基数的BigInteger的字符串表示形式转换为 BigInteger。
 */
public class BigIntegerDemo {
	public static void main(String[] args) {
		Integer i = new Integer(100);
		System.out.println(i);
		System.out.println(Integer.MAX_VALUE);
		Integer ii = new Integer("1000");
		System.out.println(ii);
		//NumberFormatException，已超出Integer的范围
//		Integer iii = new Integer("2147483648");
//		System.out.println(iii);
		BigInteger bi = new BigInteger("2147483648");
		System.out.println(bi);
	}
}
