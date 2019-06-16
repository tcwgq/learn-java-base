package com.tcwgq.demo;

/**
 * StringBuffer的替换功能： 
 * public StringBuffer replace(int start,int end,String str):
 * 使用给定 String中的字符替换此序列的子字符串中的字符。
 * 该子字符串从指定的 start处开始，一直到索引 end - 1处的字符，如果不存在这种字符，则一直到序列尾部。
 * 先将子字符串中的字符移除，然后将指定的 String插入 start。（如果需要，序列将延长以适应指定的字符串。） 
 */
public class StringBufferDemo4 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello").append("world");
		System.out.println(sb);
		//把world替换为Java
		sb.replace(5, 10, "Java");//包左不包右
		System.out.println(sb);
	}
}
