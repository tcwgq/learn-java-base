package com.tcwgq.demo3;

import java.io.PrintStream;

import org.junit.Test;

public class SystemOutDemo {
	/**
	 * System中的三个成员变量：
	 *    public static final InputStream in：“标准”输入流
	 *    public static final PrintStream out：“标准”输出流
	 *    public static final PrintStream err：“标准”错误输出流
	 *    常用的为：
	 *    InputStream is = System.in;
	 *    PrintStream ps = System.out;
	 */
	@Test
	public void fun(){
		System.out.println("Hello, world!");
		//下面两句代码，是上面这句代码的本质。
		PrintStream ps = System.out;
		ps.println("Hello, world!");
		
		ps.println();//通过写入行分隔符字符串终止当前行。
//		ps.print();//这个方法不存在。
	}

}
