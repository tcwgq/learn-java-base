package com.tcwgq.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

public class InputStreamReaderDemo {
	/**
	 * InputStreamReader的构造方法：
	 * public InputStreamReader(InputStream in)：创建一个使用默认字符集的 InputStreamReader。 
	 * InputStreamReader(InputStream in, String charsetName)：创建使用指定字符集的 InputStreamReader。 
	 */
	
	/**
	 * 使用默认字符集创建InputStreamReader
	 * @throws IOException 
	 */
	@Test
	public void fun() throws IOException{
		FileInputStream fis = new FileInputStream("isr.txt");
		InputStreamReader isr = new InputStreamReader(fis);
//		System.out.println(isr.getEncoding());
		int by = 0;
		while((by = isr.read()) != -1){
			System.out.print((char)by);
		}
		isr.close();
	}
	
	/**
	 * 使用指定字符集创建InputStreamReader
	 * @throws IOException 
	 */
	@Test
	public void fun1() throws IOException{
		FileInputStream fis = new FileInputStream("isr1.txt");
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
//		System.out.println(isr.ready());
		int by = 0;
		while((by = isr.read()) != -1){
			System.out.print((char)by);
		}
		System.out.println(by);//读取到文件末尾，返回-1
		isr.close();
	}
	
	/**
	 * 一次读取一个字符数组
	 * 返回实际读取的字符个数
	 * @throws IOException 
	 */
	@Test
	public void fun2() throws IOException{
		FileInputStream fis = new FileInputStream("isr2.txt");
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		char[] cbuf = new char[5];
		int by = 0;
		while((by = isr.read(cbuf)) != -1){
			System.out.print(new String(cbuf, 0, by));
		}
		isr.close();
	}
	
	/**
	 * 一次读取一个字符数组的一部分。
	 * @throws IOException 
	 */
	@Test
	public void fun3() throws IOException{
		FileInputStream fis = new FileInputStream("isr3.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		char[] cbuf = new char[1024];
		int bys = isr.read(cbuf, 0, 5);//读取字符数组的一部分
		System.out.println(new String(cbuf, 0, bys));
		isr.close();
	}
}
