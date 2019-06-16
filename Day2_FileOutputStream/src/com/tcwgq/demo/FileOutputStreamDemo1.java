package com.tcwgq.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.junit.Test;

public class FileOutputStreamDemo1 {
	/**
	 * FileOutputStream的三个write方法：
	 * public void write(int b)：将指定字节写入此文件输出流。
	 * 实现 OutputStream 的 write 方法。一次写一个字节
	 * public void write(byte[] b)：将 b.length 个字节从指定 byte 数组写入此文件输出流中。
	 * public void write(byte[] b,int off,int len)：将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此文件输出流。 
	 */
	
	/**
	 * public void write(int b)：将指定字节写入此文件输出流。
	 * @throws IOException 
	 */
	@Test
	public void fun() throws IOException{
		OutputStream os = new FileOutputStream("fos1.txt");
		os.write('a');
		os.write('b');
		os.write('c');
		String s = "Hello world!";
		byte[] bytes = s.getBytes();
		os.write(bytes);
		os.close();
	}
	
	/**
	 * public void write(byte[] b)：将 b.length 个字节从指定 byte 数组写入此文件输出流中。
	 * @throws IOException 
	 */
	@Test
	public void fun1() throws IOException{
		OutputStream os = new FileOutputStream("fos1.txt");
		String s = "Hello world!";
		byte[] bytes = s.getBytes();
		os.write(bytes);
		os.close();
	}
	
	/**
	 * public void write(byte[] b,int off,int len)：
	 * 将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此文件输出流。 
	 * @throws IOException 
	 */
	@Test
	public void fun2() throws IOException{
		OutputStream os = new FileOutputStream("fos1.txt");//abc目录不存在，不能创建文件a.txt。
		String s = "Hello world1";
		byte[] bytes = s.getBytes();
		os.write(bytes, 0, 3);
		os.close();
	}

}
