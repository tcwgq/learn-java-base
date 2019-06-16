package com.tcwgq.demo2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 获取功能：
 * 获取下面这个字符串中由三个字符组成的单词
 * da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?
 * 
 * Matcher:
 * public boolean find():尝试查找与该模式匹配的输入序列的下一个子序列。
 * public String group():返回由以前匹配操作所匹配的输入子序列。
 */
public class PatternDemo1 {
	public static void main(String[] args) {
		String s = "da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?";
		String regex = "\\b[a-zA-Z_0-9]{3}\\b";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		while(m.find()){
			System.out.println(m.group());
		}
//		System.out.println(m.group());//java.lang.IllegalStateException
		//注意：一定要先find()，然后才能group()
	}
}
