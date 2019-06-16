package com.tcwgq.demo2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.junit.Test;

public class PrintWriterDemo1 {
	/**
	 * PrintWriter的特殊性:
	 * print，println方法可以操作任意类型的数据。
	 * 
	 * 可以启用自动刷新功能。
	 * 只能是println，printf，format三种方法可以自动刷新。
	 * 不但自动刷新，还可以自动换行。
	 * 此时的println方法，相当于以前的
	 * bw.write();
	 * bw.newLine();
	 * bw.flush();
	 * @throws IOException 
	 */
	@Test
	public void fun() throws IOException{
//		PrintWriter pw = new PrintWriter("pw1.txt");
		PrintWriter pw = new PrintWriter(new FileWriter("pw1.txt"), true);
		/**
		 * writer方法搞不定，需要使用print方法。
		 */
//		pw.print("Hello, world!");
//		pw.print('爱');
//		pw.print(100);
//		pw.print(true);
//		pw.print(3.1415926);
//		pw.print(10.24f);
//		pw.close();
		pw.println("Hello, world!");
		pw.println(100);
		pw.println(true);
		pw.close();
		
	}

}
