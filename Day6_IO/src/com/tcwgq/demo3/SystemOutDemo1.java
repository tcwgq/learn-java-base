package com.tcwgq.demo3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.junit.Test;

public class SystemOutDemo1 {
	/**
	 * 转换流的应用。可以将字节流转换为字符流。
	 * @throws IOException 
	 * 
	 */
	@Test
	public void fun() throws IOException{
//		PrintStream pw = System.out;
//		OutputStream os = pw;
//		OutputStreamWriter osw = new OutputStreamWriter(os);
//		BufferedWriter bw = new BufferedWriter(osw);
		//合写为一句
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("Hello");
		bw.newLine();
//		bw.flush();
		bw.write("World");
		bw.newLine();
//		bw.flush();
		bw.write("Java");
		bw.flush();
		bw.close();
	}

}
