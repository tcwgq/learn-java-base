package com.tcwgq.demo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class DataStreamDemo {
	/**
	 * 可以读写基本数据类型的数据。
	 * 数据输入流：
	 * DataInputStream(InputStream in)：使用指定的底层 InputStream 创建一个DataInputStream。
	 * 数据输出流：
	 * DataOutputStream(OutputStream out)：创建一个新的数据输出流，将数据写入指定基础输出流。
	 */
	/**
	 * 写功能
	 * @throws IOException 
	 */
	@Test
	public void fun() throws IOException{
		FileOutputStream fos = new FileOutputStream("fos.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeInt(100);//写一个整数
		dos.writeShort(1);//写一个short类型
		dos.writeChar('爱');//写一个字符
//		dos.write("Hello, world!".getBytes());//写一个字节数组
		dos.writeFloat(10.512F);//写一个float类型
		dos.writeDouble(3.1415926);//写一个double类型
		dos.writeBoolean(true);
		dos.close();
		//写到文件的结果是出现乱码，这个我们读不懂，只能使用DataInputStream读取。
	}
	
	/**
	 * 读功能
	 * @throws IOException 
	 */
	@Test
	public void fun1() throws IOException{
		/**
		 * 注意读的时候，要和上面写的相对应。
		 */
		FileInputStream fis = new FileInputStream("fos.txt");
		DataInputStream dis = new DataInputStream(fis);
		int a = dis.readInt();
		System.out.println(a);
		short s = dis.readShort();
		System.out.println(s);
		char c = dis.readChar();
		System.out.println(c);
		float f = dis.readFloat();
		System.out.println(f);
		double d = dis.readDouble();
		System.out.println(d);
		boolean b = dis.readBoolean();
		System.out.println(b);
		dis.close();
	}

}
