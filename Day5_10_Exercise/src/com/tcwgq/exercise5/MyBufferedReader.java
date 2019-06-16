package com.tcwgq.exercise5;

import java.io.IOException;
import java.io.Reader;

public class MyBufferedReader {
	/**
	 * 用Reader模拟BufferedReader的readLine()功能
	 */
	/**
	 * readLine():一次读取一行，根据换行符判断是否结束，只返回字符串，不反悔换行符。
	 */
	private Reader in;

	public MyBufferedReader(Reader in) {
		this.in = in;
	}

	/*
	 * 根据底层对象，封装之后实现BufferedReader的功能。 Reader只有read()和read(char[]
	 * cbuf)两个读取方法，所以有两种方式实现。 \r是回车符 \n是换行符
	 */
	public String readLine() throws IOException {
		StringBuilder sb = new StringBuilder();
		String s = null;
		int ch = 0;
		// while ((ch = this.in.read()) != -1) {
		// if(ch == '\r')
		// continue;
		// if (ch == '\n') {
		// s = new String(sb);
		// } else {
		// sb.append((char)ch);
		// }
		// }
		/**
		 * 为什么上面这种形式实现不了换行，因为遇到\n之后循环仍然继续，这不是一次读取一行了。
		 */
		while ((ch = this.in.read()) != -1) {
			if (ch == '\r')
				continue;
			if (ch == '\n') {
				s= new String(sb);
			 break;//此处必须加上break，否则循环一直继续
			} else {
				sb.append((char) ch);
			}
		}
		/*
		 * 为了防止数据丢失，需要判断sb的长度 这是为了防止 I\r\n Love\r\n Java-1
		 * 这种情况，Java后面没有\r\n而直接是文件末尾
		 */
		if (sb.length() > 0)
			s= new String(sb);
		return s;
	}

	// close()方法
	public void close() throws IOException {
		this.in.close();
	}
}
