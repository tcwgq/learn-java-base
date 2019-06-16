package com.tcwgq.demo8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
 * 客户端键盘录入，服务器输出文本文件
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("192.168.1.100", 6666);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		String line = null;
		while ((line = br.readLine()) != null) {
			if (line.equals("over")) {
				break;
			}
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		// bw.close();
		// br.close();
		s.close();
	}
}
