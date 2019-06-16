package com.tcwgq.demo2;
/**
 * 思考题1：请看下面代码有没有问题
 * double d = 12.345;
 * float f = d;
 * 
 * 思考题2：下面两段代码，有什么不同?
 * float f1 = (float)12.345;
 * float f2 = 12.345f;
 */
public class DataTypeDemo3 {
	public static void main(String[] args) {
		double d = 12.345;
//		float f = d;//不行，类型不同
		float ff = (float)d;
		float f1 = (float)12.345;
		float f2 = 12.345f;
	}
}
