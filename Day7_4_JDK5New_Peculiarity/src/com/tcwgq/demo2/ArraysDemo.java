package com.tcwgq.demo2;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * public static <T> List<T> asList(T... a):
 * 返回一个受指定数组支持的固定大小的列表。（对返回列表的更改会“直接写”到数组。）此方法同 Collection.toArray() 一起，充当了基于数组的 API 与基于 collection 的 API 之间的桥梁。返回的列表是可序列化的，并且实现了 RandomAccess。 
 * 此方法还提供了一个创建固定长度的列表的便捷方法，该列表被初始化为包含多个元素： 
 * List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");
 * 参数：a--支持列表的数组。
 * 返回：指定数组的列表视图。
 */
/**
 * 注意：
 * 转化后的集合支持修改操作，不支持增删操作，原因是集合的底层是数组，长度不能改变。
 * @author lenovo
 *
 */
public class ArraysDemo {
	@Test
	public void fun(){
		String[] strs = new String[]{"hello", "world", "java", "javaee"};
		List<String> list = Arrays.asList(strs);//此种用法不够灵活。
		List<String> l = Arrays.asList("hello", "world", "java");
		//UnsupportedOperationException
//		l.add("javaee");
		//UnsupportedOperationException
//		l.remove(1);
		l.set(1, "hehe");//支持修改操作，不支持增删操作。
		for(String s:list){
			System.out.println(s);
		}
		System.out.println("------------");
		for(String s:l){
			System.out.println(s);
		}
	}

}
