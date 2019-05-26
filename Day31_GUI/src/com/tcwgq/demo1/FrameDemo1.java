package com.tcwgq.demo1;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo1 {
	public static void main(String[] args) {
		Frame f = new Frame("适配器改进");
		f.setBounds(400, 200, 400, 300);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.setVisible(true);
	}
}
