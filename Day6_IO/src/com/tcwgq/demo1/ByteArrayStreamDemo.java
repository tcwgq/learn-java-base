package com.tcwgq.demo1;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.junit.Test;

public class ByteArrayStreamDemo {
	/**
	 * 内存操作流，用于处理临时数据信息，程序结束，数据从内存中消失。
	 * 字节数组：
	 * ByteArrayInputStream:
	 * ByteArrayOutputStream:
	 * 字符数组：
	 * CharArrayReader:
	 * CharArrayWriter:
	 * 字符串：
	 * StringReader:
	 * StringWriter:  
	 */
	/**
	 * 往内存中写数据
	 * @throws IOException 
	 */
	@Test
	public void fun() throws IOException{
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		String s = "Hello, world!";
		baos.write(s.getBytes());
		/**
		 * 关闭 ByteArrayOutputStream 无效。此类中的方法在关闭此流后仍可被调用，而不会产生任何 IOException。 
		 */
		baos.close();//关闭此流没有什么实际意义
		byte[] bys = baos.toByteArray();//获取到内存中的字节数组
		
		//读数据
		ByteArrayInputStream bais = new ByteArrayInputStream(bys);
		int by = bais.read();
		while((by = bais.read()) != -1){
			System.out.print((char)by);
		}
		bais.close();//关闭此流没有什么实际意义
	}

}
