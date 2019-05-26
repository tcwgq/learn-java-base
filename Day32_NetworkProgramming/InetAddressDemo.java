package com.tcwgq.demo;

import java.net.InetAddress;

/**
 * InetAddress:此类表示互联网协议 (IP)地址。
 * public static InetAddress getByName(String host) throws UnknownHostException:
 * 在给定主机名的情况下确定主机的IP地址。 主机名可以是机器名（如 "java.sun.com"），也可以是其IP地址的文本表示形式。
 * public String getHostAddress()：返回 IP 地址字符串（以文本表现形式）。 
 * public String getHostName()：获取此IP地址的主机名。
 */
public class InetAddressDemo {
	public static void main(String[] args) throws Exception {
		InetAddress ia = InetAddress.getByName("lenovo-PC");
		System.out.println(ia.getHostAddress());
		System.out.println(ia.getHostName());
		InetAddress address = InetAddress.getByName("192.168.1.100");
		System.out.println(address.getHostAddress());
		System.out.println(address.getHostName());
	}
}
