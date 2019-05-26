package com.tcwgq.demo2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.junit.Test;

public class CopyFileDemo {
	/**
	 * 将项目路径下的DataStreamDemo.java文件复制到项目路径下的Copy.java中。
	 * @throws IOException 
	 */
	@Test
	public void fun() throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("DataStreamDemo.java"));
		PrintWriter pw = new PrintWriter(new FileWriter("Copy.java"), true);//开启自动刷新功能
		String s = null;
		while((s = br.readLine()) != null){
			pw.println(s);
		}
		pw.close();
		br.close();
	}

}
