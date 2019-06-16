package com.tcwgq.exercise2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import org.junit.Test;

public class GetRandomNameDemo {
	/**
	 * 文本文件中有一些名字，一个名字占一行，随机获取一个名字。
	 * @throws IOException 
	 */
	@Test
	public void fun() throws IOException{
		FileReader fr = new FileReader("name.txt");
		BufferedReader br = new BufferedReader(fr);
		ArrayList<String> al = new ArrayList<String>();
		String line = null;
		while((line = br.readLine()) != null){
			al.add(line);
		}
		br.close();
		//随机产生一个集合索引
		Random r = new Random();
		int i = r.nextInt(al.size());
		System.out.println(al.get(i));
//		for(String s:al){
//			System.out.println(s);
//		}
	}

}
