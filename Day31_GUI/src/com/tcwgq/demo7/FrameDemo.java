package com.tcwgq.demo7;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {
	public static void main(String[] args) {
		Frame f = new Frame("一级菜单");
		f.setBounds(400, 200, 400, 300);
		f.setLayout(new FlowLayout());
		MenuBar mb = new MenuBar();
		Menu m = new Menu("File");
		MenuItem mi = new MenuItem("Exit");
		m.add(mi);
		mb.add(m);
		// f.add(mb);
		f.setMenuBar(mb);
		mi.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
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
