package com.tcwgq.demo;

import java.util.Scanner;

/**
 * Scanner: 一个可以使用正则表达式来解析基本类型和字符串的简单文本扫描器。 Scanner
 * 使用分隔符模式将其输入分解为标记，默认情况下该分隔符模式与空白匹配。然后可以使用不同的 next 方法将得到的标记转换为不同类型的值。
 * 构造方法：
 * public Scanner(InputStream source)：
 * 构造一个新的 Scanner，它生成的值是从指定的输入流扫描的。取自该流的字节通过底层平台的默认字符集转换成字符。
 * System.in:标准的输入流，代表键盘输入
 */
public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(i);
		sc.close();
		System.out.println("-----------");
		String input = "1 fish 2 fish red fish blue fish";
		Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
		System.out.println(s.nextInt());
		System.out.println(s.nextInt());
		System.out.println(s.next());
		System.out.println(s.next());
		s.close();
	}
}
