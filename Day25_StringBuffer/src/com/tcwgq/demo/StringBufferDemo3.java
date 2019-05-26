package com.tcwgq.demo;

/**
 * StringBuffer的删除功能： 
 * public StringBuffer deleteCharAt(int index):移除此序列指定位置的char。此序列将缩短一个 char。
 * public StringBuffer delete(int start,int end):移除此序列的子字符串中的字符。
 * 该子字符串从指定的 start处开始，一直到索引 end - 1处的字符，如果不存在这种字符，则一直到序列尾部。如果 start等于 end，则不发生任何更改。
 */
public class StringBufferDemo3 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Hello").append("World");
		System.out.println(sb);
//		sb.deleteCharAt(5);
		sb.delete(1, 4);//包左不包右
		sb.delete(1, 1);//结果不发生改变
		sb.delete(0, sb.length());//删除整个字符序列
		System.out.println(sb);
		//理解为从哪个索引开始，删除几个字符
	}
}
