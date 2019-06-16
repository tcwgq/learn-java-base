package com.tcwgq.demo5;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {
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
		red.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.setBackground(Color.red);
			}
		});
		green.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.setBackground(Color.green);
			}

		});
		blue.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.setBackground(Color.blue);
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
