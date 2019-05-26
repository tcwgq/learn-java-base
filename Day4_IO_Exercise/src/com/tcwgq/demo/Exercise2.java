package com.tcwgq.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class Exercise2 {
	/**
	 * C:复制视频
	 * c:\\data\\Darksiders.flv
   	 * d:\\end\\Darksiders.flv
	 */
	
	/**
	 * 基本字节流一次读取一个字节
	 * @throws IOException 
	 */
	@Test
	public void fun() throws IOException{
		FileInputStream fis = new FileInputStream("d:/data/Darksiders.flv");
		FileOutputStream fos = new FileOutputStream("d:/end/Darksiders.flv");
		long begin = System.currentTimeMillis();
		int by = 0;
		while((by = fis.read())!= -1){
			fos.write(by);
		}
		long end = System.currentTimeMillis();
		long time = end - begin;
		System.out.println(time);
		fos.close();
		fis.close();
	}
	
	/**
	 * 基本字节流一次读取一个字节数组
	 * @throws IOException 
	 */
	@Test
	public void fun1() throws IOException{
		FileInputStream fis = new FileInputStream("d:/data/Darksiders.flv");
		FileOutputStream fos = new FileOutputStream("d:/end/Darksiders.flv");
		long begin = System.currentTimeMillis();
		byte[] bys = new byte[5];
		int len = 0;
		while((len = fis.read(bys))!= -1){
			fos.write(bys, 0, len);//注意此处不能直接写成write(bys)
		}
		long end = System.currentTimeMillis();
		long time = end - begin;
		System.out.println(time);
		fos.close();
		fis.close();
	}
	
	/**
	 * 高效字节流一次读取一个字节
	 * @throws IOException 
	 */
	@Test
	public void fun2() throws IOException{
		FileInputStream fis = new FileInputStream("d:/data/Darksiders.flv");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("d:/end/Darksiders.flv");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		long begin = System.currentTimeMillis();
		int by = 0;
		while((by = bis.read()) != -1){
			bos.write(by);
		}
		long end = System.currentTimeMillis();
		long time = end - begin;
		System.out.println(time);
		bos.close();
		bis.close();
	}
	
	/**
	 * 高效字节流一次读取一个字节数组
	 * @throws IOException 
	 */
	@Test
	public void fun3() throws IOException{
		FileInputStream fis = new FileInputStream("d:/data/Darksiders.flv");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("d:/end/Darksiders.flv");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		long begin = System.currentTimeMillis();
		byte[] bys = new byte[1024];//此处的字节缓冲区大小决定复制文件的时间，
		int len = 0;
		while((len = bis.read(bys)) != -1){
			bos.write(bys, 0, len);
		}
		long end = System.currentTimeMillis(	);
		long time = end - begin;
		System.out.println(time);
		bos.close();
		bis.close();
	}

}
