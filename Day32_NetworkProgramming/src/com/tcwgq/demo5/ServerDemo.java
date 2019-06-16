package com.tcwgq.demo5;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * public ServerSocket(int port) throws IOException:
 * 创建绑定到特定端口的服务器套接字。端口0在所有空闲端口上创建套接字。 
 * public Socket accept() throws IOException:
 * 侦听并接受到此套接字的连接。此方法在连接传入之前一直阻塞。
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
		s.close();
		ss.close();
	}
}
