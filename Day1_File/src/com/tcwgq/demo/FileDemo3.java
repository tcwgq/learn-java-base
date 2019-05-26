package com.tcwgq.demo;

import java.io.File;

import org.junit.Test;

public class FileDemo3 {
	/**
	 * 删除功能:
	 * boolean delete():删除此抽象路径名表示的文件或目录。
	 * 如果此路径名表示一个目录，则该目录必须为空才能删除。 
	 */
	@Test
	public void fun(){
		File file = new File("d:/data/delete");//目录下不为空，不能删除
		file.delete();
		File file1 = new File("d:/data/del");//目录为空，可以删除
		file1.delete();
	}
}
