package com.tcwgq.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.junit.Test;

public class CopyFileDemo {
	/**
	 * 把当前项目目录下的a.txt内容复制到当前项目目录下的b.txt中。
	 * @throws IOException 
	 */
	@Test
	public void fun() throws IOException{
		FileInputStream fis = new FileInputStream("a.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		FileOutputStream fos = new FileOutputStream("b.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		//方式一，一次读取一个字符。
//		int ch = 0;
//		while((ch = isr.read()) != -1){
//			osw.write(ch);
//		}
		//方式二，一次读取一个字符数组。
		char[] chs = new char[1024];
		int len = 0;
		while((len = isr.read(chs)) != -1){
			osw.write(chs, 0, len);
			//注意，此处最好刷新一下，一面字符数组写满。
			osw.flush();
		}
		osw.close();
		isr.close();
	}
	
	/**
	 * 把d:\\data\\InputStreamReaderDemo.java内容复制到d:\\end\\InputStreamReaderDemo.java。
	 * @throws IOException 
	 */
	@Test
	public void fun1() throws IOException{
		FileInputStream fis = new FileInputStream("d:\\data\\InputStreamReaderDemo.java");
		InputStreamReader isr = new InputStreamReader(fis);
		FileOutputStream fos = new FileOutputStream("d:\\end\\InputStreamReaderDemo.java");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		//方式一，一次读取一个字符。
		int ch = 0;
		while((ch = isr.read()) != -1){
			osw.write(ch);
		}
//		//方式二，一次读取一个字符数组。
//		char[] chs = new char[1024];
//		int len = 0;
//		while((len = isr.read(chs)) != -1){
//			osw.write(chs, 0, len);
//			//注意，此处最好刷新一下，一面字符数组写满。
//			osw.flush();
//		}
		osw.close();
		isr.close();
	}

}
