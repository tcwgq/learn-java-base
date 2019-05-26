package com.tcwgq.demo1;

/**
 * 看程序写结果:先判断有没有问题，如果没有，写出结果 
 * 我的结果：我爱你 
 * 正确结果: 爱你
 * 分析：B看似没有show方法，实际上是有的，它继承了A的show方法！
 */
class A {
	public void show() {
		show2();
	}

	public void show2() {
		System.out.println("我");
	}
}

class B extends A {
	/*
	public void show() {
		show2();
	}
	*/
	public void show2() {
		System.out.println("爱");
	}
}

class C extends B {
	public void show() {
		super.show();
	}

	public void show2() {
		System.out.println("你");
	}
}

public class PolymorphismTest3 {
	public static void main(String[] args) {
		A a = new B();
		a.show();//爱

		B b = new C();
		b.show();//你
	}
}
