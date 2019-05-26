package com.tcwgq.demo13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * 上传图片案例
 */
public class UploadClient {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("192.168.1.100", 6666);
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("清纯.jpg"));
		BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
			bos.flush();
		}
		s.shutdownOutput();
		InputStream is = s.getInputStream();
		String ss = new String(new byte[1024], 0, is.read(new byte[1024]));
		System.out.println(ss);
		bos.close();
		bis.close();
		s.close();
	}
}
