package com.tcwgq.exercise5;

import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class MyBufferedReaderTest {
	/**
	 *  测试上面写好的类
	 * @throws IOException 
	 */
	@Test
	public void fun() throws IOException{
		FileReader fr = new FileReader("test.txt");
		MyBufferedReader mbr = new MyBufferedReader(fr);
		String s = null;
		while((s = mbr.readLine()) != null){
			System.out.println(s);
		}
		mbr.close();
		//观察一下\r和\n。
		System.out.println('\r'+0);
		System.out.println('\n'+0);
	}

}
