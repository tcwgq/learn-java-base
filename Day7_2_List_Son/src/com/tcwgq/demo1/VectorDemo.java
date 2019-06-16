package com.tcwgq.demo1;

import java.util.Enumeration;
import java.util.Vector;

import org.junit.Test;

public class VectorDemo {
	/**
	 * Vector的特有功能：
	 * 添加功能：
	 *   public void addElement(E obj)：将指定的组件添加到此向量的末尾，将其大小增加 1。
	 *   如果向量的大小比容量大，则增大其容量。
	 * 获取功能：
	 *   public E elementAt(int index)：返回指定索引处的组件。
	 *   public Enumeration<E> elements()：返回此向量的组件的枚举。
	 *   返回的 Enumeration 对象将生成此向量中的所有项。
	 *   生成的第一项为索引 0 处的项，然后是索引 1 处的项，依此类推。 
	 */
	/**
	 * Enumeration<E>概述：
	 * 实现 Enumeration接口的对象，它生成一系列元素，一次生成一个。连续调用 nextElement方法将返回一系列的连续元素。
	 * 方法：
	 * boolean hasMoreElements()：测试此枚举是否包含更多的元素。
	 * E nextElement()：如果此枚举对象至少还有一个可提供的元素，则返回此枚举的下一个元素。 
	 */
	@Test
	public void fun0(){
		Vector<String> v = new Vector<String>();
		v.addElement("hello");
		v.addElement("wordl");
		v.addElement("java");
		for(int i=0;i<v.size();i++){
			String s = v.elementAt(i);
			System.out.println(s);
		}
	}
	
	/**
	 * 使用枚举遍历Vector。
	 */
	@Test
	public void fun1(){
		Vector<String> v = new Vector<String>();
		v.addElement("hello");
		v.addElement("wordl");
		v.addElement("java");
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()){
			String s = e.nextElement();
			System.out.println(s);
		}
	}

}
