package com.tcwgq.demo;

/**
 * StringBuffer的添加功能： 
 * public StringBuffer append(String str):将指定的字符串追加到此字符序列。
 * 按顺序追加 String变量中的字符，使此序列增加该变量的长度。如果 str为 null，则追加 4个字符 "null"。
 * 
 * public StringBuffer insert(int offset, String str):将字符串插入此字符序列中。 
 * 按顺序将String参数中的字符插入此序列中的指定位置，将该位置处原来的字符向后移，此序列将增加该参数的长度。如果str为null，则向此序列中追加4个字符"null"。
 */
public class StringBufferDemo2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append("world");
//		sb.append(null);//The method append(Object) is ambiguous for the type StringBuffer
		System.out.println(sb);
		sb.insert(5, "java");
		System.out.println(sb);//先前的字符往后移动
	}
}
