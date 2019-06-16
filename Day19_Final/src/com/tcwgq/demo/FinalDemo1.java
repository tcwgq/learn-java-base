package com.tcwgq.demo;

/**
 * final修饰局部变量：
 * 		基本类型：基本类型的值不能发生改变
 * 		引用类型：引用类型的地址值不能发生改变，但是对象的堆内存中的值可以改变
 */
public class FinalDemo1 {
	public static void main(String[] args) {
		//修饰基本类型
		int x = 10;
		x = 100;
		System.out.println(x);
		final int y = 5;
//		y = 10;//The final local variable y cannot be assigned. 
		System.out.println(y);
		System.out.println("--------------");
		//修饰引用类型
		S s = new S();
		System.out.println(s.num);
		s.num = 100;
		System.out.println(s.num);
		System.out.println("---------------");
		final S ss = new S();
		System.out.println(ss.num);
		ss.num = 200;
		System.out.println(ss.num);
//		ss = s;//The final local variable ss cannot be assigned.
//		ss = new S();//The final local variable ss cannot be assigned.
	}
}

class S {
	int num = 10;
	public S() {
		super();
	}

}