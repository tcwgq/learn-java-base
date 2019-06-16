package com.tcwgq.demo2;
/**
 * 数据类型：
 * 基本数据类型：
 *   数值型
 *     整数型：byte 1, short 2, int 4 , long 8
 *     浮点数：float 4, double 8
 *   字符型：char 2
 *   布尔型：true, false，没有明确规定占用的字节，一般1个字节就够表示了。
 * 引用数据类型：
 *   数组
 *   类
 *   接口
 * 注意：
 * 整数默认int类型，小数默认double类型！
 */
/**
 * byte类型的为什么取值范围为-128~+127？
 * 首先要注意，所有的整数在计算机中都是以反码形式存储的！
 * 0111,1111这个是最大的正数，为127。
 * 那么你可能认为1111,1111就是最大的负数了，那么最大的负数应该是-127啊，
 * 如果负数按原码存放，那就是-127了，关键是整数是按反码存放的。
 * 原码1111,1111的反码为1000,0001代表-1。
 * 1000,0000减1得0111,1111，按位取反得1000,0000表示128，因此负数的绝对值为128，所以最小负数为-128。
 */
public class DataTypeDemo {
	public static void main(String[] args) {
		//整数默认为int类型，小数默认为double类型！！！
		byte b1 = 10;
		byte b2 = 127;
		byte b3 = -128;
//		byte b4 = 128;//超过byte范围，提示int类型不能转换为byte类型
		System.out.println(b1);
		System.out.println(b2+1);
		System.out.println(b3);
		short s1 = 100;
		System.out.println(s1);
		short s2 = 200;
		System.out.println(s2);
		int a = 1000;
		System.out.println(a);
//		int b = 10000000000000;//100000000000已超出int范围
		long l1 = 1000;
		System.out.println(l1);
//		long l2 = 10000000000;//1000000000超出int范围
		long l3 = 100000000000l;
		System.out.println(l3);
//		float f = 12.2456;//默认小数为double，提示不能转换为float类型。
		float f1 = 12.234f;
		System.out.println(f1);
		double d = 3.1415926;
		System.out.println(d);
	}

}
