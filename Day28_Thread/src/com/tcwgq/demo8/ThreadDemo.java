package com.tcwgq.demo8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

/**
 * Collections:
 * public static <T> Collection<T> synchronizedCollection(Collection<T> c):返回指定collection支持的同步（线程安全的）collection。
 * public static <T> List<T> synchronizedList(List<T> list):返回指定列表支持的同步（线程安全的）列表。
 * public static <K,V> Map<K,V> synchronizedMap(Map<K,V> m):返回由指定映射支持的同步（线程安全的）映射。
 * public static <T> Set<T> synchronizedSet(Set<T> s):返回指定set支持的同步（线程安全的）set。
 */
public class ThreadDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		Vector<String> v = new Vector<String>();
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		// Vector是线程安全的时候才去考虑使用的，但是我还说过即使要安全，我也不用你
		// 那么到底用谁呢?
		List<String> list1 = new ArrayList<String>();// 线程不安全
		List<String> list2 = Collections.synchronizedList(new ArrayList<String>()); // 线程安全
	}
}
