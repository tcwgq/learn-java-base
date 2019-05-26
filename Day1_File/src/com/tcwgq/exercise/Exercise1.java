package com.tcwgq.exercise;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class Exercise1 {
	/**
	 * 批量修改文件名称案例
	 * 将d:/data/name目录下的文件重新命名。例如将
	 * 三国演义_001_[评书网-今天很高兴，明天就IO了]_桃园三结义.avi，重新命名为
	 * 三国演义_001_桃园三结义.avi
	 * @throws IOException 
	 */
	/**
	 * 方式一：使用常规方法。
	 * @throws IOException
	 */
	@Test
	public void fun() throws IOException{
		File file = new File("d:/data/name");
		String[] names = file.list();
		for(String s :names){
			//获取文件的后缀名
			int i = s.lastIndexOf('.');
			String endName = s.substring(i);
			System.out.println(endName);
			//获取“三国演义”
			int j = s.indexOf('_');
			System.out.println(j);
			String startName = s.substring(0, j);//包左不包右
			System.out.println(startName);
			//获取章节名
			int k = s.lastIndexOf('_');
			//System.out.println(k);
			String chapterName = s.substring(k, i);//章节名称前面已带“_ "。
			System.out.println(chapterName);
			//System.out.println(j);
			//System.out.println(i);
			//System.out.println(s);
			//获取章节号
			int ii = s.indexOf('_',j+1);//此处从j+1开始，因为j位置就是_。
			System.out.println(ii);
			String chapterNumber = s.substring(j, ii);
			System.out.println(chapterNumber);
			String newName = startName + chapterNumber + chapterName + endName;
			System.out.println(newName);
			File oldfile = new File("d:/data/name/"+s);
			File newfile = new File("d:/data/name/"+newName);
			//f.createNewFile();
		    System.out.println(oldfile.renameTo(newfile));
		}
	}
	
	/**
	 * 方式二：使用replace函数 。
	 */
	@Test
	public void fun1() throws IOException{
		File file = new File("d:/data/name");
		String[] names = file.list();
		for(String s :names){
			System.out.println(s);
			String newName = s.replace("_[评书网-今天很高兴，明天就IO了]_", "_");
			System.out.println(newName);
			File oldFile = new File("d:/data/name/" + s);
			File newFile = new File("d:/data/name/" + newName);
			boolean b = oldFile.renameTo(newFile);
			System.out.println(b);
		}
	}

}
