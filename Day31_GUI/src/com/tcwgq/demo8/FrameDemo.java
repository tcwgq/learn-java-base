package com.tcwgq.demo8;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class FrameDemo {
	public static void main(String[] args) {
		Frame f = new Frame("多级菜单");
		String name = f.getTitle();
		f.setBounds(400, 200, 400, 300);
		f.setLayout(new FlowLayout());
		MenuBar mb = new MenuBar();
		Menu m = new Menu("File");
		Menu m1 = new Menu("Change Name");
		MenuItem mi = new MenuItem("Open notepad");
		MenuItem mi1 = new MenuItem("Quit");
		MenuItem mi2 = new MenuItem("Good good study");
		MenuItem mi3 = new MenuItem("Day day up");
		MenuItem mi4 = new MenuItem("Restore title");
		m.add(m1);
		m.add(mi);
		m.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		m1.add(mi4);
		mb.add(m);
		f.setMenuBar(mb);
		mi.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Runtime r = Runtime.getRuntime();
				try {
					r.exec("notepad");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		mi1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mi2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f.setTitle(mi2.getLabel());
			}
		});
		mi3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f.setTitle(mi3.getLabel());
			}
		});
		mi4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f.setTitle(name);
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
