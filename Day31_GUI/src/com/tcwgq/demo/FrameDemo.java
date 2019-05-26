package com.tcwgq.demo;

import java.awt.Frame;

/**
 * public Frame() throws HeadlessException:构造一个最初不可见的Frame新实例。Frame的标题为空。
 * public Frame(String title) throws HeadlessException:构造一个新的、最初不可见的、具有指定标题的Frame对象。
 *
 */
public class FrameDemo {
	public static void main(String[] args) {
//		Frame f = new Frame();
		Frame f = new Frame("AAA");
		// 设置标题
//		f.setTitle("HelloWorld");
		// 设置大小
		f.setSize(400, 300);
		// 设置位置
		f.setLocation(400, 200);
		// 方法过时
		// f.show();
		f.setVisible(true);
	}
}
