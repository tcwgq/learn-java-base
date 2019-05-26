package com.tcwgq.demo;

import java.util.ArrayList;

import org.junit.Test;

public class CollectionDemo {
	/**
	 * Collection<E>的概述：
	 * Collection 层次结构 中的根接口。Collection 表示一组对象，这些对象也称为 collection 的元素。
	 * 一些 collection 允许有重复的元素，而另一些则不允许。
	 * 一些 collection 是有序的，而另一些则是无序的。
	 * JDK 不提供此接口的任何直接 实现：它提供更具体的子接口（如 Set 和 List）实现。
	 * 此接口通常用来传递 collection，并在需要最大普遍性的地方操作这些 collection。 
	 */
	/**
	 * Collection<E>的功能：
	 * 添加功能
	 *   boolean add(E e)：向集合中添加元素
	 *   boolean addAll(Collection<? extends E> c)：将指定集合中 的元素添加到集合中
	 * 删除(移除)功能
	 *   boolean remove(Object o)：移除单个元素
	 *   boolean removeAll(Collection<?> c)：移除指定集合中包含的元素，即本集合相对指定集合的差集
	 *   boolean retainAll(Collection<?> c)：指定集合与本集合的交集，注意元素去哪了，还有返回值是什么意思
	 *   void clear()：移除集合中的所有元素，清空集合
	 * 判断功能
	 *   boolean isEmpty()：判断集合是否为空
	 *   boolean contains(Object o)：判断集合中是否包含指定元素
	 *   boolean containsAll(Collection<?> c)：判断集合是否包含指定集合中的所有元素，是一个还是所有呢？
	 * 修改功能
	 * 获取功能
	 *   int size()：获取集合的长度，即元素个数
	 *   Iterator<E> iterator()：获取集合的迭代器对象
	 *   Object[] toArray()：返回集合对应的对象数组，此方法充当了基于数组的 API 与基于 collection 的 API 之间的桥梁
	 *   <T> T[] toArray(T[] a)：返回包含此 collection 中所有元素的数组；返回数组的运行时类型与指定数组的运行时类型相同。
	 *   如果指定的数组能容纳该 collection，则返回包含此 collection 元素的数组。
	 *   否则，将分配一个具有指定数组的运行时类型和此 collection 大小的新数组。
	 */
	/**
	 * 面试题：
	 * 数组有没有length()方法呢？字符串有没有length()方法呢？集合有没有length()方法呢？
	 */
	@Test
	public void fun(){
		//先测不带all的
		ArrayList<String> al = new ArrayList<String>();
		al.add("hello");//添加功能
		al.add("world");
		al.add("java");
		System.out.println(al);//重写了toString方法
		System.out.println(al.contains("hello"));//判断功能
		System.out.println(al.isEmpty());//判断功能
		System.out.println(al.size());//获取集合元素个数
		al.remove("java");//移除单个元素
		al.remove("javaee");//集合中不存在的元素，移除时返回false
		al.clear();//清空集合中的所有元素
		Object[] obj = al.toArray();//获取集合对应的对象数组，该方法充当了数组与集合之间转换的桥梁
		for(int i = 0; i < obj.length; i++){
			System.out.println((String)obj[i]);
		}
	}
	
	@Test
	public void fun1(){
		//测试高级功能，即带all的
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> al1 = new ArrayList<String>();
		al.add("hello");//添加功能
		al.add("world");
		al.add("java");
		al1.add("aaa");
		al1.add("bbb");
		al1.add("ccc");
		al.addAll(al1);//添加指定集合中的所有元素到本集合中
		for(String s:al){
			System.out.println(s);
		}
	}
	
	@Test
	public void fun2(){
		//测试高级功能，即带all的
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> al1 = new ArrayList<String>();
		al.add("hello");//添加功能
		al.add("world");
		al.add("java");
		al.add("I");
		al.add("Love");
		al.add("You");
//		al1.add("hello");
//		al1.add("world");
		al1.add("java");
		al1.add("aaa");
		al1.add("bbb");
		boolean b = al.removeAll(al1);//移除指定集合中的所有元素，只要移除一个，就算成功，返回true。
		System.out.println(b);
		System.out.println(al);
	}
	@Test
	public void fun3(){
		//测试高级功能，即带all的
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> al1 = new ArrayList<String>();
		al.add("hello");//添加功能
		al.add("world");
		al.add("java");
		al1.add("hello");
		al1.add("world");
		al1.add("java");
		al1.add("aaa");
		boolean b = al.retainAll(al1);//求两个集合的交集，没有交集时，返回空
		/**
		 * 注意：
		 * 结果保存在al集合中，返回值表示al集合是否发生过改变。
		 */
		System.out.println(b);
		System.out.println(al);
	}
	@Test
	public void fun4(){
		//测试高级功能，即带all的
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> al1 = new ArrayList<String>();
		al.add("hello");//添加功能
		al.add("world");
		al.add("java");
		al1.add("hello");
		al1.add("world");
		al1.add("aaa");
		boolean b = al.containsAll(al1);//判断本集合是否包含指定集合中的所有元素，只有包含指定集合中的所有元素，才返回true。
		System.out.println(b);
	}

}
