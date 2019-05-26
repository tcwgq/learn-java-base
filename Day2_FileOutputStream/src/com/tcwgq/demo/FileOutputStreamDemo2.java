package com.tcwgq.demo;

import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class FileOutputStreamDemo2 {
	/**
	 *实现文件写入换行
	 * @throws IOException 
	 * 为什么使用myeclipse自带的文本编辑器或者notepad++显示换行而Windows自带的记事本
	 * 没有换行呢，这是因为不同的系统对换行符有不同的要求。
	 * Windows：\r\n
	 * linux：\n
	 * mac:\r
	 */
	@Test
	public void fun() throws IOException{
		FileOutputStream fos = new FileOutputStream("fos2.txt");
		for(int i = 0;i < 10; i++){
			fos.write(("Hello"+i).getBytes());
//			fos.write("\n".getBytes());//windows自带的记事本没有换行
			fos.write("\r\n".getBytes());
		}
		fos.close();
	}

}
