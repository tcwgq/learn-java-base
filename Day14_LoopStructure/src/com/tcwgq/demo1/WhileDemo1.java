package com.tcwgq.demo1;

import org.junit.Test;

/**
 * for循环语句和while循环语句可以等价转换，但还是有些小区别的
 * 使用区别：控制条件语句所控制的那个变量，在for循环结束后，
 * 就不能再被访问到了，而while循环结束还可以继续使用，
 * 如果你想继续使用，就用while，
 * 否则推荐使用for。原因是for循环结束，
 * 该变量就从内存中消失，能够提高内存的使用效率。
 */
public class WhileDemo1 {
	@Test
	public void fun1(){
		for(int i = 0; i < 10; i++){
			System.out.println(i);
		}
//		System.out.println(i);//错误，超出i的作用范围
	}
	
	@Test
	public void fun2(){
		int i;
		for(i = 0; i < 10; i++){
			System.out.println("HelloWorld");
		}
		System.out.println(i);
	}
	
	@Test
	public void fun3(){
		int i = 0;
		while(i < 10){
			System.out.println("HelloWorld");
			i ++;
		}
		System.out.println(i);
	}

}
