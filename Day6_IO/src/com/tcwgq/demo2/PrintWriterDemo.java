package com.tcwgq.demo2;

import java.io.IOException;
import java.io.PrintWriter;

import org.junit.Test;

public class PrintWriterDemo {
	/**
	 * 打印流：
	 * 字节打印流
	 *  PrintStream
	 * 字符打印流
	 *  PrintWriter
	 *  特点：
	 *  A:只能写数据，不能读数据，只能操作目的地，不能操作数据源。
	 *  B:可以操作任意类型的数据
	 *  C:如果启动了自动刷新，则可以自动刷新
	 *  D:可以直接操作文本文件
	 *  哪些流可以直接操作文本文件？
	 *    FileInputStream
	 *    FileOutputStream
	 *    FileReader
	 *    FileWriter
	 *    PrintWriter
	 *    PrintStream
	 *    查API，看构造方法是否有File或者String类型的参数，如果有，就是基本流。
	 *    
	 *    流：
	 *      基本流：可以直接操作文件的流
	 *      高级流：在基本流的基础上提供了一些包装功能。
	 * @throws IOException 
	 */
	@Test
	public void fun() throws IOException{
		PrintWriter pw = new PrintWriter("pw.txt");
		pw.write("Hello, world!");
		pw.write('爱');
		pw.close();//不关闭的话，写入文件不成功
	}

}
