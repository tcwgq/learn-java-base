package com.tcwgq.exercise;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class CopyFileDemo1 {
	/**
	 * 将d:/data/小清新.jpg复制到d:/end/小清新.jpg。
	 * 
	 * 用windows记事本打开能读懂的用字符流，不能读懂的用字符流。
	 * 字符流复制文件有4种方式。
	 * 掌握第4种方式
	 * @throws IOException 
	 */
	@Test
	public void fun1() throws IOException{
		FileInputStream fis = new FileInputStream("d:/data/小清新.jpg");
		FileOutputStream fos = new FileOutputStream("d:/end/小清新1.jpg");
		int by =0;
		while((by = fis.read()) != -1){
			fos.write(by);
		}
		fos.close();
		fis.close();
	}
	
	@Test
	public void fun2() throws IOException{
		FileInputStream fis = new FileInputStream("d:/data/小清新.jpg");
		FileOutputStream fos = new FileOutputStream("d:/end/小清新2.jpg");
		byte[] bys = new byte[1024];
		int len =0;
		while((len = fis.read(bys)) != -1){
			fos.write(bys, 0, len);
		}
		fos.close();
		fis.close();
	}
	
	@Test
	public void fun3() throws IOException{
		FileInputStream fis = new FileInputStream("d:/data/小清新.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("d:/end/小清新3.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int by =0;
		while((by = bis.read()) != -1){
			bos.write(by);
		}
		fos.close();
		fis.close();
	}
	
	@Test
	public void fun4() throws IOException{
		FileInputStream fis = new FileInputStream("d:/data/小清新.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("d:/end/小清新4.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		byte[] bys = new byte[1024];
		int len =0;
		while((len = bis.read(bys)) != -1){
			bos.write(bys, 0, len);
		}
		fos.close();
		fis.close();
	}

}
