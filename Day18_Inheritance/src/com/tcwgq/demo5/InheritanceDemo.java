package com.tcwgq.demo5;

/**
 * 如果父类没有无参构造方法，子类创建对象时会出现什么情况？报错
 * 如何解决呢？
 * A:给定父类的无参构造方法
 * B:通过super显式调用父类存在的构造方法
 * 注意：
 * this(...)或super(...)必须出现在子类构造方法中的第一条语句，否则意味着先调用父类的
 * 无参构造方法，再调用父类的带参构造方法，对父类数据进行了多次初始化
 */
public class InheritanceDemo {
	public static void main(String[] args) {
		new Son();
		System.out.println("--------------");
		new Son("aaa");
	}
}

class Father {
	/*
	public Father() {
		System.out.println("Father无参构造方法");
	}
	*/
	public Father(String name) {
		System.out.println("Father带参构造方法");
	}
}

class Son extends Father {
	public Son() {
		super("aaa");
		System.out.println("Son无参构造方法");
//		super("aaa");//Constructor call must be the first statement in a constructor
	}

	public Son(String name) {
		super("aaa");
		System.out.println("Son带参构造方法");
	}
}