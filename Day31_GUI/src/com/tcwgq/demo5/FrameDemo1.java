package com.tcwgq.demo5;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo1 {
	public static void main(String[] args) {
		Frame f = new Frame("鼠标移动改变背景颜色案例");
		f.setBounds(400, 200, 400, 300);
		f.setLayout(new FlowLayout());
		Button red = new Button("Red");
		Button green = new Button("Green");
		Button blue = new Button("Blue");
		f.add(red);
		f.add(green);
		f.add(blue);
		red.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				f.setBackground(Color.RED);
			}
		});
		green.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				f.setBackground(Color.GREEN);
			}
		});
		green.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				f.setBackground(Color.WHITE);
			}
		});
		blue.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				f.setBackground(Color.BLUE);
			}
		});
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.setVisible(true);
	}
}
