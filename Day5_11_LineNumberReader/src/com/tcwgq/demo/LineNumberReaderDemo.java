package com.tcwgq.demo;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

import org.junit.Test;

public class LineNumberReaderDemo {
	/**
	 * LineNumberReader是BufferedReader的子类，它有一个特殊方法：
	 * public int getLineNumber():获得当前行号。
	 * public void setLineNumber(int lineNumber)：设置当前行号。 
	 * @throws IOException 
	 */
	@Test
	public void fun() throws IOException{
		LineNumberReader lnr = new LineNumberReader(new FileReader("lnr.txt"));
		String s = null;
		lnr.setLineNumber(-10);
		while((s = lnr.readLine()) != null){
			int num = lnr.getLineNumber();
			System.out.println(num);
			System.out.println(s);
		}
		lnr.close();
	}

}
