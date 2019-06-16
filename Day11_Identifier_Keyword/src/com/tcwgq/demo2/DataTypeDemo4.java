package com.tcwgq.demo2;
/**
 * 面试题：
 * A:byte b1=3,b2=4,b;
 * B:b=b1+b2;
 * C:b=3+4;
 * 上面哪句代码是编译失败的呢？为什么？其中A，B，C带表行号。
 * B编译失败，因为b1，b2为byte类型，参与加法运算时，先转换为int类型，
 * 运算结果为int类型，int类型赋给byte类型，可能损失精度，有问题。
 */
public class DataTypeDemo4 {
	public static void main(String[] args) {
		byte b1 = 3, b2 = 4, b;
//		b = b1 + b2;
		b = 3 + 4;//这是常量相加，先计算出运算结果，再赋值给结果变量。
	}
}
