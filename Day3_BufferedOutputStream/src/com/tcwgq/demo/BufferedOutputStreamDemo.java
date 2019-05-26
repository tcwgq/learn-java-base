package com.tcwgq.demo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class BufferedOutputStreamDemo {
	/**
	 * BufferedOutputStream：实现缓冲的输出流。
	 */
	/**
	 * 字段摘要：
	 * protected byte[] buf存储数据的内部缓冲区。 
	 * protected int count缓冲区中的有效字节数。
	 * 此值始终处于 0 到 buf.length 范围内；
	 * 元素 buf[0] 到 buf[count-1] 包含有效的字节数据。 
	 */
	/**
	 * 构造方法：
	 * BufferedOutputStream(OutputStream out)：创建一个新的缓冲输出流，以将数据写入指定的底层输出流。 
	 * BufferedOutputStream(OutputStream out, int size)：创建一个新的缓冲输出流，以将具有指定缓冲区大小的数据写入指定的底层输出流。 
	 */
	/**
	 * BufferedOutputStream(OutputStream out)：创建一个新的缓冲输出流，以将数据写入指定的底层输出流。 
	 * @throws IOException 
	 */
	@Test
	public void fun() throws IOException{
		FileOutputStream fos = new FileOutputStream("bos.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		bos.write("Hello world!".getBytes());
		bos.close();
//		fos.close();//此处不需关闭fos，关闭bos时同时关闭了fos。
	}
	
	/**
	 *BufferedOutputStream(OutputStream out, int size)：创建一个新的缓冲输出流，以将具有指定缓冲区大小的数据写入指定的底层输出流。 
	 *size表示缓冲区的大小，指定后使用用户自定义缓冲区大小，默认缓冲区大小为8192，即8字节。
	 * @throws IOException 
	 */
	@Test
	public void fun1() throws IOException{
		FileOutputStream fos = new FileOutputStream("bos1.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos, 1024);
		bos.write("Hello world!".getBytes());
		bos.close();
//		fos.close();
	}
	
}
