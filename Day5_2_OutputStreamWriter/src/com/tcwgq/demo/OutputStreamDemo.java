package com.tcwgq.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.junit.Test;

public class OutputStreamDemo {
	/**
	 * OutputStreamWriter的构造方法：
	 * OutputStreamWriter(OutputStream out)：创建使用默认字符编码的 OutputStreamWriter。
	 * OutputStreamWriter(OutputStream out, String charsetName):创建使用指定字符集的 OutputStreamWriter。 
	 * @throws IOException 
	 */
	
	/**
	 * 创建使用默认字符编码的 OutputStreamWriter。
	 * @throws IOException
	 */
	@Test
	public void fun() throws IOException{
		FileOutputStream fos = new FileOutputStream("osw.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		String s = "我爱你，中国！";
		char[] cbuf = s.toCharArray();
		osw.write(cbuf, 0, cbuf.length);
		osw.close();
	}
	
	/**
	 * 创建使用指定字符集的 OutputStreamWriter。 
	 * @throws IOException 
	 */
	@Test
	public void fun1() throws IOException{
		FileOutputStream fos = new FileOutputStream("osw.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		//使用GBK出现乱码，原因是默认编码为UTF-8。
		String s = "我爱你，中国！";
		char[] cbuf = s.toCharArray();
		osw.write(cbuf, 0, cbuf.length);
		osw.close();
	}
	
	/**
	 * OutputStreamWriter的几个写方法。
	 * @throws IOException 
	 */
	@Test
	public void fun2() throws IOException{
		FileOutputStream fos = new FileOutputStream("osw.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		String s = "我爱你，中国！";
		osw.write("爱");//一次写一个字符
		osw.write(s);//一次写一个字符串
		osw.write(s, 0, 3);//一次写一个字符串的一部分
		String ss = "我爱Java！";
		char[] cbuf = ss.toCharArray();
		osw.write(cbuf);//一次写一个字符数组
		osw.write(cbuf, 0, 2);//一次写一个字符数组的一部分
		osw.close();
	}
}
