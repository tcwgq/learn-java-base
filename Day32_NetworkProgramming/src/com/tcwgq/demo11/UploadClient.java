package com.tcwgq.demo11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

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
		br.close();
		s.close();
	}
}
