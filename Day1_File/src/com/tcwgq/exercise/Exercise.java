package com.tcwgq.exercise;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

import org.junit.Test;

public class Exercise {
	/**
	 * 输出指定目录下的指定后缀名的文件名称。 获取d:/data下的所有txt文件名称。
	 */

	/**
	 * 方法一：先获取d:/data下的所有文件及文件夹名称，然后判断这些判断是文件还是文件夹，
	 * 是文件的话，在判断是不是以txt结尾，如果是，就输出文件名称。
	 */
	/**
	 * 使用String list()函数。
	 */
	@Test
	public void fun() {
		File file = new File("d:/data");
		String[] fileNames = file.list();
		for (String s : fileNames) {
			File f = new File("d:/data/" + s);//注意此处data前后都有/。
			//System.out.println(f);
			if (f.isFile() && s.endsWith(".txt"))
				System.out.println(s);
		}
	}
	
	/**
	 * 使用File[] listFiles()函数。
	 */
	@Test
	public void fun1(){
		File file = new File("d:/data");
		File[] files = file.listFiles();
		for(File f : files){
			if(f.isFile()&&f.getName().endsWith(".txt"))
				System.out.println(f.getName());
		}
	}
	
	/**
	 * 使用文件过滤器FilenameFilter
	 */
	@Test
	public void fun2(){
		File file = new File("d:/data");
		String[] names = file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
//				System.out.println(dir+"--"+name);
				File f = new File(dir, name);
				if(f.isFile()&&name.endsWith(".txt"))
//					System.out.println(name);
				return true;
				return false;
			}
		});
		for(String s:names){
			System.out.println(s);
		}
	}

	/**
	 * 使用文件过滤器FileFilter
	 */
	@Test
	public void fun3(){
		File file = new File("d:/data");
		File[] names = file.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				if(pathname.isFile()&&pathname.getName().endsWith(".txt"))
					return true;
				return false;
			}
		});
		for(File f: names){
			System.out.println(f.getName());
		}
	}
}
