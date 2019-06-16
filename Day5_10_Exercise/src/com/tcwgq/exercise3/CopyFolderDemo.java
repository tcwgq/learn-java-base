package com.tcwgq.exercise3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class CopyFolderDemo {
	/**
	 * 复制单极文件夹 
	 * 把 d:/data/folder下的所有文件复制到 d:/end/folder下
	 * 
	 * @throws IOException
	 */
	@Test
	public void fun() throws IOException {
		File file1 = new File("d:/data/folder");
		File file2 = new File("d:/end/folder");
		//如果文件夹不存在，创建之
		if(!file2.exists())
			file2.mkdirs();//注意此处用带s的更好
		File[] files = file1.listFiles();
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		for (File file : files) {
			bis = new BufferedInputStream(new FileInputStream(file));
			bos = new BufferedOutputStream(new FileOutputStream(new File(file2, file.getName())));
			byte[] bys = new byte[1024];
			int len = 0;
			while ((len = bis.read(bys)) != -1) {
				bos.write(bys, 0, len);
			}
			bos.close();
			bis.close();
		}
	}

}
