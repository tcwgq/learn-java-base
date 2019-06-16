package com.tcwgq.demo;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.junit.Test;

public class FileOutputStreamDemo {
	/**
	 * FileOutputStream的构造方法：
	 * FileOutputStream(String name) 
	 * FileOutputStream(String name, boolean append) 
	 * FileOutputStream(File file) 
	 * FileOutputStream(File file, boolean append)
	 * FileOutputStream(FileDescriptor fdObj)
	 */
	/**
	 * FileOutputStream(String name):
	 * 创建一个向具有指定名称的文件中写入数据的输出文件流。
	 * 创建一个新 FileDescriptor 对象来表示此文件连接。
	 * 如果文件不存在，则重新创建文件。默认是追加写数据。
	 * @throws IOException 
	 */
	@Test
	public void fun() throws IOException{
		OutputStream os = new FileOutputStream("os.txt");
		os.close();
	}
	
	/**
	 * FileOutputStream(String name, boolean append):
	 * 创建一个向具有指定 name 的文件中写入数据的输出文件流。
	 * 如果第二个参数为 true，则将字节写入文件末尾处，而不是写入文件开始处。
	 * @throws IOException 
	 */
	@Test
	public void fun2() throws IOException{
		OutputStream os = new FileOutputStream("os.txt", true);
		os.close();
	}
	
	/**
	 * FileOutputStream(File file):
	 * 创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
	 * 创建一个新 FileDescriptor 对象来表示此文件连接。 
	 * @throws IOException 
	 */
	@Test
	public void fun3() throws IOException{
		File file = new File("os.txt");
		OutputStream os = new FileOutputStream(file);
		os.close();
	}
	
	/**
	 * FileOutputStream(File file, boolean append):
	 *创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
	 *如果第二个参数为 true，则将字节写入文件末尾处，而不是写入文件开始处。
	 * @throws IOException 
	 */
	@Test
	public void fun4() throws IOException{
		File file = new File("os.txt");
		OutputStream os = new FileOutputStream(file, true);
		os.close();
	}
	
	/**
	 * FileOutputStream(FileDescriptor fdObj):创建一个向指定文件描述符处写入数据的输出文件流，
	 * 该文件描述符表示一个到文件系统中的某个实际文件的现有连接。 
	 * @throws IOException 
	 * FileDescriptor.in表标准输入流
	 * FileDescriptor.out表示标准输出流
	 * FileDescriptor.err表示标准错误输出流
	 */
	@Test
	public void fun5() throws IOException{
		FileOutputStream fos = new FileOutputStream(FileDescriptor.out);
		fos.write("Hello world!".getBytes());
		fos.close();
	}

}
