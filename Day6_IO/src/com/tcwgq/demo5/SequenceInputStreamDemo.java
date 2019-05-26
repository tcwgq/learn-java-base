package com.tcwgq.demo5;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

import org.junit.Test;

public class SequenceInputStreamDemo {
	/**
	 * SequenceInputStream表示其他输入流的逻辑串联。
	 * 它从输入流的有序集合开始，并从第一个输入流开始读取，
	 * 直到到达文件末尾，接着从第二个输入流读取，依次类推，
	 * 直到到达包含的最后一个输入流的文件末尾为止。 
	 * 构造方法：
	 * public SequenceInputStream(InputStream s1, InputStream s2)：
	 * 通过记住这两个参数来初始化新创建的 SequenceInputStream
	 * （将按顺序读取这两个参数，先读取 s1，然后读取 s2），以提供从此 SequenceInputStream 读取的字节。
	 * 此构造方法适用于合并两个文件的情况。
	 * @throws IOException 
	 */
	@Test
	public void fun() throws IOException{
		InputStream fis1 = new FileInputStream("s1.txt");
		InputStream fis2 = new FileInputStream("s2.txt");
		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("all.txt"));
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = sis.read(bys)) != -1){
			bos.write(bys, 0, len);
		}
		bos.close();
		sis.close();
		fis2.close();
	}

}
