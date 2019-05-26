package com.tcwgq.test;
/**
 * 需求：把一个字符串的首字母转成大写，其余为小写。(只考虑英文大小写字母字符)
 * 举例：
 * 		helloWORLD
 * 结果：
 * 		Helloworld
 */
public class StringTest4 {
	public static void main(String[] args) {
		String s = "helloWORLD";
		String s1 = s.toLowerCase();
		String result = s1.substring(0, 1).toUpperCase().concat(s1.substring(1));
		System.out.println(result);
		String ss = "helloWORLD";
		String sss = ss.substring(0, 1).toUpperCase().concat(ss.substring(1).toLowerCase());
		System.out.println(sss);
	}
}
