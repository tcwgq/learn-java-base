package com.tcwgq.demo;

import java.io.File;
import org.junit.Test;

public class FileDemo5 {
	/**
	 * 判断功能：
	 * public boolean isDirectory() 
	 * public boolean isFile()
	 * public boolean exists() 
	 * public boolean canRead() 
	 * public boolean canWrite() public
	 * boolean isHidden()
	 */
	@Test
	public void fun() {
		File file = new File("d:/data/a.txt");
		System.out.println(file.canExecute());// 测试应用程序是否可以执行此抽象路径名表示的文件。
		System.out.println(file.canRead());// 测试应用程序是否可以读取此抽象路径名表示的文件。
		System.out.println(file.canWrite());// 测试应用程序是否可以修改此抽象路径名表示的文件。
		System.out.println(file.exists());// 测试此抽象路径名表示的文件或目录是否存在。
		System.out.println(file.isAbsolute());// 测试此抽象路径名是否为绝对路径名。
		System.out.println(file.isDirectory());// 测试此抽象路径名表示的文件是否是一个目录。
		System.out.println(file.isFile());// 测试此抽象路径名表示的文件是否是一个标准文件。
		System.out.println(file.isHidden());// 测试此抽象路径名指定的文件是否是一个隐藏文件。
	}
	
}
