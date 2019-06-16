package com.tcwgq.demo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = null;
		while ((s = br.readLine()) != null) {
			if (s.equals("886")) {
				break;
			}
			DatagramPacket dp = new DatagramPacket(s.getBytes(), s.length(), InetAddress.getByName("lenovo-PC"), 6666);
			// DatagramPacket dp = new DatagramPacket(bys, bys.length,
			// InetAddress.getByName("192.168.1.255"), 12345);//广播地址
			ds.send(dp);
		}
		ds.close();
	}
}
