package com.tcwgq.exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class CopyFileDemo {
	/**
	 * 将d:/data/exam.sql复制到d:/end/exam.sql。
	 * 
	 * 用windows记事本打开能读懂的用字符流，不能读懂的用字符流。
	 * 使用字符流更加方便一些。
	 * 字符流复制文件有5种方式。
	 */
	/**
	 * FileReader--BufferedReader
	 * FileWriter--BufferedWriter
	 * 还有一种Buffered的特殊方法。
	 * @throws IOException 
	 */
	@Test
	public void fun() throws IOException{
		FileReader fr = new FileReader("d:/data/exam.sql");
		FileWriter fw = new FileWriter("d:/end/exam.sql");
//		//一次复制一个字符
//		int ch = 0;
//		while((ch = fr.read()) != -1){
//			fw.write(ch);
//		}
		//一次复制一个字符数组
		char[] chs = new char[1024];
		int len = 0;
		while((len = fr.read(chs)) != -1){
			fw.write(chs, 0, len);
		}
		fw.close();
		fr.close();
	}
	
	@Test
	public void fun1() throws IOException{
		FileReader fr = new FileReader("d:/data/exam.sql");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("d:/end/exam.sql");
		BufferedWriter bw = new BufferedWriter(fw);
		//一次复制一个字符
//		int ch = 0;
//		while((ch = fr.read()) != -1){
//			bw.write(ch);
//		}
		//一次复制一个字符数组
		char[] chs = new char[1024];
		int len = 0;
		while((len = br.read(chs)) != -1){
			bw.write(chs, 0, len);
		}
		bw.close();
		br.close();
	}
	
	/**
	 * 特殊方法
	 * @throws IOException 
	 */
	@Test
	public void fun2() throws IOException{
		FileReader fr = new FileReader("d:/data/exam.sql");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("d:/end/exam.sql");
		BufferedWriter bw = new BufferedWriter(fw);
		//一次复制一行
		String line = null;
		while((line = br.readLine()) != null){
			bw.write(line);
			bw.newLine();//别忘了加换行
		}
		bw.close();
		br.close();
	}

}
