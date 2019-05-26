package com.tcwgq.demo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class BufferedOutputStreamDemo1 {
	/**
	 * BufferedOutputStream的方法：
	 * void flush()：刷新此缓冲的输出流。这迫使所有缓冲的输出字节被写出到底层输出流中。 
	 * void write(int b)：将指定的字节写入此缓冲的输出流。  
	 * void write(byte[] b, int off, int len)：
	 * 将指定 byte数组中从偏移量 off开始的 len个字节写入此缓冲的输出流。 
	 */
	/**
	 * void write(int b)：将指定的字节写入此缓冲的输出流。 
	 * @throws IOException 
	 */
	@Test
	public void fun() throws IOException{
		FileOutputStream fos = new FileOutputStream("fos.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		bos.write(97);
		bos.write('b');
		bos.close();
		//fos.close();
		//注意，此处不必关闭fos，关闭bos时已经关闭了fos。
	}
	/**
	 * void write(byte[] b, int off, int len)：
	 * 将指定 byte数组中从偏移量 off开始的 len个字节写入此缓冲的输出流。 
	 * @throws IOException 
	 */
	@Test
	public void fun1() throws IOException{
		FileOutputStream fos = new FileOutputStream("fos1.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String s = "Hello world!";
		byte[] bys =  s.getBytes();
		bos.write(bys, 0, 5);
		bos.close();
		//fos.close();
	}
	
	/**
	 * void flush()：刷新此缓冲的输出流。这迫使所有缓冲的输出字节被写出到底层输出流中。
	 * @throws IOException
	 * 如果没有关闭流，也没有刷新流，则写入数据不成功。
	 * close方法有自动刷新的作用。 
	 */
	/**
	 * 注意：flush方法一般存在于缓冲流，用于强制将缓冲区的数据输出。
	 * @throws IOException
	 */
	@Test
	public void fun2() throws IOException{
		FileOutputStream fos = new FileOutputStream("fos2.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String s = "Hello world!";
		byte[] bys =  s.getBytes();
		bos.write(bys, 0, 5);
		//bos.flush();
		bos.close();
		//fos.close();
	}

}
