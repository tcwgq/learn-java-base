package com.tcwgq.demo6;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 你输入的如果是非数字字符，就取消你键盘录入的效果。 
 * public Label(String text) throws
 * HeadlessException:使用指定的文本字符串构造一个新的标签，其文本对齐方式为左对齐。
 */
public class FrameDemo {
	public static void main(String[] args) {
		Frame f = new Frame("");
		f.setBounds(400, 200, 400, 300);
		f.setLayout(new FlowLayout());
		Label l = new Label("请输入你的QQ号码，不能是非数字，不信你试试");
		TextField tf = new TextField(40);
		f.add(l);
		f.add(tf);
		tf.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// public char getKeyChar():返回与此事件中的键关联的字符。
				if (!Character.isDigit(e.getKeyChar())) {
					// public void consume():使用此事件，以便不会按照默认的方式由产生此事件的源代码来处理此事件。
					e.consume();
				}
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
