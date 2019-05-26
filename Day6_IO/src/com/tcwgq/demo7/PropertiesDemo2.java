package com.tcwgq.demo7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

import org.junit.Test;

public class PropertiesDemo2 {
	/**
	 * 和IO流的结合使用：
	 * public void load(Reader reader)：按简单的面向行的格式从输入字符流中读取属性列表（键和元素对）。
	 * public void store(Writer writer, String comments):以适合使用 load(Reader) 方法的格式，
	 * 将此 Properties 表中的属性列表（键和元素对）写入输出字符。
	 * @throws IOException 
	 */
	/**
	 * 适用于：单机版游戏的进度保存与加载。
	 * @throws IOException
	 */
	@Test
	public void fun() throws IOException{
		Properties p = new Properties();
		FileReader fr = new FileReader("properties.txt");
		p.load(fr);
		fr.close();
		System.out.println(p);
	}
	
	/**
	 * 将集合中的数据写入的文件
	 * @throws IOException 
	 */
	@Test
	public void fun1() throws IOException{
		Properties prop = new Properties();
		prop.setProperty("a", "aaa");
		prop.setProperty("b", "bbb");
		prop.setProperty("c", "ccc");
		Writer w = new FileWriter("name.txt");
		prop.store(w, "HelloWorld");
		w.close();
	}

}
