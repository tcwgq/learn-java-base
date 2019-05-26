package com.tcwgq.demo;

/**
 * 多态的好处： 
 * A:提高了程序的维护性(由继承保证) 
 * B:提高了程序的扩展性(由多态保证)
 */
public class PolymorphismDemo2 {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();
		c.sleep();
		System.out.println("---------------");
		Dog d = new Dog();
		d.eat();
		d.sleep();
	}
}

class Animal {
	public void eat() {
		System.out.println("animal eats");
	}

	public void sleep() {
		System.out.println("animal sleeps");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("cat eats fish");
	}

	public void sleep() {
		System.out.println("cat sleeps well");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("dog eats meat");
	}

	public void sleep() {
		System.out.println("dog sleeps well");
	}
}