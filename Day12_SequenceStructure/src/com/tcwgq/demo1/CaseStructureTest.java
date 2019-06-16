package com.tcwgq.demo1;

import java.util.Scanner;

import org.junit.Test;
/**
 * 1.键盘录入x的值，计算出y的并输出。
 * 2.键盘录入月份的值，输出对应的季节。
 * 3.获取三个数据中的最大值
 *   由此案例讲解if语句的嵌套
 */
public class CaseStructureTest {
	@Test
	public void fun1(){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y;
		if(x > 5){
			y = 2* x + 3;
		}else if(x < 0){
			y = 5- x;
		}else{
			y = x;
		}
		System.out.println(y);
		sc.close();
	}
	
	@Test
	public void fun2(){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int max;
		if(x > y){
			max = x;
			if(z > max){
				max = z;
			}
		}else{
			max = y;
			if(z > max){
				max = z;
			}
		}
		System.out.println(max);
		sc.close();
	}

}
