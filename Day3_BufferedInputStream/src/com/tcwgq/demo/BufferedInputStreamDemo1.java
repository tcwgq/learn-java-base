package com.tcwgq.demo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import org.junit.Test;

public class BufferedInputStreamDemo1 {
	/**
	 * BufferedInputStream的读方法：
	 * int read():一次读取一个字节，同FileInputStream的read()方法。
	 * 
	 * int read(byte[] b, int off, int len):此方法实现了 InputStream 类相应 read 方法的常规协定。
	 * 另一个便捷之处在于，它将通过重复地调用底层流的 read 方法，尝试读取尽可能多的字节。这种迭代的 read 会一直继续下去，直到满足以下条件之一： 
     * 已经读取了指定的字节数， 
     * 底层流的 read 方法返回 -1，指示文件末尾（end-of-file），或者 
     * 底层流的 available 方法返回 0，指示将阻塞后续的输入请求。 
     * 如果第一次对底层流调用 read 返回 -1（指示文件末尾），则此方法返回 -1。否则此方法返回实际读取的字节数。
	 */
	
	/**
	 *  int read():一次读取一个字节，同FileInputStream的read()方法。
	 * @throws IOException 
	 */
	@Test
	public void fun() throws IOException{
		FileInputStream fis = new FileInputStream("bis1.txt");	
	    BufferedInputStream bis = new BufferedInputStream(fis);	
	    int by = bis.read();
	    System.out.println((char)by);
	    bis.close();
	}
	
	/**
	 * int read(byte[] b, int off, int len):此方法实现了 InputStream 类相应 read 方法的常规协定。
	 * 注意：此方法重复地调用底层的read方法，尝试读取尽可能多的字节。
	 * @throws IOException 
	 */
	@Test
	public void fun1() throws IOException{
		FileInputStream fis = new FileInputStream("bis1.txt");	
	    BufferedInputStream bis = new BufferedInputStream(fis);
	    byte[] bys = new byte[1024];
	    int len = bis.read(bys);//底层重复调用了read方法。
	    System.out.println(new String(bys, 0, len));
	    bis.close();
	}
	

}
