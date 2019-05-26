package com.tcwgq.demo2;

import org.junit.Test;

/**
 * do…while循环语句格式： 
 * 基本格式
 *  do { 循环体语句; }while((判断条件语句); //这种情况是死循环
 * 扩展格式
 *  初始化语句; do { 循环体语句; 控制条件语句; } while((判断条件语句);
 */
public class DoWhileDemo {
	@Test
	public void fun(){
		int i = 0;
		do{
			System.out.println("HelloWorld" + i);
			i ++;
		}while(i < 10);
		System.out.println(i);
	}
	
	@Test
	public void fun1(){
		int i = 1;
		int sum = 0;
		do{
			sum += i;
			i ++;
		}while(i <= 10);
		System.out.println(sum);
	}

}
