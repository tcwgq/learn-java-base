package com.tcwgq.demo6;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("192.168.1.100", 8888);
		OutputStream os = s.getOutputStream();
		String ss = "HelloWorld";
		os.write(ss.getBytes());
		// 获取反馈信息
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		String str = new String(bys, 0, len);
		System.out.println(str);
		s.close();
	}
}
