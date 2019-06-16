package com.tcwgq.demo1;

import java.util.Scanner;

import org.junit.Test;

/**
 * if语句：三种格式。
 */
public class CaseStructureDemo {
	@Test
	public void fun1(){
		int a = 3;
		if(a > 1){
			System.out.println("哈哈，你赢了！");
		}
		
	}
	
	@Test
	public void fun2(){
		int a = -1;
		if ( a > 0){
			System.out.println("Hello");
		}else{
			System.out.println("Heheheheh");
		}
		
	}

	@Test
	public void fun3(){
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if(score > 90){
			System.out.println("优秀");
		}else if(score > 80){
			System.out.println("良好");
		}else if(score > 70){
			System.out.println("一般");
		}else if(score > 60){
			System.out.println("及格");
		}else{
			System.out.println("不及格");
		}
		sc.close();
		
	}


}
