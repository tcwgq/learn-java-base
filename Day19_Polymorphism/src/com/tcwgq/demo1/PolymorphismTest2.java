package com.tcwgq.demo1;

/**
 * 看程序写结果:先判断有没有问题，如果没有，写出结果
 * 我的结果： 
 * 正确结果：
 */
class Fu {
	public void show() {
		System.out.println("fu show");
	}
}

class Zi extends Fu {
	public void show() {
		System.out.println("zi show");
	}

	public void method() {
		System.out.println("zi method");
	}
}

public class PolymorphismTest2 {
	public static void main(String[] args) {
		Fu f = new Zi();
//		f.method();//找不到这个方法，父类中没有定义这个方法
		f.show();
	}
}
