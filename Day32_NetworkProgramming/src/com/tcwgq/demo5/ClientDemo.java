package com.tcwgq.demo5;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * public Socket(InetAddress address, int port) throws
 * IOException：创建一个流套接字并将其连接到指定IP地址的指定端口号。
 * 
 * public Socket(String host,int port) 
 * throws UnknownHostException,IOException:创建一个流套接字并将其连接到指定主机上的指定端口号。
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("192.168.1.100", 8888);
		OutputStream os = s.getOutputStream();
		String ss = "HelloWorld";
		os.write(ss.getBytes());
		s.close();
		//java.net.ConnectException: Connection refused: connect
	}
}
