package com.tcwgq.demo2;

public class DataTypeDemo6 {
	public static void main(String[] args) {
		//字符串和其他数据类型做+运算，结果为字符串。
		//这里的+不是算数运算符+，而是字符串连接符
		//+号的运算顺序从左到右。
		System.out.println('a');//a
		System.out.println('a' + 1);//a的ascii码为97，加1得98
		//上面的好理解
		System.out.println("hello" + 'a' + 1);//helloa1
		System.out.println('a' + 1 + "hello");//98hello
		System.out.println("5+5=" + 5 + 5);//5+5=55
		System.out.println(5 + 5 + "=5+5");//10=5+5
	}

}
