package com.tcwgq.demo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import org.junit.Test;

public class BufferedInputStreamDemo {
	/**
	 * BufferedInputStream的构造方法：
	 * public BufferedInputStream(InputStream in)：创建一个 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
	 * 创建一个内部缓冲区数组并将其存储在 buf 中。 
	 * public BufferedInputStream(InputStream in, int size)：创建具有指定缓冲区大小的 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
	 * 创建一个长度为 size 的内部缓冲区数组并将其存储在 buf 中。 
	 * @throws IOException 
	 */
	
	/**
	 * public BufferedInputStream(InputStream in)：创建一个 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
	 * @throws IOException
	 */
	@Test
	public void fun() throws IOException{
		FileInputStream fis = new FileInputStream("bis.txt");	
	    BufferedInputStream bis = new BufferedInputStream(fis);	
	    bis.close();
	}
	
	/**
	 * public BufferedInputStream(InputStream in, int size)：创建具有指定缓冲区大小的 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
	 * 创建一个长度为 size 的内部缓冲区数组并将其存储在 buf 中。 
	 * @throws IOException
	 */
	@Test
	public void fun1() throws IOException{
		FileInputStream fis = new FileInputStream("bis.txt");	
	    BufferedInputStream bis = new BufferedInputStream(fis, 1024);//指定内部缓冲区大小为1024字节，默认为8KB。
	    bis.close();
	}

}
