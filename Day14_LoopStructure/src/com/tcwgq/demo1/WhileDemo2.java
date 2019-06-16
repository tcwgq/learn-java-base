package com.tcwgq.demo1;

/**
 * 我国最高山峰是珠穆朗玛峰：8848m，我现在有一张足够大的纸张，
 * 厚度为：0.01m。请问，我折叠多少次，就可以保证厚度不低于珠穆朗玛峰的高度?
 * 注意：可以将0.01扩大100倍，同时8848扩大一百倍成884800，这样比较比用0.01比较8848方便
 */
public class WhileDemo2 {
	public static void main(String[] args) {
		double d = 0.01;
		int count = 0;
		while(d < 8848){
			d *= 2;
			count ++;
		}
		System.out.println(d);
		System.out.println(count);
	}
}
