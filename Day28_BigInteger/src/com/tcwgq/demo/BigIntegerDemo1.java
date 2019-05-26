package com.tcwgq.demo;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * BigInteger的方法： 
 * public BigInteger add(BigInteger val):返回其值为(this + val)的 BigInteger。
 * public BigInteger subtract(BigInteger val):返回其值为(this - val)的 BigInteger。 
 * public BigInteger multiply(BigInteger val):返回其值为(this * val)的 BigInteger。
 * public BigInteger divide(BigInteger val):返回其值为(this / val)的 BigInteger。
 * public BigInteger[] divideAndRemainder(BigInteger val):返回包含(this / val)后跟(this % val)的两个BigInteger的数组。
 */
public class BigIntegerDemo1 {
	public static void main(String[] args) {
		BigInteger i = new BigInteger("100");
		BigInteger ii = new BigInteger("50");
		System.out.println(i.add(ii));
		System.out.println(i.subtract(ii));
		System.out.println(i.multiply(ii));
		System.out.println(i.divide(ii));
		BigInteger[] bi = i.divideAndRemainder(new BigInteger("30"));
		System.out.println(Arrays.toString(bi));
	}
}
