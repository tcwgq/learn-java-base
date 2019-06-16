package com.tcwgq.demo12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;


/**
 * 按照我们正常的思路加入反馈信息，结果却没反应。为什么呢?
 * 读取文本文件是可以以null作为结束信息的，但是呢，通道内是不能这样结束信息的。
 * 所以，服务器根本就不知道你结束了。而你还想服务器给你反馈。所以，就相互等待了。
 * 
 * 如何解决呢?
 * A:在多写一条数据，告诉服务器，读取到这条数据说明我就结束，你也结束吧。
 * 		这样做可以解决问题，但是不好。
 * B:Socket对象提供了一种解决方案
 * 		public void shutdownOutput()
 */
public class UploadClient {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("192.168.1.100", 6666);
		BufferedReader br = new BufferedReader(new FileReader("InetAddressDemo.java"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		String line = null;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
//		bw.write("over");
//		bw.newLine();
//		bw.flush();
		//Socket提供了一个终止，它会通知服务器你别等了，我没有数据过来了
		s.shutdownOutput();
		BufferedReader BR = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String S = BR.readLine();
		System.out.println(S);
		br.close();
		s.close();
	}
}
