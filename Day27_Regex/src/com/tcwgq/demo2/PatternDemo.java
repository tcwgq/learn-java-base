package com.tcwgq.demo2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Pattern:
 * public static Pattern compile(String regex):将给定的正则表达式编译到模式中。
 * public Matcher matcher(CharSequence input):创建匹配给定输入与此模式的匹配器。
 * Matcher:
 * public boolean matches():尝试将整个区域与模式匹配。 
 * 如果匹配成功，则可以通过 start、end和 group方法获取更多信息。
 */
public class PatternDemo {
	public static void main(String[] args) {
		// 把正则表达式编译成模式对象
		Pattern p = Pattern.compile("a*b");
		// 通过模式对象得到匹配器对象，这个时候需要的是被匹配的字符串
		Matcher m = p.matcher("aaaaab");
		// 调用匹配器对象的功能
		boolean b = m.matches();
		System.out.println(b);
	}
}
