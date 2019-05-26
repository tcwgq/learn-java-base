package com.tcwgq.demo1;

import java.util.Scanner;

/**
 * Scanner的成员方法： 
 * 基本格式 hasNextXxx()
 * 判断是否还有下一个输入项,其中Xxx可以是Int,Double等。如果需要判断是否包含下一个字符串，则可以省略Xxx 
 * nextXxx()
 * 获取下一个输入项。Xxx的含义和上个方法中的Xxx相同 
 * 默认情况下，Scanner使用空格，回车等作为分隔符 常用方法
 * 
 * 用法举例： 
 * public int nextInt() 
 * public String nextLine()
 * 
 * InputMismatchException:输入的类型与指定的类型不匹配
 */
public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int i = sc.nextInt();
		// System.out.println(i);
		// sc.close();
		if (sc.hasNextInt()) {// 当输入不是整数时，不接收
			int x = sc.nextInt();
			System.out.println(x);
		} else {
			System.out.println("数据类型不匹配");
		}
		sc.close();
	}
	
}
