package com.tcwgq.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class CopyFileDemo {
	/**
	 * 把d:\\data\\InputStreamReaderDemo.java内容复制到d:\\end\\InputStreamReaderDemo.java。
	 * @throws IOException 
	 * @throws IOException 
	 */
	@Test
	public void fun() throws IOException{
		FileReader fr = new FileReader("d:\\data\\InputStreamReaderDemo.java");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("InputStreamReaderDemo.java");
		BufferedWriter bw = new BufferedWriter(fw);
		char[] chs = new char[1024];
		int len = 0;
		while((len = br.read(chs)) != -1){
			bw.write(chs, 0, len);
		}
		bw.close();
		br.close();
	}

}
