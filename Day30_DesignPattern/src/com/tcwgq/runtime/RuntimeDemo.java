package com.tcwgq.runtime;

import java.io.IOException;

/**
 * Runtime:每个Java应用程序都有一个Runtime类实例，使应用程序能够与其运行的环境相连接。可以通过getRuntime方法获取当前运行时。
 * public static Runtime getRuntime():返回与当前Java应用程序相关的运行时对象。Runtime类的大多数方法是实例方法，并且必须根据当前的运行时对象对其进行调用。
 * public Process exec(String command)throws IOException:在单独的进程中执行指定的字符串命令。
 */
public class RuntimeDemo {
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		try {
			r.exec("calc");
//			r.exec("notepad");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
