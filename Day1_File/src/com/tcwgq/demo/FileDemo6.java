package com.tcwgq.demo;

import java.io.File;
import org.junit.Test;

public class FileDemo6 {
	/**
	 * 基本获取功能：
	 * public String getAbsolutePath()
     * public String getPath()
	 * public String getName()
	 * public long length()
	 * public long lastModified()
	 * public String toString()
	 */
	@Test
	public void fun() {
		File file = new File("d:/data/a.txt");
		System.out.println(file.getAbsolutePath());// 返回此抽象路径名的绝对路径名字符串。
		System.out.println(file.getName());// 返回由此抽象路径名表示的文件或目录的名称。
		System.out.println(file.getParent());// 返回此抽象路径名父目录的路径名字符串；如果此路径名没有指定父目录，则返回null。
		System.out.println(file.getPath());// 将此抽象路径名转换为一个路径名字符串。
		System.out.println(file.lastModified());// 返回此抽象路径名表示的文件最后一次被修改的时间。
		System.out.println(file.length());// 返回由此抽象路径名表示的文件的长度。
		System.out.println(file.toString());//返回此抽象路径名的路径名字符串。
	}

}
