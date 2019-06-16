package com.tcwgq.demo;

/**
 * 接口：接口，interface，在软件工程中，接口泛指供别人调用的方法或者函数。 
 * 从这里，我们可以体会到Java语言设计者的初衷，它是对行为的抽象。
 * 接口的特点： 
 * A:接口用关键字interface表示 
 * B:类通过关键字implements实现接口 
 * C:接口不能实例化，但接口可以通过多态方式，有具体实现类实例化。即接口多态
 * D:接口的子类
 * 		a:可以是抽象类。这样意义不大
 * 		b:可以是普通类，要求实现接口中的所有抽象方法。（常用）
 * 
 * 多态的常见情况：
 * 		1.具体类多态（很少见）
 * 		2.抽象类多态（常见）
 * 		3.接口多态（最常见）
 */
public class InterfaceDemo {
	public static void main(String[] args) {
//		Action a = new Action();// Cannot instantiate the type Action
	}
}

interface Action {
	public abstract void jump();

	public abstract void swim();
}

class Dog implements Action {

	@Override
	public void jump() {
		System.out.println("狗边摇尾巴边跳");
	}

	@Override
	public void swim() {
		System.out.println("狗游得很快");
	}

}
