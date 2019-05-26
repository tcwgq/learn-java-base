package com.tcwgq.demo5;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

import org.junit.Test;

public class SequenceInputStreamDemo1 {
	/**
	 * public SequenceInputStream(Enumeration<? extends InputStream> e):
	 * 通过记住参数来初始化新创建的 SequenceInputStream，
	 * 该参数必须是生成运行时类型为 InputStream 对象的 Enumeration 型参数。
	 * 将按顺序读取由该枚举生成的输入流，以提供从此 SequenceInputStream 读取的字节。
	 * 在用尽枚举中的每个输入流之后，将通过调用该流的 close 方法将其关闭。
	 * 此构造方法适用于3个及以上的文件合并。
	 * @throws IOException 
	 */
	@Test
	public void fun() throws IOException{
		/**
		 * Enumeration<E>是Vector的方法。
		 */
		Vector<InputStream> v = new Vector<InputStream>();
		InputStream is1 = new FileInputStream("is1.txt");
		InputStream is2 = new FileInputStream("is2.txt");
		InputStream is3 = new FileInputStream("is3.txt");
		v.add(is1);
		v.add(is2);
		v.add(is3);
		Enumeration<InputStream> e = v.elements();
		SequenceInputStream sis = new SequenceInputStream(e);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("together.txt"));
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = sis.read(bys)) != -1){
			bos.write(bys, 0, len);
		}
		bos.close();
		sis.close();
	}

}
