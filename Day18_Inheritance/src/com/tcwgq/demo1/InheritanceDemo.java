package com.tcwgq.demo1;

/**
 * 继承注意事项： 子类只能继承父类所有非私有的成员(成员方法和成员变量) 其实这也体现了继承的另一个弊端：打破了封装性
 * 子类不能继承父类的构造方法，但是可以通过super(后面讲)关键字去访问父类构造方法。 不要为了部分功能而去继承
 * 
 * 我们到底在什么时候使用继承呢? 继承中类之间体现的是：”is a”的关系。
 */
public class InheritanceDemo {
	public static void main(String[] args) {
		Son s = new Son();
		// System.out.println(s.a);// 子类不能继承父类的私有成员变量
		System.out.println(s.b);
		System.out.println(s.c);
		// s.show();// 子类不能继承父类的私有成员方法
		s.method();
	}
}

class Father {
	private int a = 10;
	public int b = 20;
	int c = 30;

	private void show() {
		System.out.println("father private show");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public void method() {
		System.out.println("father public method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

class Son extends Father {
	public void function() {
		System.out.println("son public function");
		// System.out.println(a);// 子类不能继承父类的私有成员变量
		System.out.println(b);
		System.out.println(c);
	}
}