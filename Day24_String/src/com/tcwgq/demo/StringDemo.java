package com.tcwgq.demo;

/**
 * String:String类代表字符串。Java程序中的所有字符串字面值（如 "abc" ）都作为此类的实例实现。
 * 字符串是常量；它们的值在创建之后不能更改。字符串缓冲区支持可变的字符串。
 * 
 * 构造方法： 
 * public String():空构造
 * public String(byte[] bytes)：把字节数组转化为字符串
 * public String(byte[] bytes,int offset,int length)：把字节数组的一部分转化为字符串
 * public String(char[] value)：把字符数组转化为字符串
 * public String(char[] value,int offset,int count)：把字符数组的一部分转化为字符串
 * public String(String original)：把字符串转化为字符串
 * 
 * 获取字符串的长度方法：
 * public int length()：返回此字符串的长度。长度等于字符串中 Unicode代码单元的数量。
 */
public class StringDemo {
	public static void main(String[] args) {
		//public String():空构造
		String s1 = new String();
		System.out.println(s1);//
		System.out.println(s1.length());//0
		//public String(byte[] bytes)：把字节数组转化为字符串
		byte[] bys = {97, 98, 99, 100, 101, 102};
		String s2 = new String(bys);
		System.out.println(s2);//abcdef
		System.out.println(s2.length());
		//public String(byte[] bytes,int offset,int length)：把字节数组的一部分转化为字符串
		String s3 = new String(bys, 1, 3);
		//a b c d e f
		//0 1 2 3 4 5
		System.out.println(s3);//bcd
		System.out.println(s3.length());//3
		//public String(char[] value)：把字符数组转化为字符串
		char[] chs = {'H', 'e', 'l', 'l', 'o'};
		String s4 = new String(chs);
		System.out.println(s4);//Hello
		System.out.println(s4.length());//5
		//public String(char[] value,int offset,int count)：把字符数组的一部分转化为字符串
		String s5 = new String(chs, 1, 3);
		//H e l l o
		//0 1 2 3 4
		System.out.println(s5);//ell
		System.out.println(s5.length());//3
		//public String(String original)：把字符串转化为字符串
		String s6 = new String("HelloWorld");
		System.out.println(s6);//HelloWorld
		System.out.println(s6.length());//10
		//直接使用字面值常量赋值，常用
		String s7 = "HelloWorld";
		System.out.println(s7);//HelloWorld
		System.out.println(s7.length());//10
	}
}
