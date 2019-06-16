package com.tcwgq.demo2;

/**
 * 定义或使用变量时的注意事项： A:作用域，变量定义在哪一级大括号中，哪个大括号的范围就是这个变量的作用域。 相同的作用域中不能定义两个同名变量。
 * B:初始化值，没有初始化值不能直接使用。 C:在一行上，可以定义多个同类型的变量，但是不建议，建议一行定义一个变量。
 */
public class DataTypeDemo1 {
	public static void main(String[] args) {
		int x = 10;
		// int x = 100;//重复的变量
		System.out.println(x);
		int y;
		// System.out.println(y);//未初始化的变量
		int a, b, c;
		a = 10;
		b = 20;
		c = 30;
		System.out.println(a + b + c);
		int i = 100, j = 200, k = 300;
		System.out.println(i + j + k);
	}

}
