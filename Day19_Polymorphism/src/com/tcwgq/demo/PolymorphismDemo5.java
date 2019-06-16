package com.tcwgq.demo;

/**
 * ClassCastException类型转换异常，属于运行时异常
 */
public class PolymorphismDemo5 {
	public static void main(String[] args) {
		A a = new Do();
		a.eat();
		// a.lookDoor();//错误，父类没有这个方法
		Do d = (Do) a;
		d.eat();
		d.lookDoor();
		a = new Ca();
		a.eat();
		// a.playGame();//错误，父类没有这个方法
		Ca c = (Ca) a;
		c.eat();
		c.playGame();
		Do dd = (Do) a;
		/*
		 * java.lang.ClassCastException: com.tcwgq.demo.Ca cannot be cast to
		 * com.tcwgq.demo.Do
		 */
	}
}

class A {
	public void eat() {
		System.out.println("animal eat");
	}
}

class Ca extends A {
	public void eat() {
		System.out.println("cat eat");
	}

	public void playGame() {
		System.out.println("cat palyGame");
	}
}

class Do extends A {
	public void eat() {
		System.out.println("dog eat");
	}

	public void lookDoor() {
		System.out.println("dog lookDoor");
	}
}