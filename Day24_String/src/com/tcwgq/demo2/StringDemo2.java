package com.tcwgq.demo2;

/**
 * String类的转换功能： 
 * byte[] getBytes()：使用平台的默认字符集将此 String编码为 byte序列，并将结果存储到一个新的 byte 数组中。 
 * char[] toCharArray()：将此字符串转换为一个新的字符数组。
 * static String valueOf(char[] chs)：返回 char数组参数的字符串表示形式。字符数组的内容已被复制，后续修改不会影响新创建的字符串。 
 * static String valueOf(int i)：返回 int参数的字符串表示形式。 该表示形式恰好是单参数的 Integer.toString方法返回的结果。 
 * String toLowerCase()：使用默认语言环境的规则将此 String中的所有字符都转换为小写。这等效于调用 toLowerCase(Locale.getDefault())。  
 * String toUpperCase()：使用默认语言环境的规则将此 String中的所有字符都转换为大写。此方法等效于 toUpperCase(Locale.getDefault())。 
 * String concat(String str)：将指定字符串连接到此字符串的结尾。 如果参数字符串的长度为 0，则返回此 String对象。
 * 否则，创建一个新的 String 对象，用来表示由此 String对象表示的字符序列和参数字符串表示的字符序列连接而成的字符序列。
 */
public class StringDemo2 {
	public static void main(String[] args) {
		String s = "HelloWorld";
		byte[] bys = s.getBytes();
		for(int i = 0; i < bys.length; i ++){
			System.out.println(bys[i]);
		}
		System.out.println("------------------");
		char[] chs = s.toCharArray();
		for(int i = 0; i < chs.length; i++){
			System.out.println(chs[i]);
		}
		System.out.println("-------------------");
		char[] chars = {'a', 'b', 'c', 'd'};
		String s1 = String.valueOf(chars);
		System.out.println(s1);
		System.out.println("-------------------");
		String s2 = String.valueOf(100);
		System.out.println(s2);
		System.out.println("-------------------");
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println("-------------------");
		System.out.println(s.concat(""));
		System.out.println(s.concat("Java"));
//		System.out.println(s.concat(null));//NullPointerException
		//不如直接用+号
		System.out.println("Hello" + "World" + "HaHa");
	}
}
