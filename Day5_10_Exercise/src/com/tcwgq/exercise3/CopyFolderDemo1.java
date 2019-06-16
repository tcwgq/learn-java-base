package com.tcwgq.exercise3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class CopyFolderDemo1 {
	/**
	 * 复制单极文件夹中指定文件并修改文件名称
	 */
	/**
	 * 复制单极文件夹 把 d:/data/folder下的所有的.java文件复制到 d:/end/folder下，并修改指定文件后缀名为.jad。
	 * 
	 * @throws IOException
	 */
	@Test
	public void fun() throws IOException {
		File file1 = new File("d:/data/folder");
		File file2 = new File("d:/end/folder");
		if (!file2.exists())
			file2.mkdir();
		File[] files = file1.listFiles();
		for (File f : files) {
			if (f.isFile() && f.getName().endsWith(".java")) {
				FileInputStream fis = new FileInputStream(f);
				String newName = f.getName().replace(".java", ".jad");
				System.out.println(newName);
				File newFile = new File(file2, newName);
				FileOutputStream fos = new FileOutputStream(newFile);
				byte[] bys = new byte[1024];
				int len = 0;
				while ((len = fis.read(bys)) != -1) {
					fos.write(bys, 0, len);
				}
				fos.close();
				fis.close();
			}
//			System.out.println(f);
		}
	}

}
