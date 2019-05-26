package com.tcwgq.test;

import java.util.Scanner;

import org.junit.Test;
/**
 * Scanner对象先获取一个整数再获取一个字符串时，会出现问题。
 * 原因是：先获取整数，再获取字符串时，会将换行符当做字符串。
 * 解决办法：
 * 1.遇到上面这种情况时，使用不同的Scanner对象获取整数和字符串。
 * 2.无论获取什么类型的数据，都先获取字符串，然后转化为相应类型的数据。
 * @author lenovo
 */
public class ScannerTest {
	@Test
	public void fun1(){
		//连续获取两个字符串
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		sc.close();
	}
	
	@Test
	public void fun2(){
		//连续获取两个整数
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		sc.close();
	}
	
	@Test
	public void fun3(){
		//先获取一个字符串，再获取一个整数
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int a = sc.nextInt();
		System.out.println("s:"+s);
		System.out.println("a:"+a);
		sc.close();
	}
	
	@Test
	public void fun4(){
		//先获取一个整数，再获取一个字符串
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String s = sc.nextLine();
		System.out.println("a:"+a);
		System.out.println("s:"+s);
		sc.close();
	}
	
	@Test
	public void fun5(){
		//使用不同的Scanner对象获取
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int a = sc1.nextInt();
		String s = sc2.nextLine();
		System.out.println("a:"+a);
		System.out.println("s:"+s);
		sc1.close();
		sc2.close();
	}
	
	@Test
	public void fun6(){
		//先用字符串接收，再转化为相应的数据类型
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int a = Integer.parseInt(s1);
		String s2 = sc.nextLine();
		System.out.println("a:"+a);
		System.out.println("s2:"+s2);
		sc.close();
	}

}
