package com.tcwgq.demo;

import java.io.File;

import org.junit.Test;

public class FileDemo7 {
	/**
	 * 高级获取功能：
	 * public String[] list():返回一个字符串数组，
	 * 这些字符串指定此抽象路径名表示的目录中的文件和目录。
	 * public File[] listFiles():返回一个抽象路径名数组，
	 * 这些路径名表示此抽象路径名表示的目录中的文件。
	 */
	/**
	 * public String[] list():返回一个字符串数组，
	 * 这些字符串指定此抽象路径名表示的目录中的文件和目录。
	 */
	@Test
	public void fun() {
		File file = new File("D:/Data/");
		String[] fileNames = file.list();
		for (String s : fileNames) {
			System.out.println(s);
		}
	}
	
	/**
	 * public File[] listFiles():返回一个抽象路径名数组，
	 * 这些路径名表示此抽象路径名表示的目录中的文件。
	 */
	@Test
	public void fun1() {
		File file = new File("D:/Data/");
		File[] files = file.listFiles();
		for (File f : files) {
			System.out.println(f);
		}
	}

}
