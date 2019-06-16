package com.tcwgq.demo2;

/**
 * String类的其他功能： 
 * 替换功能 
 * String replace(char old,char new)：返回一个新的字符串，它是通过用 newChar替换此字符串中出现的所有oldChar得到的。 
 * 如果 oldChar在此 String对象表示的字符序列中没有出现，则返回对此 String对象的引用。否则，创建一个新的 String对象，它所表示的字符序列除了所有的oldChar都被替换为newChar之外，与此String对象表示的字符序列相同。 
 * String replace(String old,String new)：使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。该替换从字符串的开头朝末尾执行。
 * 去除字符串两边的空格
 * String trim()：返回字符串的副本，忽略前导空白和尾部空白。如果此 String对象表示一个空字符序列，或者此 String对象表示的字符序列的第一个和最后一个字符的代码都大于 '\u0020'（空格字符），则返回对此 String对象的引用。 
 * 按字典顺序比较两个字符串 
 * int compareTo(String str)：按字典顺序比较两个字符串。该比较基于字符串中各个字符的 Unicode值。
 * int compareToIgnoreCase(String str)：按字典顺序比较两个字符串，不考虑大小写。
 */
public class StringDemo3 {
	 public static void main(String[] args) {
		String s = "HelloWorld";
		System.out.println(s.replace('l', 'e'));
		System.out.println(s.replace('u', 'b'));
		System.out.println("-----------------");
		System.out.println(s.replace("ll", "ww"));
		System.out.println(s.replace("llo", "gold"));
		System.out.println("--------------------");	
		System.out.println("  qwert   ".trim());
		System.out.println("asdf  ghjk".trim());
		System.out.println("".trim());//返回空字符串
		System.out.println("--------------------");
		System.out.println("hello".compareTo("world"));//-15
		System.out.println("allow".compareTo("blue"));//-1
		System.out.println("yellow".compareTo("replace"));//7
		System.out.println("g".compareTo("l"));//-5
		System.out.println("helw".compareTo("helr"));//5
		System.out.println("wer".compareTo("ghjk"));//16
		System.out.println("hello".compareTo("hello"));//0
		System.out.println("hel".compareTo("hello"));//-2
	}
}
