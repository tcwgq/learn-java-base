package com.tcwgq.exercise3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class CopyFolderDemo2 {
	/**
	 * 复制多极文件夹 需求： 将 d:/data中的所有文件及文件夹复制到d:/end/data。
	 * 
	 * @throws IOException
	 */
	@Test
	public void fun() throws IOException {
		File file1 = new File("d:/data/aaa");
		File file2 = new File("d:/end");
		copyFolder(file1, file2);
	}

	public void copyFolder(File f1, File f2) throws IOException {
		if (f1.isFile()) {
			File newFile = new File(f2, f1.getName());
			copyFile(f1, newFile);
		} else {
			File newFolder = new File(f2, f1.getName());
			newFolder.mkdir();
			File[] files = f1.listFiles();
			for(File f: files){
				copyFolder(f, newFolder);
			}
		}

	}

	private void copyFile(File f1, File f2) throws IOException {
		FileInputStream fis = new FileInputStream(f1);
		FileOutputStream fos = new FileOutputStream(f2);
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);
		}
		fos.close();
		fis.close();
	}

}
