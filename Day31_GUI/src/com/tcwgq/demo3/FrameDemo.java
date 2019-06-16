package com.tcwgq.demo3;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 需求：把按钮添加到窗体，并对按钮添加一个点击事件。
 */
public class FrameDemo {
	public static void main(String[] args) {
		Frame f = new Frame("添加按钮事件");
		f.setBounds(400, 200, 400, 300);
		f.setLayout(new FlowLayout());
		Button b = new Button("OK");
		// b.setSize(20, 20);// 没有用，得设置布局方式
		f.add(b);
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 里面只有一个方法，不用适配器模式
				System.out.println("HelloWorld");
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
