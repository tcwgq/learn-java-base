package com.tcwgq.demo;

import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class FileWriterDemo {
	/**
	 * FileWriter的构造方法：
	 * FileWriter(File file)：根据给定的 File 对象构造一个 FileWriter 对象。
	 * FileWriter(String fileName)：根据给定的文件名构造一个 FileWriter 对象。
	 * FileWriter(File file, boolean append)：根据给定的 File 对象构造一个 FileWriter 对象，可指定追加写入。
	 * FileWriter(String fileName, boolean append):根据给定的文件名以及指示是否附加写入数据的 boolean 值来构造 FileWriter 对象。
	 * @throws IOException 
	 * 
	 */
	@Test
	public void fun() throws IOException{
		FileWriter fw = new FileWriter("a.txt");
		String s = "我爱你，我爱你，我爱死你了！";
		fw.write(s);
		fw.write("爱");//一次写一个字符
		fw.write(s);//一次写一个字符串
		fw.write(s, 0, 3);//一次写一个字符串的一部分
		String ss = "我爱Java！";
		char[] cbuf = ss.toCharArray();
		fw.write(cbuf);//一次写一个字符数组
		fw.write(cbuf, 0, 2);//一次写一个字符数组的一部分
		fw.close();
		//共有5中写方法，此处不再一一赘述。
	}
}
