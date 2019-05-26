package com.tcwgq.demo2;

/**
 * 使用Math类的random方法获取随机数 
 * random(): 返回带正号的 double 值，该值大于等于 0.0 且小于
 * 1.0。返回值是一个伪随机选择的数，在该范围内（近似）均匀分布。 
 * 需求：获取1~100之间的随机数
 */
public class MathDemo {
	public static void main(String[] args) {
		System.out.println(Math.random());
		System.out.println(Math.random() * 100);
		//需求：我要获取一个1-100之间的随机数，怎么办？
		int num = (int) (Math.random() * 100) + 1;
		System.out.println(num);
		for(int i = 0; i < 100; i++){
			int n = (int)(Math.random() * 100) + 1;
			System.out.println(n);
		}
	}
}
