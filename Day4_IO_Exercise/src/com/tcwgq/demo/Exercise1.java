package com.tcwgq.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class Exercise1 {
	/**
	 * B:复制图片
     * c:\\data\\小清新.jpg
	 * d:\\end\\小清新.jpg
	 */
	
	/**
	 * 基本字节流一次读取一个字节
	 * @throws IOException 
	 */
	@Test
	public void fun() throws IOException{
		FileInputStream fis = new FileInputStream("d:/data/小清新.jpg");
		FileOutputStream fos = new FileOutputStream("d:/end/小清新.jpg");
		int by = 0;
		while((by = fis.read())!= -1){
			fos.write(by);
		}
		fos.close();
		fis.close();
	}
	
	/**
	 * 基本字节流一次读取一个字节数组
	 * @throws IOException 
	 */
	@Test
	public void fun1() throws IOException{
		FileInputStream fis = new FileInputStream("d:/data/清纯.jpg");
		FileOutputStream fos = new FileOutputStream("d:/end/清纯.jpg");
		byte[] bys = new byte[5];
		int len = 0;
		while((len = fis.read(bys))!= -1){
			fos.write(bys, 0, len);//注意此处不能直接写成write(bys)
		}
		fos.close();
		fis.close();
	}
	
	/**
	 * 高效字节流一次读取一个字节
	 * @throws IOException 
	 */
	@Test
	public void fun2() throws IOException{
		FileInputStream fis = new FileInputStream("d:/data/性感.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("d:/end/性感.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int by = 0;
		while((by = bis.read()) != -1){
			bos.write(by);
		}
		bos.close();
		bis.close();
	}
	
	/**
	 * 高效字节流一次读取一个字节数组
	 * @throws IOException
	 */
	@Test
	public void fun3() throws IOException{
		FileInputStream fis = new FileInputStream("d:/data/小清新.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("d:/end/小清新.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		byte[] bys = new byte[5];
		int len = 0;
		while((len = bis.read(bys)) != -1){
			bos.write(bys, 0, len);
		}
		bos.close();
		bis.close();
	}

}
