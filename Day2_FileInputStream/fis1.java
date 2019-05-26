package com.tcwgq.demo;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;

import org.junit.Test;

public class FileInputStreamDemo {
	/**
	 * FileInputStream的构造方法：
	 * FileInputStream(String name):通过打开一个到实际文件的连接来创建一个 FileInputStream，
	 * 该文件通过文件系统中的路径名 name 指定。
	 * FileInputStream(File file):通过打开一个到实际文件的连接来创建一个 FileInputStream，
	 * 该文件通过文件系统中的 File 对象 file 指定。
	 * FileInputStream(FileDescriptor fdObj):通过使用文件描述符 fdObj 创建一个 FileInputStream，
	 * 该文件描述符表示到文件系统中某个实际文件的现有连接。这个等到标准输入输出流时在讲。
	 */
	
	/**
	 * FileInputStream(String name):通过打开一个到实际文件的连接来创建一个 FileInputStream，
	 * 该文件通过文件系统中的路径名 name 指定。
	 * @throws IOException 
	 */
	@Test
	public void fun() throws IOException{
		FileInputStream fis = new FileInputStream("fis.txt");
		fis.close();
	}
	
	/**
	 * FileInputStream(File file):通过打开一个到实际文件的连接来创建一个 FileInputStream，
	 * 该文件通过文件系统中的 File 对象 file 指定。
	 * @throws IOException 
	 */
	@Test
	public void fun1() throws IOException{
		File file = new File("fis.txt");
		FileInputStream fis = new FileInputStream(file);
		fis.close();
	}
	
	/**
	 * FileInputStream(FileDescriptor fdObj):通过使用文件描述符 fdObj 创建一个 FileInputStream，
	 * 该文件描述符表示到文件系统中某个实际文件的现有连接。
	 * @throws IOException
	 * FileDescriptor.in表标准输入流
	 * FileDescriptor.out表示标准输出流
	 * FileDescriptor.err表示标准错误输出流
	 */
	/**
	 * 用FileDescriptor.in实现从键盘录入单个字符
	 * @throws IOException
	 */
	@Test
	public void fun2() throws IOException{
		FileInputStream fis = new FileInputStream(FileDescriptor.in);
		int b = fis.read();//模拟键盘录入单个字符
		System.out.println((char)b);
		byte[] bytes = new byte[1024];
		b = fis.read(bytes);//模拟键盘录入字符串
		System.out.println(new String(bytes, 0, b));
		fis.close();
	}

}
