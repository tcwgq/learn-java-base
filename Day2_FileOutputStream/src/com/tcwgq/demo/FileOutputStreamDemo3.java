package com.tcwgq.demo;

import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class FileOutputStreamDemo3 {
	/**
	 * FileOutputStream实现数据的追加写入
	 * 使用FileOutputStream带第二个参数的构造方法实现数据追加写入，
	 * 第二个参数为true表示追加写入
	 * @throws IOException 
	 * 
	 */
	@Test
	public void fun() throws IOException{
		FileOutputStream fos = new FileOutputStream("fos3.txt", true);
		for(int i = 0;i < 10; i++){
			fos.write(("Hello"+i).getBytes());
			fos.write("\r\n".getBytes());
		}
		fos.close();
	}
	
}
