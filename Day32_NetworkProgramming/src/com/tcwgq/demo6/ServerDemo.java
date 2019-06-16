package com.tcwgq.demo6;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器给客户端反馈
 */

public class ServerDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8888);
		Socket s = ss.accept();
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		String str = new String(bys, 0, len);
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip);
		System.out.println(str);
		// 回发反馈信息
		OutputStream os = s.getOutputStream();
		os.write("数据已收到".getBytes());
		s.close();
		ss.close();
	}
}
