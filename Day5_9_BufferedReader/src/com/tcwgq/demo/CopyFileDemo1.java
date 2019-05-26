package com.tcwgq.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class CopyFileDemo1 {
	/**
	 * 使用特殊方法复制文件。
	 * /**
	 * 把d:\\data\\InputStreamReaderDemo.java内容复制到d:\\end\\InputStreamReaderDemo.java。
	 * @throws IOException 
	 * @throws IOException 
	 */
	@Test
	public void fun() throws IOException{
		FileReader fr = new FileReader("d:\\data\\InputStreamReaderDemo.java");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("InputStreamReaderDemo1.java");
		BufferedWriter bw = new BufferedWriter(fw);
		String line = null;
		while((line = br.readLine()) != null){
			bw.write(line);
			bw.newLine();//必须加上这句话，否则，数据不换行
			bw.flush();//此处可以刷新一下
		}
		bw.close();
		br.close();
	}

}
