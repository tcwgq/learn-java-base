package com.tcwgq.demo1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket();
		String s = "HelloWorld";
		byte[] bys = s.getBytes();
		InetAddress ia = InetAddress.getByName("lenovo-PC");
		DatagramPacket dp = new DatagramPacket(bys, bys.length, ia, 3456);
		ds.send(dp);
		ds.close();
	}
}
