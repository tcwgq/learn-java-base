package com.tcwgq.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class BufferedReaderDemo {
	/**
	 * BufferedReader的构造方法：
	 * BufferedReader(Reader in)：创建一个使用默认大小输入缓冲区的缓冲字符输入流。
	 * BufferedReader(Reader in, int sz)：创建一个使用指定大小输入缓冲区的缓冲字符输入流。
	 * 一般默认缓冲区大小就够了，不必自定义缓冲区大小。
	 * @throws IOException 
	 */
	@Test
	public void fun() throws IOException{
		FileReader fr = new FileReader("fr.txt");
		BufferedReader br = new BufferedReader(fr);
		//一次读取一个字符。
//		int ch = 0;
//		while((ch = br.read()) != -1){
//			System.out.print((char)ch);
//		}
		//一次读取一个字符数组。
		char[] chs = new char[1024];
		int len = 0;
		while((len = br.read(chs)) != -1){
			System.out.print(new String(chs, 0, len));
		}
		br.close();
		
		
	}
	

}
