package com.tcwgq.demo2;

/**
 * String类的获取功能： 
 * int length()：获取字符串的长度
 * char charAt(int index)：返回指定索引处的 char 值。
 * int indexOf(int ch)：返回指定字符在此字符串中第一次出现处的索引。如果未出现该字符，则返回 -1。 
 * int indexOf(String str)：返回指定子字符串在此字符串中第一次出现处的索引。不存在则返回-1。 
 * fromIndex 的值没有限制。如果它为负，则与它为 0 的效果同样：将搜索整个字符串。如果它大于此字符串的长度，则与它等于此字符串长度的效果相同：返回 -1。 
 * int indexOf(int ch,int fromIndex)：返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索。 
 * int indexOf(String str,int fromIndex)：返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始。
 * String substring(int start)：返回一个新的字符串，它是此字符串的一个子字符串。该子字符串从指定索引处的字符开始，直到此字符串末尾。 
 * String substring(int start,int end)：返回一个新字符串，它是此字符串的一个子字符串。该子字符串从指定的 beginIndex 处开始，直到索引 endIndex - 1 处的字符。
 */
public class StringDemo1 {
	public static void main(String[] args) {
		String s = "HelloWorld";
		//int length()：获取字符串的长度
		System.err.println(s.length());//10
		//char charAt(int index)：返回指定索引处的 char 值。
		System.out.println(s.charAt(1));
//		System.out.println(s.charAt(11));//StringIndexOutOfBoundsException
//		System.out.println(s.charAt(-1));//StringIndexOutOfBoundsException
		//int indexOf(int ch)：返回指定字符在此字符串中第一次出现处的索引。
		System.out.println(s.indexOf('l'));//2
		System.out.println(s.indexOf(97));//-1
		System.out.println(s.indexOf('k'));//-1
		System.out.println(s.indexOf("ello"));//1
		System.out.println(s.indexOf("java"));//-1
		System.out.println(s.indexOf('o', 3));//4
		System.out.println(s.indexOf('n', 5));//-1
		System.out.println(s.indexOf(98, 9));//-1
		System.out.println(s.indexOf('l', 5));//8
		System.out.println(s.indexOf('l', -1));//2
		System.out.println(s.indexOf('o', -5));//4
		System.out.println(s.indexOf('e', 10));//-1
		System.out.println("-------------------");
		System.out.println(s.indexOf("ello", 1));//1
		System.out.println(s.indexOf("Wor", 8));//-1
		System.out.println(s.indexOf("ell", -1));//1
		System.out.println(s.indexOf("Hello", 10));//-1
		System.out.println("------------------------");
//		System.out.println(s.substring(-1));//StringIndexOutOfBoundsException
		System.out.println(s.substring(10));//
//		System.out.println(s.substring(11));//StringIndexOutOfBoundsException
//		System.out.println(s.substring(-1, 10));//StringIndexOutOfBoundsException
		System.out.println(s.substring(0, 10));//HelloWorld
		System.out.println(s.substring(0, 5));//Hello，包左不包右
		String s1 = "";
		System.out.println(s1.length());//0
	}
}
