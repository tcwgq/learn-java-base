package com.tcwgq.demo4;

import java.io.IOException;
import java.io.RandomAccessFile;

import org.junit.Test;

public class RandomAccessFileDemo {
	/**
	 * 不属于IO流，是object类的直接子类。 RandomAccessFileDemo：此类的实例支持对随机访问文件的读取和写入。
	 * 随机访问文件的行为类似存储在文件系统中的一个大型 byte 数组。 存在指向该隐含数组的光标或索引，称为文件指针；
	 * 输入操作从文件指针开始读取字节，并随着对字节的读取而前移此文件指针。 构造方法： public RandomAccessFile(String
	 * name, String mode)： 创建从中读取和向其中写入（可选）的随机访问文件流，该文件具有指定名称。
	 * name为文件名称，mode参数指定用以打开文件的访问模式： "r" 以只读方式打开。调用结果对象的任何 write 方法都将导致抛出
	 * IOException。 "rw" 打开以便读取和写入。如果该文件尚不存在，则尝试创建该文件。 "rws" 打开以便读取和写入，对于
	 * "rw"，还要求对文件的内容或元数据的每个更新都同步写入到底层存储设备。 "rwd" 打开以便读取和写入，对于
	 * "rw"，还要求对文件内容的每个更新都同步写入到底层存储设备。
	 * 
	 * @throws IOException
	 */
	/**
	 * 写文件
	 * 
	 * @throws IOException
	 */
	@Test
	public void fun() throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");
		raf.writeInt(100);
		raf.writeChar('A');
		raf.writeUTF("中国");
		raf.close();
		// 写入文件以后出现乱码，我们读不懂，使用它的读取方法读取，才能读懂。
	}

	/**
	 * 读取文件
	 * 
	 * @throws IOException
	 */
	@Test
	public void fun1() throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");
		int i = raf.readInt();
		System.out.println(i);
		long l = raf.getFilePointer();
		System.out.println("当前指针位置为：" + l);
		char ch = raf.readChar();
		System.out.println(ch);
		l = raf.getFilePointer();
		System.out.println("当前指针位置为：" + l);
		String s = raf.readUTF();
		System.out.println(s);
		l = raf.getFilePointer();
		System.out.println("当前指针位置为：" + l);
		/**
		 * 为什么最后的指针位置为14呢？
		 * 看readUTF()的解释：
		 * 从当前文件指针开始读取前两个字节，类似于使用 readUnsignedShort。
		 * 此值给出已编码字符串中随后的字节数，而不是结果字符串的长度。
		 */
		/**
		 * 不想从头读取文件，通过seek函数设置文件指针。
		 */
		raf.seek(4);
		ch = raf.readChar();
		System.out.println(ch);
		l = raf.getFilePointer();
		System.out.println("当前指针位置为：" + l);
		raf.close();
		//注意读写的顺序要一致。
	}

}
