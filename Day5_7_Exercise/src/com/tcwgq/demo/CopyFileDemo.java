package com.tcwgq.demo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class CopyFileDemo {
	/**
	 * 把d:\\data\\InputStreamReaderDemo.java内容复制到d:\\end\\InputStreamReaderDemo.java。
	 * @throws IOException 
	 */
	/**
	 * 一次写一个字符。
	 */
	@Test
	public void fun() throws IOException{
		FileReader fr = new FileReader("d:\\data\\InputStreamReaderDemo.java");
		FileWriter fw = new FileWriter("d:\\end\\InputStreamReaderDemo.java");
		int ch = 0;
		while((ch = fr.read()) != -1){
			fw.write(ch);
		}
		fw.close();
		fr.close();
	}
	
	/**
	 *一次写一个字符数组。
	 */
	@Test
	public void fun1() throws IOException{
		FileReader fr = new FileReader("d:\\data\\InputStreamReaderDemo.java");
		FileWriter fw = new FileWriter("d:\\end\\InputStreamReaderDemo.java");
		char[] chs = new char[1024];
		int len = 0;
		while((len = fr.read(chs)) != -1){
			fw.write(chs, 0, len);
		}
		fw.close();
		fr.close();
	}

}
