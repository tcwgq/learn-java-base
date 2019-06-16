package com.tcwgq.demo;

/**
 * 标识符：给类,接口,方法,变量等起名字时使用的字符序列。
 * 组成规则： 英文大小写字母 数字字符 $和_ 
 * 注意：
 * A.不能以数字开头
 * B.当中不能包含空格
 * C.不能是Java中的关键字 
 * D.区分大小写
 * 命名规则：见名知意！
 * 包：都是小写字母
 * 类或接口：大写字母开头的英文单词
 * 方法：第一个单词开头小写，后面的单词开头全部大写
 * 常量：都是大写字母，如：MAX，STUDENT_MAX_AGE
 */
public class IdentifiersDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int A = 20;
		int B = 20;
		int _abc = 20;
		int $abc = 30;
		// int a b = 50;//错误，当中不能包含空格！
		// int 12 = 32;//错误，标识符不能以数字开头！
		// int class = 35;//错误，标识符不能是Java中的关键字！
		System.out.println(a + b);
		System.out.println(A + B);
		System.out.println(_abc + $abc);
	}
}
