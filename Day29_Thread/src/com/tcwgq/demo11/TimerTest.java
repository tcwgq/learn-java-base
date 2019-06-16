package com.tcwgq.demo11;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 在指定时间，删除指定目录。
 */
public class TimerTest {
	public static void main(String[] args) {
		String source = "2015-12-8 10:21:00";
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date = sdf.parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Timer t = new Timer();
		t.schedule(new DeleteFolder(), date);
	}
}

class DeleteFolder extends TimerTask {

	@Override
	public void run() {
		File srcFile = new File("demo");
		deleteFolder(srcFile);
	}

	private void deleteFolder(File file) {
		File[] fileArray = file.listFiles();
		if (fileArray != null) {
			for (File f : fileArray) {
				if (f.isDirectory()) {
					deleteFolder(f);
				} else {
					System.out.println(f.getName());
					f.delete();
				}
			}
			System.out.println(file.getName());
			file.delete();
		}
	}

}