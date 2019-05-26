package com.tcwgq.test;

/**
 * 匿名内部类面试题：按照要求，补齐代码，在控制台输出"HelloWorld"。
 */
public class InnerClassTest1 {
	public static void main(String[] args) {
		Out.method().show();
	}
}

interface Inter {
	void show();
}

class Out {
	public static Inter method() {
		// 此处使用匿名内部类作为返回值
		return new Inter() {
			@Override
			public void show() {
				System.out.println("HelloWorld");
			}
		};
	}

}
