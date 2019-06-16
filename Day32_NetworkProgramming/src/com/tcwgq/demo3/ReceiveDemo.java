package com.tcwgq.demo3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 
 */
public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket(6666);
		while (ds.isConnected()) {
			DatagramPacket dp = new DatagramPacket(new byte[1024], 1024);
			ds.receive(dp);
			String ip = dp.getAddress().getHostAddress();
			String s = new String(dp.getData(), 0, dp.getLength());
			System.out.println(ip);
			System.out.println(s);
		}
		ds.close();
	}
}
