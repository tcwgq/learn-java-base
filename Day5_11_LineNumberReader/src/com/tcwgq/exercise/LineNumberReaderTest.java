package com.tcwgq.exercise;

import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class LineNumberReaderTest {
	/**
	 * 测试上面写好的类。
	 * @throws IOException 
	 */
	@Test
	public void fun() throws IOException{
		FileReader fr = new FileReader("mlnr.txt");
		MyLineNumberReader mlnr = new MyLineNumberReader(fr);
		System.out.println(mlnr.getLineNumber());
		System.out.println(mlnr.getLineNumber());
		System.out.println(mlnr.getLineNumber());
		String s = null;
		while((s = mlnr.readLine()) != null){
			int num = mlnr.getLineNumber();
			System.out.println(num);
			System.out.println(s);
		}
		mlnr.close();
	}
	
	@Test
	public void fun1() throws IOException{
		FileReader fr = new FileReader("mlnr.txt");
		MyLineNumberReader1 mlnr = new MyLineNumberReader1(fr);
		System.out.println(mlnr.getLineNumber());
		System.out.println(mlnr.getLineNumber());
		System.out.println(mlnr.getLineNumber());
		String s = null;
		while((s = mlnr.readLine()) != null){
			int num = mlnr.getLineNumber();
			System.out.println(num);
			System.out.println(s);
		}
		mlnr.close();
	}

}
