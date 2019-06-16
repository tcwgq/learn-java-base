package com.tcwgq.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.junit.Test;

public class OutputStreamWriterDemo1 {
	/**
	 * OutputStreamWriter的5个写方法：
	 * public void write(int c)：一次写一个字符。
	 * public void write(char[] cbuf)：一次写一个字符数组。
	 * public void write(char[] cbuf,int off,int len)：一次写一个字符数组的一部分。
	 * public void write(String str)：一次写一个字符串。
	 * public void write(String str,int off,int len)：一次写一个字符串的一部分。
	 */
	/**
	 * 一次写一个字符
	 * @throws IOException 
	 */
	@Test
	public void fun() throws IOException{
		FileOutputStream fos = new FileOutputStream("fos.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		osw.write("爱");
		//注意此处若不关闭osw，字符没有写入文件。
		//原因：一个字符占2个字节。文件中存储的基本单位是字节。
		//字符流不直接写入文件，而是先经过缓冲区，因此需要刷新一下。
		//此时需要刷新一下
//		//void flush()
		osw.flush();
		//刷新之后，文件写入成功
		//close()方法有自动刷新的功能。
		osw.close();
	}
	
	/**
	 * 不在一一描述
	 * @throws Exception 
	 */
	@Test
	public void fun1() throws Exception{
		FileOutputStream fos = new FileOutputStream("fos1.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		String s = "我爱你，中国！";
		osw.write('爱');//一次写一个字符,此处不是写一个字符了，而是一个字符串了。得有单引号。
		osw.write(s);//一次写一个字符串
		osw.write(s, 0, 3);//一次写一个字符串的一部分
		String ss = "我爱Java！";
		char[] cbuf = ss.toCharArray();
		osw.write(cbuf);//一次写一个字符数组
		osw.write(cbuf, 0, 2);//一次写一个字符数组的一部分
		osw.close();
	}
}
