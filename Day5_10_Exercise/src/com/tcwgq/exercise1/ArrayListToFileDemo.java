package com.tcwgq.exercise1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

public class ArrayListToFileDemo {
	/**
	 * 把ArrayList集合中的字符串数据存储到文本文件。
	 * 使用字符流。
	 * @throws IOException 
	 */
	@Test
	public void fun() throws IOException{
		ArrayList<String> al = new ArrayList<String>();
		al.add("我爱你");
		al.add("我很爱你");
		al.add("我爱你一万年！");
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
//		for(int i = 0; i < al.size(); i++){
//			bw.write(al.get(i));
//			bw.newLine();
//		}
		for(String s:al){
			bw.write(s);
			bw.newLine();
		}
		bw.close();
	}
	
}
