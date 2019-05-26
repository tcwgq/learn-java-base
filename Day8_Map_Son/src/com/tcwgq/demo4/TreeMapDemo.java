package com.tcwgq.demo4;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Test;

/**
 * "aababcabcdabcde",获取字符串中每一个字母出现的次数要求结果:a(5)b(4)c(3)d(2)e(1)
 */
public class TreeMapDemo {
	@Test
	public void fun() {
		Scanner sc = new Scanner(System.in);
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();
		String s = sc.nextLine();
//		String s = "aababcabcdabcde";
		char[] charArray = s.toCharArray();
		for (char key : charArray) {
			if (!tm.containsKey(key)) {
				tm.put(key, 1);
			} else {
				Integer i = tm.get(key);
				i++;
				tm.put(key, i);
			}
		}
		StringBuilder sb = new StringBuilder();
		Set<Character> set = tm.keySet();
		for (Character key : set) {
			Integer value = tm.get(key);
			String ss = key + "(" + value + ")";
			sb.append(ss);
//			System.out.println(key + "(" + value + ")");
		}
		String result = sb.toString();
		System.out.println(result);
		sc.close();
	}

}
