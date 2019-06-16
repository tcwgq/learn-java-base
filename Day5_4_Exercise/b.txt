package com.tcwgq.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

public class InputStreamReaderDemo1 {
	/**
	 * InputStreamReader的两种读取方法： public int read():一次读取一个字符。 public int
	 * read(char[] cbuf)：一次读取一个字符数组。
	 * 
	 * @throws IOException
	 */
	/**
	 * 一次读取一个字符。
	 * 
	 * @throws IOException
	 */
	@Test
	public void fun() throws IOException {
		FileInputStream fis = new FileInputStream("fis.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		int ch = 0;
		while ((ch = isr.read()) != -1) {
			System.out.print((char) ch);
		}
		isr.close();
	}

	/**
	 * 一次读取一个字符数组。
	 * 
	 * @throws IOException
	 */
	@Test
	public void fun1() throws IOException {
		FileInputStream fis = new FileInputStream("fis1.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		char[] chs = new char[1024];
		int ch = 0;
		while ((ch = isr.read(chs, 0, 3)) != -1) {
			System.out.println(new String(chs, 0, ch));
		}
		//每次读取字符数组的一部分。
//		String s = "Hello, world!";
//		char[] charArray = s.toCharArray();
//		int c = isr.read(charArray, 0, 3);
//		System.out.println(c);
//		System.out.println(new String(charArray, 0, c));
		isr.close();
	}
	
}
