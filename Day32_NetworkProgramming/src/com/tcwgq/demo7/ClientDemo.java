package com.tcwgq.demo7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientDemo {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("192.168.1.100", 8888);
		// 键盘录入数据
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 包装通道内的数据流
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		String line = null;
		while ((line = br.readLine()) != null) {
			if ("over".equals(line)) {
				break;
			}
			bw.write(line);
			bw.newLine();// 换行
			bw.flush();// 刷新
		}
		// bw.close();//关闭s就不用再关闭bw了
		// br.close();
		s.close();
	}
}
