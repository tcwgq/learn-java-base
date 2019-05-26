package com.tcwgq.demo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class ListDemo {
	/**
	 * List集合的特有功能：
	 * 添加功能
	 *   void add(int index, E element)：在列表的指定位置插入指定元素（可选操作）
     *   将当前处于该位置的元素（如果有的话）和所有后续元素向右移动（在其索引中加 1）。
     *   
     *   boolean addAll(int index, Collection<? extends E> c)：将指定 collection 中的所有元素都插入到列表中的指定位置（可选操作）。
     *   将当前处于该位置的元素（如果有的话）和所有后续元素向右移动（增加其索引）。
     *   新元素将按照它们通过指定 collection 的迭代器所返回的顺序出现在此列表中。如果在操作正在进行中修改了指定的 collection，
     *   那么该操作的行为是不确定的（注意，如果指定的 collection 是此列表，并且它是非空的，则会发生这种情况。）
	 * 移除功能
	 *   E remove(int index)：移除列表中指定位置的元素（可选操作）。
	 *   将所有的后续元素向左移动（将其索引减 1）。返回从列表中移除的元素。
	 * 判断功能
	 * 获取功能
	 *   E get(int index)：返回列表中指定位置的元素。
	 *   返回此列表中第一次出现的指定元素的索引；如果此列表不包含该元素，则返回 -1。
	 *   更确切地讲，返回满足 (o==null ? get(i)==null : o.equals(get(i))) 的最低索引 i；
	 *   如果没有这样的索引，则返回 -1。
	 *   
	 *   int lastIndexOf(Object o)返回此列表中最后出现的指定元素的索引；如果列表不包含此元素，则返回 -1。
	 *   更确切地讲，返回满足 (o==null ? get(i)==null : o.equals(get(i))) 的最高索引 i；
	 *   如果没有这样的索引，则返回 -1。
	 *   
	 *   ListIterator<E> listIterator()：返回此列表元素的列表迭代器（按适当顺序）。
	 *   
	 *   ListIterator<E> listIterator(int index)返回列表中元素的列表迭代器（按适当顺序），从列表的指定位置开始。
	 *   指定的索引表示 next 的初始调用所返回的第一个元素。
	 *   previous 方法的初始调用将返回索引比指定索引少 1 的元素。
	 *   
	 *   List<E> subList(int fromIndex, int toIndex):返回列表中指定的 fromIndex（包括 ）和 toIndex（不包括）之间的部分视图。
	 *   （如果 fromIndex 和 toIndex 相等，则返回的列表为空）。
     *   返回的列表由此列表支持，因此返回列表中的非结构性更改将反映在此列表中，反之亦然。
     *   返回的列表支持此列表支持的所有可选列表操作。
     *   
     * 替换功能：
     *   E set(int index, E element)：用指定元素替换列表中指定位置的元素（可选操作）。
     *   以前在指定位置的元素 
	 */
	@Test
	public void fun(){
		// void add(int index, E element)
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add(0, "javaee");
		list.add(3, "aaa");//紧跟最后一个元素的位置添加元素没有问题x
//		list.add(5, "android");//索引越界异常
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
	}
	
	@Test
	public void fun1(){
		// E remove(int index)
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");
	   	String r = list.remove(0);
	   	list.remove(3);//索引越界异常
	   	System.out.println("被移除的元素为："+r);
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
	}
	
	@Test
	public void fun2(){
		// E remove(int index)
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");
		String ss = list.get(0);
//		System.out.println(list.get(3));//索引越界异常
		System.out.println(ss);
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
	}
	
	@Test
	public void fun3(){
		//E set(int index, E element)
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");
		System.out.println(list.set(0, "javaee"));
//		System.out.println(list.set(3, "javaee"));//索引越界异常
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
	}

}
