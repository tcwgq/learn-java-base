package com.tcwgq.demo;

import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class FileReaderDemo {
	/**
	 * FileReader的构造方法：
	 * FileReader(File file)：在给定从中读取数据的 File 的情况下创建一个新 FileReader。
	 * FileReader(String fileName)：在给定从中读取数据的文件名的情况下创建一个新 FileReader。 
	 * @throws IOException 
	 */
	@Test
	public void fun() throws IOException{
		FileReader fr = new FileReader("fr.txt");
		//方式一，一次读取一个字符。
//		int ch = 0;
//		while((ch = fr.read()) != -1){
//			System.out.print((char)ch);
//		}
		//方式二，一次读取一个字符数组。
		char[] chs = new char[1024];
		int len = 0;
		while((len = fr.read(chs)) != -1){
			System.out.println(new String(chs, 0, len));
		}
		fr.close();
	}

}
