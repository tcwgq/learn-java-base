package com.tcwgq.demo;

import java.io.File;
import java.io.IOException;
import org.junit.Test;

public class FileDemo {
	/**
	 * File类的构造函数
	 */
	/**
	 * File(String pathname):
	 * 通过将给定路径名字符串转换为抽象路径名来创建一个新 File实例。
	 * 
	 * @throws IOException
	 */
	@Test
	public void fun() throws IOException {
		File file = new File("d:/data/a.txt");
		file.createNewFile();// 当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。
	}

	/**
	 * File(String parent, String child):
	 * 根据 parent 路径名字符串和 child 路径名字符串创建一个新File实例。
	 * 
	 * @throws IOException
	 */
	@Test
	public void fun1() throws IOException {
		String path1 = "d:/data/";
		String path2 = "data1/a.txt";
		File file = new File(path1, path2);
		file.createNewFile();
	}
	
	/**
	 * File(File parent, String child):根据 parent抽象路径名和 child 路径名字符串创建一个新 File实例。
	 * 
	 * @throws IOException
	 */
	@Test
	public void fun2() throws IOException {
		File file = new File("d:/data/");
		File file1 = new File(file, "data/a.txt");
		file1.createNewFile();
	}
	
}
