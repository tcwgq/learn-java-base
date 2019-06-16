package com.tcwgq.demo;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

/**
 * Collections:针对集合操作的工具类，里面全是静态方法。
 */
/**
 * 要学习的方法：
   public static <T> void sort(List<T> list)：根据元素的自然顺序 对指定列表按升序进行排序。
   public static <T> int binarySearch(List<?> list,T key)：使用二分搜索法搜索指定列表，以获得指定对象。
   public static <T> T max(Collection<?> coll)：根据元素的自然顺序，返回给定 collection 的最大元素。
   public static void reverse(List<?> list)：反转指定列表中元素的顺序。
   public static void shuffle(List<?> list)：使用默认随机源对指定列表进行置换。
 */
public class CollectionsDemo {
	@Test
	public void fun(){
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(3);
		al.add(8);
		al.add(15);
		al.add(21);
		System.out.println(al);
		//void sort(List<T> list):自然顺序排序
		Collections.sort(al);
		System.out.println(al);
		//int binarySearch(List<?> list,T key):二分查找，使用此方法，必须列表先按自然顺序排序
		System.out.println(Collections.binarySearch(al, 15));//关于返回值的问题，以后再说
		//T max(Collection<?> coll)：根据元素的自然顺序，返回给定 collection 的最大元素。
		System.out.println(Collections.max(al));
		//void reverse(List<?> list)：反转指定列表中元素的顺序。
		Collections.reverse(al);
		System.out.println(al);
		//void shuffle(List<?> list)：使用默认随机源对指定列表进行置换。
		Collections.shuffle(al);
		System.out.println(al);
		
	}

}
