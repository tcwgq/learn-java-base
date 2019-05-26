package com.tcwgq.demo1;

import org.junit.Test;

/**
 * 练习：用while循环实现 
 * 左边：求出1-100之和 
 * 右边：统计水仙花数有多少个
 */
public class WhileTest {
	@Test
	public void fun1() {
		int sum = 0;
		int i = 1;
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

	@Test
	public void fun2() {
		// 统计”水仙花数”共有多少个
		int count = 0;
		int i = 100;
		while(i < 1000) {
			int g = i % 10;// 153 % 10 = 3
			int s = i / 10 % 10;// 153 / 10 % 10 = 5
			int b = i / 10 / 10 % 10;// 153 / 10 / 10 % 10 = 1
			int a = g * g * g + s * s * s + b * b * b;
			if (i == a) {
				count++;
			}
			i ++;
		}
		System.out.println(count);
	}

}
