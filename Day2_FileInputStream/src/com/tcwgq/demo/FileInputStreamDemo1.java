package com.tcwgq.demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.junit.Test;

public class FileInputStreamDemo1 {
	/**
	 * 读取文件之前，文件一定要存在，这个不同于写文件，文件不存在会自动创建。s
	 */
	/**
	 * FileInputStream的Read方法： int read():从此输入流中读取一个数据字节。如果没有输入可用，则此方法将阻塞。
	 * 返回下一个数据字节；如果已到达文件末尾，则返回 -1。 int read(byte[] b):从此输入流中将最多 b.length
	 * 个字节的数据读入一个 byte 数组中。 在某些输入可用之前，此方法将阻塞。
	 * 返回读入缓冲区的字节总数，如果因为已经到达文件末尾而没有更多的数据，则返回 -1。 int read(byte[] b, int off, int
	 * len):从此输入流中将最多 len 个字节的数据读入一个 byte 数组中。 如果 len 不为 0，则在输入可用之前，该方法将阻塞；
	 * 否则，不读取任何字节并返回 0。 返回读入缓冲区的字节总数，如果因为已经到达文件末尾而没有更多的数据，则返回 -1。
	 */

	/**
	 * int read():从此输入流中读取一个数据字节。如果没有输入可用，则此方法将阻塞。 返回下一个数据字节；如果已到达文件末尾，则返回 -1。
	 * 
	 * @throws IOException
	 */
	@Test
	public void fun() throws IOException {
		// FileInputStream fis = new FileInputStream("fis1.txt");
		FileInputStream fis = new FileInputStream("fis1.java");
		// 读取到中文时，出现乱码现象
		// int b = fis.read();
		// System.out.print(b);
		// System.out.print((char)b);
		// b = fis.read();
		// System.out.print(b);
		// System.out.print((char)b);
		// b = fis.read();
		// System.out.print(b);
		// System.out.print((char)b);
		// while循环改进版
		// int b = fis.read();
		// while(b != -1){
		// System.out.print((char)b);
		// b = fis.read();
		// }
		// 最终版
		int b = 0;
		while ((b = fis.read()) != -1) {
			System.out.print((char) b);
		}
		fis.close();

	}

	/**
	 * int read(byte[] b):从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中。
	 * 在某些输入可用之前，此方法将阻塞。 返回读入缓冲区的字节总数，如果因为已经到达文件末尾而没有更多的数据，则返回 -1。
	 * 
	 * @throws IOException
	 */
	/**
	 * int read(byte[] b):返回的是实际读取的字节数
	 * 
	 * @throws IOException
	 */
	/**
	 * 注意事项: 1.不能每次读取整个字节数组,应该读取实际的字节数. 2.不能使用println,这样会自动换行,干扰结果,应该使用print.
	 * 
	 * @throws IOException
	 */
	@Test
	public void fun1() throws IOException {
		FileInputStream fis = new FileInputStream("fis1.txt");
		// byte[] bs = new byte[5];
		// //第一次读取
		// int b = fis.read(bs);
		// //System.out.println(b);
		// // System.out.println(new String(bs));
		// //不能每次都读取整个字节数组，修改为：
		// // System.out.println(new String(bs, 0, b));
		// //不能使用自动换行,修改为:
		// System.out.print(new String(bs, 0, b));
		// //第二次读取
		// b = fis.read(bs);
		// //System.out.println(b);
		// // System.out.println(new String(bs));
		// // System.out.println(new String(bs, 0, b));
		// System.out.print(new String(bs, 0, b));
		// //第三次读取
		// b = fis.read(bs);
		// //System.out.println(b);
		// // System.out.println(new String(bs));
		// // System.out.println(new String(bs, 0, b));
		// System.out.print(new String(bs, 0, b));
		// //第四次读取
		// b = fis.read(bs);
		// //System.out.println(b);
		// // System.out.println(new String(bs));
		// // System.out.println(new String(bs, 0, b));
		// System.out.print(new String(bs, 0, b));
		// //第五次读取，已读到文件的末尾
		// b = fis.read(bs);
		// //System.out.println(b);
		// // System.out.println(new String(bs));
		// // System.out.println(new String(bs, 0, b));
		// System.out.print(new String(bs, 0, b));
		// //使用循环改进为：
		// byte[] bys = new byte[5];
		// int len = fis.read(bys);
		// while(len != -1){
		// System.out.print(new String(bys, 0, len));
		// len = fis.read(bys);
		// }
		// 最终版为：
		byte[] bys = new byte[5];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			System.out.print(new String(bys, 0, len));
		}
		fis.close();
	}

	/**
	 * int read(byte[] b, int off, int len):从此输入流中将最多 len 个字节的数据读入一个 byte 数组中。
	 * 如果 len 不为 0，则在输入可用之前，该方法将阻塞； 否则，不读取任何字节并返回 0。
	 * 返回读入缓冲区的字节总数，如果因为已经到达文件末尾而没有更多的数据，则返回 -1。
	 * 
	 * @throws IOException
	 */
	@Test
	public void fun2() throws IOException {
		FileInputStream fis = new FileInputStream("fis1.txt");
		byte[] bys = "hello world!".getBytes();
		int len = fis.read(bys, 0, 3);
		System.out.print(new String(bys, 0, len));
		fis.close();
	}

}
