package com.tcwgq.demo4;

import java.util.TreeSet;

import org.junit.Test;

/**
 * TreeSet概述：
 * 能够实现对元素按某种规则进行排序
 * A：自然排序
 * B：比较器排序
 * @author lenovo
 * 特点：
 * 排序和唯一！
 */
public class TreeSetDemo {
	@Test
	public void fun(){
		//无参构造方法按自然顺序排序
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(7);
		ts.add(1);
		ts.add(0);
		ts.add(5);
		ts.add(10);
		ts.add(7);
		ts.add(5);
		for(Integer i:ts){
			System.out.println(i);
		}
	}

}
