package com.tcwgq.demo1;

/**
 * 猫狗案例多态版
 */
public class PolymorphismTest {
	public static void main(String[] args) {
		Animal a = new Dog();
		a.eat();
		// a.lookDoor();
		Dog d = (Dog) a;
		d.eat();
		d.lookDoor();
		a = new Cat();
		a.eat();
		// a.playGame();
		Cat c = (Cat) a;
		c.eat();
		c.playGame();
		// Dog dd = (Dog)a;//ClassCastException
		// dd.eat();
		// dd.lookDoor();
		// 错误的演示
		// Dog d1 = new Animal();//不能直接从父类转换到子类
		// Dog d2 = new Cat();//错误

	}
}

class Animal {
	public void eat() {
		System.out.println("animal eat");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("cat eat");
	}

	public void playGame() {
		System.out.println("cat palyGame");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("dog eat");
	}

	public void lookDoor() {
		System.out.println("dog lookDoor");
	}
}