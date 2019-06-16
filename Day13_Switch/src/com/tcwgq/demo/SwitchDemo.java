package com.tcwgq.demo;

import java.util.Scanner;

/**
 * switch语句的格式： 
 * switch(表达式) { 
 * case 值1：
 *  语句体1; 
 *  break; 
 * case 值2：
 *  语句体2; 
 *  break; 
 *  …
 * default： 
 * 语句体n+1; 
 * break; } 
 * 表达式的取值：byte, short, int, char 
 * JDK5以后可以是枚举
 * JDK7以后可以是String 
 * 面试题：
 * byte可以作为switch表达式的值么？可以 
 * long可以作为switch表达式的值么？不可以
 * String可以作为switch表达式的值么？JDK7以后可以
 */
public class SwitchDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("这是1");
			System.out.println("哈哈，这是1");//复合语句不用大括号
			break;
		case 2:
			System.out.println("这是2");
			break;
		case 3:
			System.out.println("这是3");
			break;
		default:
			System.out.println("你太厉害了，不按套路出牌！");
			break;//此时这个break不能省略，若default在最后，break可以省略
		case 4:System.out.println("这是4");
		}
		sc.close();
	}

}
