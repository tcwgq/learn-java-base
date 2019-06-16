package com.tcwgq.demo;
/**
 * 内部类：把类定义在其他类的内部，这个类就被称为内部类。
 * 内部类的特点：
 * A:内部类可以直接访问外部类的成员，包括私有。
 * B:外部类要访问内部类的成员，必须创建对象。
 */
public class InnerClassDemo {

}

class Outer {
	private int num = 10;
	class Inner {
		public void show(){
			System.out.println(num);
		}
	}
	public void method(){
		//The method show() is undefined for the type Outer
//		show();
		Inner i = new Inner();
		i.show();
	}
}