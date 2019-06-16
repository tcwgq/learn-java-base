package com.tcwgq.demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class FileOutputStreamDemo4 {
	/**
	 * 加入异常处理的FileOutputStream
	 * 
	 * @throws IOException
	 * catch异常时，子异常要放在父异常的前面。
	 */
	@Test
	public void fun() {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("f:/data/fos4.txt");
			// 系统不存在f盘，出现异常，同时fos没有申请空间成功，仍为null，finally中
			// 出现空指针异常
			// fos = new FileOutputStream("fos4.txt");
			fos.write("Hello world!".getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				// 到底是try放在if里面还是if放在try里面？使用try放在if里面比较好，
				// 只有fos不为空时，才尝试关闭流
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
