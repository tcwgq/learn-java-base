package com.tcwgq.demo3;

import java.util.ArrayList;

import org.junit.Test;

public class ArrayListDemo1 {
	/**
	 * 去除集合中字符串的重复值(字符串的内容相同) 不使用新集合的方式实现这个算法。
	 */
	@Test
	public void fun0() {
		/**
		 * 为什么会出现问题？
		 * 注意List集合的特点，每移除一个元素，则后面的元素前移，占据移除元素的位置。
		 * 解决办法：
		 * 当遇到有连续相同元素的时候，第二层循环仍从当前元素的下一个元素开始比较。
		 */
		ArrayList<String> al = new ArrayList<String>();
		al.add("hello");
		al.add("world");
		al.add("java");
		al.add("java");
		al.add("java");
		al.add("javaee");
		al.add("android");
		int i, j;
		for (i = 0; i < al.size()-1; i++)
			for (j = i + 1; j < al.size(); j++) {
				if(al.get(i).equals(al.get(j))){
					al.remove(j);
					j--;//当遇到有连续相同元素的时候，第二层循环仍从当前元素的下一个元素开始比较。
				}
			}
		System.out.println(al);
	}

}
