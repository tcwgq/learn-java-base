package com.tcwgq.demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.junit.Test;

public class FileInputStreamDemo {
	/**
	 * 字节流读取中文出现乱码的问题
	 * 
	 * @throws IOException
	 */
	
	/**
	 * 一次读取一个字节出现乱码
	 * @throws IOException
	 */
	@Test
	public void fun() throws IOException {
		FileInputStream fis = new FileInputStream("a.txt");
		int by = 0;
		while ((by = fis.read()) != -1) {
			System.out.print((char) by);
		}
		fis.close();
	}
	
	/**
	 * 一次读取一个字节数组就不出现乱码！
	 * 原因：一个汉字占两个字节，byte类型占一个字节，所以每读取两个字节才能确定一个汉字，
	 * 当每次读取一个字节时，直接解码，就会出现乱码。一次读取一个字节数组，也不能保证每次都不乱码。若 byte数组的长度不够且为奇数时，出现乱码。
	 * @throws IOException
	 */
	@Test
	public void fun1() throws IOException{
		FileInputStream fis = new FileInputStream("a.txt");
		byte[] bys = new byte[6];
		//byte的长度为1024时，不出现乱码，当byte的长度为5时，出现乱码。
		int len = 0;
		while((len = fis.read(bys)) != -1){
			System.out.print(new String(bys, 0, len));
		}
		fis.close();
	}

}
