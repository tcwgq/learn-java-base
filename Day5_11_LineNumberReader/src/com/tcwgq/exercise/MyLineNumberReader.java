package com.tcwgq.exercise;

import java.io.IOException;
import java.io.Reader;

public class MyLineNumberReader {
	/**
	 * 自定义类模拟LineNumberReader的特有功能
	 * 获取每次读取数据的行号
	 */
	private Reader in;
	private int count = 0;
	public MyLineNumberReader(Reader in) {
		this.in = in;
	}
	
	public int getLineNumber(){
		return this.count;
	}
	
	public void setLineNumber(int lineNumber){
		this.count = lineNumber;
	}
	/*
	 * 根据底层对象，封装之后实现BufferedReader的功能。 Reader只有read()和read(char[]
	 * cbuf)两个读取方法，所以有两种方式实现。 \r是回车符 \n是换行符
	 */
	public String readLine() throws IOException {
		//实际上count无论是在while循环内还是while循环外，都只++一次，因此，只需把count放在readLine的开头即可。
		count++;
		StringBuilder sb = new StringBuilder();
		int ch = 0;
		while ((ch = this.in.read()) != -1) {
			if(ch == '\r')
				continue;
			if (ch == '\n') {
//				count ++;
				return new String(sb);
			} else {
				sb.append((char)ch);
			}
		}
		/*
		 * 为了防止数据丢失，需要判断sb的长度
		 * 这是为了防止
		 * I\r\n
		 * Love\r\n
		 * Java-1
		 * 这种情况，Java后面没有\r\n而直接是文件末尾
		 */
		if(sb.length() > 0){
//			count ++ ;
			return sb.toString();
		}
		//注意，上面的if代码放在while循环外，是处理读取到文件末尾的情况
		return null;
	}

	// close()方法
	public void close() throws IOException {
		this.in.close();
	}

}
