package com.tcwgq.test1;

/**
 * 统计大串中小串出现的次数 举例：
 * 在字符串"woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun"中java出现了5次
 */
public class StringTest3 {
	public static void main(String[] args) {
		String large = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
		int count = 0;
		String small = "java";
		while (true) {
			int index = large.indexOf(small);
			if (index != -1) {
				count++;
			} else {
				break;
			}
			large = large.substring(index + small.length());
		}
		System.out.println(count);
	}
	
	public static int getCount(String maxString, String minString) {
		// 定义一个统计变量，初始化值是0
		int count = 0;

		/*
		// 先在大串中查找一次小串第一次出现的位置
		int index = maxString.indexOf(minString);
		// 索引不是-1，说明存在，统计变量++
		while (index != -1) {
			count++;
			// 把刚才的索引+小串的长度作为开始位置截取上一次的大串，返回一个新的字符串，并把该字符串的值重新赋值给大串
			// int startIndex = index + minString.length();
			// maxString = maxString.substring(startIndex);
			maxString = maxString.substring(index + minString.length());
			// 继续查
			index = maxString.indexOf(minString);
		}
		*/
		
		int index;
		//先查，赋值，判断
		while((index=maxString.indexOf(minString))!=-1){
			count++;
			maxString = maxString.substring(index + minString.length());
		}
		return count;
	}
}
