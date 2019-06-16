package com.tcwgq.exercise1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

public class FileToArrayListDemo {
	/**
	 * 从文本文件中读取数据(每一行为一个字符串数据)到集合中，并遍历集合
	 * 使用字符流
	 * @throws IOException 
	 */
	@Test
	public void fun() throws IOException{
		FileReader fr = new FileReader("a.txt");
		BufferedReader br = new BufferedReader(fr);
		ArrayList<String> al = new ArrayList<String>();
		String line = null;
		while((line = br.readLine()) != null){
			al.add(line);
		}
		br.close();
		for(String s:al){
			System.out.println(s);
		}
	}

}
