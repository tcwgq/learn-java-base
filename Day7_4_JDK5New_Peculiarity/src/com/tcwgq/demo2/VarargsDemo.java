package com.tcwgq.demo2;

import org.junit.Test;

/**
 * 可变参数概述
 * 定义方法的时候不知道该定义多少个参数
 * 格式
 * 修饰符 返回值类型 方法名(数据类型…  变量名){}
 * 注意：
 * 这里的变量其实是一个数组
 * 如果一个方法有可变参数，并且有多个参数，那么，可变参数肯定是最后一个
 */
public class VarargsDemo {
	@Test
	public void fun(){
		int result = sum(10, 20);
		System.out.println(result);
		result = sum(10, 20, 30);
		System.out.println(result);
		result = sum(10, 20, 30, 40);
		System.out.println(result);
	}
	//此种情况，少算了前面的b
//	private int sum(int b, int...a) {
//		int sum = 0;
//		for(int i:a){
//			sum+=i;
//		}
//		return sum;
//	}
	private int sum(int...a) {
		int sum = 0;
		for(int i:a){
			sum+=i;
		}
		return sum;
	}

}
