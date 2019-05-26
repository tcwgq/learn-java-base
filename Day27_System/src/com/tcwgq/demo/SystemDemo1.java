package com.tcwgq.demo;
/**
 * public static void exit(int status):终止当前正在运行的Java虚拟机。参数用作状态码；根据惯例，非0的状态码表示异常终止。 
 */
public class SystemDemo1 {
	public static void main(String[] args) {
		System.out.println("HelloWorld");
		System.exit(0);//0状态码表示正常退出
		System.out.println("Java");
	}
}
