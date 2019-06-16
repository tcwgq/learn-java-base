package com.tcwgq.demo6;

/**
 * 继承中成员方法之间的关系 
 * A:子类中的方法声明与父类中的方法声明不同 ，这个比较简单
 * B:子类中的方法声明与父类中的方法声明相同
 * 		先从子类的成员方法中找，找到就调用
 * 		如果子类没有，就去父类的成员方法中找，如果有就调用，没有就报错
 * 总结：还是按照就近原则
 */
public class InheritanceDemo {
	public static void main(String[] args) {
		Son s = new Son();
		s.show();// 父类中的方法
		s.method();// 子类中的方法
//		s.function();//错误，子父类中都没有这个方法
	}
}

class Father {
	public Father() {

	}

	public void show() {
		System.out.println("Father show");
	}
}

class Son extends Father {
	public Son() {

	}

	public void show() {
		System.out.println("Son show");
	}

	public void method() {
		System.out.println("Son method");
	}
}