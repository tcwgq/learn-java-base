package com.tcwgq.exercise4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

public class SortStringDemo {
	/**
	 * 已知s.txt文件中有这样的一个字符串："hcexfgijkamdnoqrzstuvwybpl"。
     * 请编写程序读取数据内容，把数据排序后写入ss.txt中。
	 * @throws IOException 
	 */
	@Test
	public void fun() throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("s.txt"));
		String s = br.readLine();
		char[] chs = s.toCharArray();
		//关键是对chs进行排序这这步
		Arrays.sort(chs);
		//String ss = chs.toString();//这样不能实现转换为字符串
		String sss= new String(chs);
		System.out.println(sss);
		BufferedWriter bw = new BufferedWriter(new FileWriter("ss.txt"));
		bw.write(sss);
		bw.close();
		br.close();
	}

}
