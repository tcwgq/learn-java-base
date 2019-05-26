package com.tcwgq.demo;

import java.io.File;
import java.io.IOException;
import org.junit.Test;

public class FileDemo2 {
	/**
	 * 创建功能：
	 * public boolean createNewFile():当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。
     * public boolean mkdir():创建此抽象路径名称指定的目录（及只能创建一级的目录，且需要存在父目录）
	 * public boolean mkdirs():创建此抽象路径指定的目录，包括所有必须但不存在的父目录。
	 * （及可以创建多级目录，无论是否存在父目录）
	 */
	
	/**
	 * public boolean createNewFile():当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。
	 * 
	 * @throws IOException
	 */
	@Test
	public void fun() throws IOException {
		File file = new File("d:/data/a.txt");
		file.createNewFile();
	}
	
	/**
	 * 创建功能：mkdir()与mkdirs()，两者的区别：
	 * mkdir:创建此抽象路径名称指定的目录（及只能创建一级的目录，且需要存在父目录）
	 * mkdirs:创建此抽象路径指定的目录，包括所有必须但不存在的父目录。
	 * （及可以创建多级目录，无论是否存在父目录）
	 */
	@Test
	public void fun1() {
		File file = new File("D:/dir");
		file.mkdir();//一次只能创建一个目录
		File file2 = new File("D:/make/abc");
		file2.mkdir();//无法创建多个目录
		File file3 = new File("D:/dirs/abc/aaa");
		file3.mkdirs();//一次可以创建多个目录
	}
}
