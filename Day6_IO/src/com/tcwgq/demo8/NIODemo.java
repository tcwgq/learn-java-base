package com.tcwgq.demo8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.junit.Test;

public class NIODemo {
	/**
	 * JDK4出现NIO。
	 * 新IO和传统的IO有相同的目的，都是用于进行输入输出的，
	 * 但新IO使用了不同的方式来处理输入输出，采用内存映射文件的方式，
	 * 将文件或者文件的一段区域映射到内存中，就可以像访问内存一样的来访问文件了，
	 * 这种方式效率比旧IO要高很多，但是目前好多地方我们看到的还是旧IO的引用，
	 * 所以我们仍以旧IO为主，知道NIO即可。
	 */
	/**
	 * JDK7之后的NIO：
	 * Path：路径
	 * Paths：
	 * static Path get(URI uri)：提供了静态方法用于返回路径。
	 * Files：用于操作文件，目录的工具类。
	 * static long copy(Path source, OutputStream out)：从source路径拷贝一个文件到out。
	 * static Path write(Path path, Iterable<? extends CharSequence> lines, Charset cs, OpenOption... options)：Write lines of text to a file. 
	 * 最后一个参数可以省略。
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	@Test
	public void fun() throws FileNotFoundException, IOException{
		//static long copy(Path source, OutputStream out)：从source路径拷贝一个文件到out。
		Files.copy(Paths.get("PropertiesDemo.java"), new FileOutputStream("copy.txt"));
	}
	
	@Test
	public void fun1() throws FileNotFoundException, IOException{
		//static Path write(Path path, Iterable<? extends CharSequence> lines, Charset cs, OpenOption... options)：Write lines of text to a file. 
		ArrayList<String> al = new ArrayList<String>();
		al.add("Hello");
		al.add("world");
		al.add("java");
		Files.write(Paths.get("array.txt"), al, Charset.forName("UTF-8"));
	}

}
