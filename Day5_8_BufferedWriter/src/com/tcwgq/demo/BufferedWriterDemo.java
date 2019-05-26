package com.tcwgq.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class BufferedWriterDemo {
	/**
	 * BufferedWriter的构造方法：
	 * BufferedWriter(Writer out):创建一个使用默认大小输出缓冲区的缓冲字符输出流。
	 * BufferedWriter(Writer out, int sz):创建一个使用给定大小输出缓冲区的新缓冲字符输出流。
	 * 一般默认缓冲区就够使用了，不用指定缓冲区。
	 * @throws IOException 
	 */
	
	@Test
	public void fun() throws IOException{
		//总共5中写方法，此处不再一一赘述！
		FileWriter fw = new FileWriter("fw.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String s = "狄更斯在100多年前曾说过：“这是最好的时代，这是最坏的时代；这是智慧的时代，这是愚蠢的时代；"
				+ "这是信仰的时期，这是怀疑的时期；这是光明的季节，这是黑暗的季节；这是希望之春，这是失望之冬；"
				+ "人们面前有着各样事物，人们面前一无所有；人们正在直登天堂，人们正在直下地狱。“";
		bw.write(s);
		bw.close();
	}

}
