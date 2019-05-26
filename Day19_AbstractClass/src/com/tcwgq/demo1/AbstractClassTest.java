package com.tcwgq.demo1;

/**
 * 猫狗案例 
 * 具体事物：猫，狗 
 * 共性：姓名，年龄，吃饭
 */
public class AbstractClassTest {
	public static void main(String[] args) {
		Animal a = new Dog("aaa", 6);
		System.out.println(a.getName() + "--" + a.getAge());
		a.eat();
		System.out.println("--------------");
		a = new Cat("bbb", 3);
		System.out.println(a.getName() + "--" + a.getAge());
		a.eat();
	}
}

abstract class Animal {
	private String name;
	private int age;

	public Animal() {
		super();
	}

	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public abstract void eat();
}

class Dog extends Animal {

	public Dog() {
		super();
	}

	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		System.out.println("dog eats bone");
	}

}

class Cat extends Animal {

	public Cat() {
		super();
	}

	public Cat(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		System.out.println("cat eats fish");
	}

}