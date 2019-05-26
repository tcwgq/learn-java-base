package com.tcwgq.demo;

/**
 * 接口的成员特点： 
 * 成员变量： 只能是由final修饰的常量，且为static，默认修饰符public static final，建议显示给出 
 * 构造方法： 没有构造方法 
 * 成员方法： 只能是抽象方法，默认修饰符public abstract，建议显示给出
 */
public class InterfaceDemo1 {
	public static void main(String[] args) {
		Inter i = new InterImpl();
		System.out.println(i.a);// The static field Inter.a should be accessed
								// in a static way
		System.out.println(i.b);// The static field Inter.a should be accessed
								// in a static way
		System.out.println("-------------");
		// i.a = 100;// The final field Inter.a cannot be assigned
		// i.b = 200;// The final field Inter.a cannot be assigned
		// System.out.println(i.a);
		// System.out.println(i.b);
		System.out.println(Inter.a);
		System.out.println(Inter.b);
	}
}

interface Inter {
	int a = 10;
	final int b = 20;
	// public Inter(){//Interfaces cannot have constructors
	// System.out.println("Inter()");
	// }
	// public void show(){//Abstract methods do not specify a body
	// //接口中的方法不能带有主体
	// }

	public void show();

	abstract void method();

	void function();

	public abstract void fun();
}

/*
 * class InterImpl implements Inter { public InterImpl() { super();//
 * 既然接口没有构造方法，那么这个super调用的是什么？是Object的构造方法 } }
 */

class InterImpl extends Object implements Inter {
	public InterImpl() {
		super();// 既然接口没有构造方法，那么这个super调用的是什么？是Object的构造方法
	}

	@Override
	public void show() {

	}

	@Override
	public void method() {

	}

	@Override
	public void function() {
		// Cannot reduce the visibility of the inherited
		// method
		// from Inter

	}

	@Override
	public void fun() {

	}
}