package com.tcwgq.demo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.junit.Test;

public class SystemInDemo {
	/**
	 * System.in是标准输入流，用于从键盘读取数据。
	 * 
	 * 键盘录入数据的几种方式：
	 * A:main方法的args接收参数。
	 *  java HelloWorld hello world java
	 * B:Scanner(JDK1.5)
	 *  Scannser sc = new Scanner(System.in);
	 * C:通过缓冲流包装标准输入流实现。
	 *   InputStream is = System.in;
	 *	 InputStreamReader isr = new InputStreamReader(is);
	 *	 BufferedReader br = new BufferedReader(isr);
	 * @throws IOException 
	 */
	@Test
	public void fun() throws IOException{
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String line = br.readLine();//读取一个字符串
		System.out.println(line);
		line = br.readLine();
		int i = Integer.parseInt(line);//读取一个整数
		System.out.println(i);
	}

}
