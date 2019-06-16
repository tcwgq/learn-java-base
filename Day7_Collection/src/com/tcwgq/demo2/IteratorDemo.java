package com.tcwgq.demo2;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

public class IteratorDemo {
	/**
	 * Iterato<E>概述：
	 * 对 collection 进行迭代的迭代器。迭代器取代了 Java Collections Framework中的 Enumeration。
	 * 迭代器与枚举有两点不同： 
	 * 迭代器允许调用者利用定义良好的语义在迭代期间从迭代器所指向的 collection 移除元素。 
     * 方法名称得到了改进。 
     * 方法：
     * boolean hasNext()：如果仍有元素可以迭代，则返回 true。（换句话说，如果 next 返回了元素而不是抛出异常，则返回 true）。 
     * E next()：返回迭代的下一个元素。获取元素，并移动到下一个位置。如果到达末尾，则出现NoSuchElementException。
     * void remove()从迭代器指向的 collection 中移除迭代器返回的最后一个元素（可选操作）。
     * 每次调用 next 只能调用一次此方法。
     * 如果进行迭代时用调用此方法之外的其他方式修改了该迭代器所指向的 collection，则迭代器的行为是不确定的。
	 */
	@Test
	public void fun(){
		ArrayList<String> al = new ArrayList<String>();
		al.add("hello");
		al.add("world");
		al.add("java");
		Iterator<String> it = al.iterator();
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
	}

}
