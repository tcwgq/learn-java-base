package com.tcwgq.demo;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

public class StringDemo {
	/**
	 * String类的编码与解码
	 * @throws IOException 
	 */
	
	/**编码：
	 * byte[] getBytes(String charsetName) 
     * 使用指定的字符集将此 String编码为 byte序列，并将结果存储到一个新的 byte 数组中。
     * 解码：
     * String(byte[] bytes, String charsetName) 
     * 通过使用指定的 charset解码指定的 byte数组，构造一个新的 String。 
	 * @throws IOException
	 */
	/**
	 * 用哪个编码表编码，就用哪个编码表解码，这样才能保证不乱码。
	 * @throws IOException
	 */
	@Test
	public void fun() throws IOException{
		String s = "我爱你中国！";
		byte[] bys = s.getBytes("UTF-8");
		System.out.println(Arrays.toString(bys));
		String ss = new String(bys, "UTF-8");
		System.out.println(ss);
	}

}
