package com.tcwgq.demo;

import org.junit.Test;

/**
 * ++和--的作用
 */
public class OperatorDemo1 {
	@Test
	public void fun() {
		// 单独使用
		int a = 3;
		int b = 5;
		a++;// a变为4
		b++;// b变为6
		System.out.println(a);
		System.out.println(b);
		++a;// 同上
		++b;
		System.out.println(a);
		System.out.println(b);
	}

	@Test
	public void fun1() {
		// 参与运算使用
		int a = 3;
		int b = 4;
		int c = a++;// 先赋值，在自增加1
		int d = ++b;// 先自增加1，再赋值
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
		System.out.println("d:" + d);
	}

	/*
	 * ++,--的练习题
	 * 
	 * 第一题： int a = 10; int b = 10; int c = 10;
	 * 
	 * a = b++; c = --a; b = ++a; a = c--; 请分别计算出a,b,c的值
	 * 
	 * 第二题： int x = 4; int y = (x++)+(++x)+(x*10); 请分别计算出x,y的值
	 */
	@Test
	public void fun2() {
		int a = 10;
		int b = 10;
		int c = 10;

		a = b++;// a=10,b=11
		c = --a;// c=9,a=9
		b = ++a;// b =10,a=10
		a = c--;// a=9,c = 8
		System.out.println(a);//9
		System.out.println(b);//10
		System.out.println(c);//8
	}
	
	
	@Test
	public void fun3(){
		 int x = 4; 
		 int y = (x++)+(++x)+(x*10);
		 //可以这么理解：
		 //(a=x++) + (b = ++x) + (x * 10)
		 //a = 4,x=5; b = 6,x = 6; x * 10 = 60
		 //最后结果70
		 System.out.println(y);
	}
}
