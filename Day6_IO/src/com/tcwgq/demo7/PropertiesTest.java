package com.tcwgq.demo7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.junit.Test;

public class PropertiesTest {
	/**
	 * 有一个文本文件key.txt，知道里面存的是键值对，但不知道是什么。
	 * 写一个程序，判断文件中是否有"liSi"这样的键存在，如果有，改其值为"100"。
	 * @throws IOException 
	 */
	@Test
	public void fun() throws IOException{
		Properties p = new Properties();
		FileReader fr = new FileReader("key.txt");
		p.load(fr);
		fr.close();
		Set<String> set = p.stringPropertyNames();
		for(String key:set){
			if(key.equals("liSi")){
				p.setProperty(key, "100");
			}
			System.out.println(p.getProperty(key));
		}
		FileWriter fw = new FileWriter("key.txt");
		p.store(fw, null);
		fw.close();
	}

}
