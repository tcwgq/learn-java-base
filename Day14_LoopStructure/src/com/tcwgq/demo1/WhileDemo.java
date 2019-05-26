package com.tcwgq.demo1;

/**
 * 基本格式 
 * 		while(判断条件语句) { 循环体语句; }，这种格式往往是死循环
 * 扩展格式 
 * 		初始化语句; 
 * 		while(判断条件语句) { 循环体语句; 控制条件语句; }
 */
public class WhileDemo {
	public static void main(String[] args) {
		int i = 0;
		while(i < 10){
			System.out.println("HelloWorld");
			i ++;
		}
	}

}
