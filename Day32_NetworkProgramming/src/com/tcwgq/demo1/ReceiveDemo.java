package com.tcwgq.demo1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket(3456);
		DatagramPacket dp = new DatagramPacket(new byte[1024], 1024);
		ds.receive(dp);
		byte[] bys = dp.getData();
		int length = dp.getLength();
		InetAddress ia = dp.getAddress();
		String ip = ia.getHostAddress();
		String s = new String(bys, 0, length);
		System.out.println(ip);
		System.out.println(s);
		ds.close();
	}
}
