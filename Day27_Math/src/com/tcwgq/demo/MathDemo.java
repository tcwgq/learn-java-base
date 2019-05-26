package com.tcwgq.demo;

/**
 * Math:Math类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数。 
 * 没有构造方法，成员方法都是静态的！ 
 * 常用的方法： 
 * public static int abs(int a):返回 int 值的绝对值。
 * public static double ceil(double a):向上取整。返回最小的（最接近负无穷大）double值，该值大于等于参数，并等于某个整数。
 * public static double floor(double a):向下取整。返回最大的（最接近正无穷大）double值，该值小于等于参数，并等于某个整数。
 * public static int max(int a,int b):返回两个 int 值中较大的一个
 * public static int min(int a,int b):返回两个 int 值中较小的一个。
 * public static double pow(double a,double b):返回第一个参数的第二个参数次幂的值。 
 * public static double random():返回带正号的double值，该值大于等于 0.0 且小于 1.0。
 * public static int round(float a):返回最接近参数的 int。四舍五入值。
 * public static long round(double a):返回最接近参数的 long。四舍五入值。
 * public static double sqrt(double a):返回正确舍入的 double值的正平方根。
 */
public class MathDemo {
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println(Math.abs(-10));
		System.out.println(Math.ceil(3.1415926));//4.0
		System.out.println(Math.floor(3.1415926));//3.0
		System.out.println(Math.max(2, 8));
		System.out.println(Math.min(-1, 7));
		System.out.println(Math.pow(2.0, 3.0));//8.0
		System.out.println(Math.random());
		System.out.println(Math.round(2.14f));//2
		System.out.println(Math.round(3.14));//3
		System.out.println(Math.round(5.67));//6
		System.out.println(Math.sqrt(9.0));//3.0
	}
}
