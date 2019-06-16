package com.tcwgq.demo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * JDK5新特性：自动拆装箱，泛型，增强for，静态导入，可变参数，枚举。
 * @author lenovo
 */
/**
 * 增强for概述
 * 简化数组和Collection集合的遍历
 * 格式：
 * for(元素数据类型 变量 : 数组或者Collection集合) {
 * 使用变量即可，该变量就是元素
 *  }
 * 好处：简化遍历
 * 注意事项：增强for的目标要判断是否为null
 * @author lenovo
 *
 */
public class ForDemo {
	@Test
	public void fun(){
		int[] array = {1, 2, 3, 4, 5};
		for(int x:array){
			System.out.println(x);
		}
		String[] ss = {"hello", "world", "java", "javaee"};
		for(String s:ss){
			System.out.println(s);
		}
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");
		//并发修改异常，说明底层是迭代器
		for(String str:list){
			if("world".equals(str)){
				list.add("hehe");
			}
//			System.out.println(str);
		}
//		byte[] bys = null;
//		//NullPointerException
//		//遍历之前需要先判断
//		for(byte b:bys){
//			System.out.println(b);
//		}
	}

}
