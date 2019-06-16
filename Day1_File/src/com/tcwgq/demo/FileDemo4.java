package com.tcwgq.demo;

import java.io.File;
import org.junit.Test;

public class FileDemo4 {
	/**
	 * 重命名功能：
	 * public boolean renameTo(File dest)：重新命名此抽象路径名表示的文件。 
	 * 如果重命名文件与原文件所在位置相同，则重命名文件，如果位置不同，在将原文件
	 * 剪切至指定位置并重命名。
	 */
	@Test
	public void fun(){
		File oldFile = new File("d:/data/old.txt");
		File newFile = new File("d:/data/new.txt");//新旧文件位置相同
		File destFile = new File("d:/data/aaa/new.txt");//新旧文件位置不同
		oldFile.renameTo(newFile);
		oldFile.renameTo(destFile);
	}

}
