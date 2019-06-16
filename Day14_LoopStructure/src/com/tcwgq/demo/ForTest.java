package com.tcwgq.demo;

import org.junit.Test;

/**
 * 1.请在控制台输出数据1-10 
 * 2.请在控制台输出数据10-1 
 * 3.求出1-10之间数据之和 
 * 4.求出1-100之间偶数和 
 * 5.求出1-100之间奇数和 
 * 6.求5的阶乘
 * 7.在控制台输出所有的”水仙花数” 
 * 8.统计”水仙花数”共有多少个 
 * 9.请在控制台输出满足如下条件的五位数 
 * 		个位等于万位 十位等于千位 个位+十位+千位+万位=百位
 * 10.请统计1-1000之间同时满足如下条件的数据有多少个：
 *  	对3整除余2 对5整除余3 对7整除余2
 */
public class ForTest {
	@Test
	public void fun1() {
		for(int i = 1; i <= 10; i++){
			System.out.println(i);
		}
	}
	
	@Test
	public void fun2() {
		for(int i =10; i >=1; i--){
			System.out.println(i);
		}
	}
	
	@Test
	public void fun3() {
		int sum = 0;
		for(int i = 1; i <= 10; i++){
			sum += i;
		}
		System.out.println(sum);
	}
	
	@Test
	public void fun4() {
		int sum = 0;
		for(int i = 1; i <= 100; i++){
			if(i % 2 == 0){
				sum += i;
			}
		}
		System.out.println(sum);
	}
	
	@Test
	public void fun5() {
		int sum = 0;
		for(int i = 1; i <= 100; i++){
			if(i % 2 == 1){
				sum += i;
			}
		}
		System.out.println(sum);
	}
	
	@Test
	public void fun6() {
		int factorial = 1;
		for(int i = 1; i <= 5; i++){
			factorial *= i;
		}
		System.out.println(factorial);
	}
	
	@Test
	public void fun7() {
		/*
		 * 所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。
		 * 举例：153就是一个水仙花数。
		 * 153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
		 */
		for(int i = 100; i < 1000; i++){
			int g = i % 10;// 153 % 10 = 3
			int s = i / 10 % 10;// 153 / 10 % 10 = 5
			int b = i / 10 / 10 % 10;// 153 / 10 / 10 % 10 = 1
			int a = g * g * g + s * s * s + b * b * b;
			if(i == a){
				System.out.println(i);
			}
		}
		
	}
	
	@Test
	public void fun8() {
		//统计”水仙花数”共有多少个 
		int count = 0;
		for(int i = 100; i < 1000; i++){
			int g = i % 10;// 153 % 10 = 3
			int s = i / 10 % 10;// 153 / 10 % 10 = 5
			int b = i / 10 / 10 % 10;// 153 / 10 / 10 % 10 = 1
			int a = g * g * g + s * s * s + b * b * b;
			if(i == a){
				count ++;
			}
		}
		System.out.println(count);
		
	}
	
	@Test
	public void fun9() {
		/*
		 * 请在控制台输出满足如下条件的五位数 :
         * 		个位等于万位 
         * 		十位等于千位 
         * 		个位+十位+千位+万位=百位
		 */
		for(int i = 10000; i < 100000; i++){
			int g = i % 10;
			int s = i / 10 % 10;
			int b = i / 10 / 10 % 10;
			int q = i / 10 / 10 / 10 % 10;
			int w = i / 10 / 10 / 10 / 10 % 10;
			if(g == w && s == q && g + s + q + w == b){
				System.out.println(i);
			}
		}
	}
	
	@Test
	public void fun10() {
		/*
		 * 请统计1-1000之间同时满足如下条件的数据有多少个：
		 * 		对3整除余2 
		 * 		对5整除余3 
		 * 		对7整除余2
		 */
		int count = 0;
		for(int i = 1; i <= 1000; i++){
			if(i % 3 == 2 && i % 5 == 3 && i % 7 == 2){
				count ++;
			}
		}
		System.out.println(count);
	}
	
}
