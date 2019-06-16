package com.tcwgq.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class BufferedDemo {
	/**
	 * 字符缓冲流的特殊方法：
	 * BufferedWriter:
	 * public void newLine():写入一个行分隔符。行分隔符字符串由系统属性 line.separator 定义，并且不一定是单个新行 ('\n') 符。即根据系统写入换行符。 
	 * 
	 * BufferedReader:
	 * public String readLine():读取一个文本行。通过下列字符之一即可认为某行已终止：换行 ('\n')、回车 ('\r') 或回车后直接跟着换行。 即一次读取一行数据。
	 * @throws IOException 
	 */
	
	@Test
	public void fun() throws IOException{
		FileWriter fw = new FileWriter("fw.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		for(int i = 0; i < 10; i++){
			bw.write("hello"+i);//此时数据没换行
//			bw.write("\r\n");//数据实现换行
			bw.newLine();//根据系统，自动写入换行符
			bw.flush();//此处可以刷新一下
		}
		bw.close();
	}
	
	/**
	 * readLine():读取一个文本行。通过下列字符之一即可认为某行已终止：换行 ('\n')、回车 ('\r') 或回车后直接跟着换行。 即一次读取一行数据。
	 * 包含该行内容的字符串，不包含任何行终止符，如果已到达流末尾，则返回 null。
	 * @throws IOException
	 */
	@Test
	public void fun1() throws IOException{
		FileReader fr = new FileReader("fr.txt");
		BufferedReader br = new BufferedReader(fr);
//		String s = br.readLine();//一次读取一行数据
//		System.out.println(s);
//		String ss = br.readLine();
//		System.out.println(ss);
		String line = null;
		while((line = br.readLine()) != null){
			System.out.println(line);
			//此处必须是println，因为readLine读取的不包含任何终止符
		}
		br.close();
	}

}
