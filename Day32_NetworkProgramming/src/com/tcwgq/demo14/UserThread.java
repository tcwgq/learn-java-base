package com.tcwgq.demo14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class UserThread implements Runnable {
	private Socket s;

	public UserThread() {
		super();
	}

	public UserThread(Socket s) {
		this.s = s;
	}

	@Override
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String name = UUIDUtil.getUUID();
			BufferedWriter bw = new BufferedWriter(new FileWriter(name + ".java"));
			String line = null;
			while ((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
				bw.flush();
			}
			BufferedWriter BW = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			BW.write("数据上传成功");
			BW.newLine();
			BW.flush();
			bw.close();
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
