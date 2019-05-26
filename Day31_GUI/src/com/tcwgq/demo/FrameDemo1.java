package com.tcwgq.demo;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;

public class FrameDemo1 {
	public static void main(String[] args) {
		Frame f = new Frame("HelloWorld");
//		f.setVisible(true);
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		//public Point(int x,int y):在坐标空间中指定的(x,y)位置构造并初始化一个点。
//		Point p = new Point(400, 200);
//		f.setLocation(p);
//		f.setLocation(400, 200);
		//public Dimension(int width,int height)构造一个Dimension，并将其初始化为指定宽度和高度。
//		Dimension d = new ?Dimension(400, 300);
//		f.setSize(d);
//		f.setSize(400, 300);
		f.setBounds(400, 200, 400, 300);
		f.setVisible(true);
		
	}
}
