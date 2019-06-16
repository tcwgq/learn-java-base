package com.tcwgq.demo4;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 
 *
 */
public class FrameDemo {
	public static void main(String[] args) {
		Frame f = new Frame("数据转移");
		// 设置窗体属性和布局
		f.setBounds(400, 200, 400, 300);
		f.setLayout(new FlowLayout());
		Button b = new Button("Transfer");
		// 文本框
		TextField tf = new TextField(50);
		// 文本域
		TextArea ta = new TextArea(50, 50);
		f.add(tf);
		f.add(b);
		f.add(ta);
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 获取文本框数据
				String s = tf.getText().trim();
				// 清空数据
				tf.setText("");
				// 设置给文本域
				// ta.setText(s);
				// 追加和换行
				ta.append(s + "\r\n");
				// 获取光标
				tf.requestFocus();
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
