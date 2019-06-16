package com.tcwgq.demo6;

/**
 * 方法重写注意的事项 
 * A:父类中私有的方法不能被子类重写，因为父类私有的方法根本不会被子类继承
 * B:子类重写的方法的权限不能比父类中的方法权限低，权限必须>=父类的权限，一般保持一致即可 
 * C:父类中的静态方法，子类必须通过静态方式重写(其实这个算不上的方法的重写，但现象如此)
 */
public class InheritanceDemo2 {
	public static void main(String[] args) {
		Son1 s = new Son1();
		s.method();
		s.function();
	}
}

class Father1 {
	public Father1() {
		System.out.println("Father无参构造方法");
	}

	// private void show() {
	// System.out.println("Father show");
	// }
	public void method() {
		System.out.println("Father method");
	}

	void function() {
		System.out.println("Father function");
	}

	public static void fun() {
		System.out.println("Father fun");
	}

	public void fun1() {
		System.out.println("Father fun1");
	}
}

class Son1 extends Father1 {
	public Son1() {
		System.out.println("Son无参构造方法");
	}

	// private void show() {
	// System.out.println("Son show");
	// }
	// private void method() {
	// /*
	// * 子类中重写的方法的权限比父类低，不行 Cannot reduce the visibility of the inherited
	// * method from Father1
	// */
	// System.out.println("Son method");
	// }

	public void function() {
		System.out.println("Son function");
	}

	public static void fun() {
		// This instance method cannot override the static method from Father1
		System.out.println("Son fun");
	}

	public void fun1() {
		// This static method cannot hide the instance method from Father1
		System.out.println("Son fun1");
	}
}