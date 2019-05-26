package com.tcwgq.demo4;

/**
 * 继承中构造方法之间的关系 
 * A:子类中所有的构造方法默认都会访问父类无参构造方法
 * B:为什么呢？
 * 		因为子类继承了父类的数据，子类可能使用父类的数据
 * 		在子类创建对象前必须完成父类数据的初始化，所以会调用父类的无参构造方法
 * 其实子类无参构造方法的第一条语句为：super()
 * 
 */
public class InheritanceDemo {
	public static void main(String[] args) {
		Son s = new Son();
		System.out.println(s);
		System.out.println("----------");
		Son s1 = new Son("aaa");
		System.out.println(s1);
	}
}

class Father {
	public Father() {
		System.out.println("Father无参构造方法");
	}

	public Father(String name) {
		System.out.println("Father带参构造方法");
	}
}

class Son extends Father {
	public Son() {
//		super();
		System.out.println("Son无参构造方法");
	}

	public Son(String name) {
//		super();
		System.out.println("Son带参构造方法");
	}
}