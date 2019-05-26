package com.tcwgq.test4;

public class ExtendsDemo {
	public static void main(String[] args) {
		Cat c = new Cat("aaa", 5, "white");
		System.out.println(c.getName() + "--" + c.getAge() + c.getAge());
		c.eat();
		c.playGame();
		System.out.println("-------------");
		Dog d = new Dog("bbb", 10, "black");
		System.out.println(d.getName() + "--" + d.getAge() + d.getColor());
		d.eat();
		d.lookDoor();
	}
}

class Animal {
	private String name;
	private int age;
	private String color;

	public Animal() {
		super();
	}

	public Animal(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void eat() {
		System.out.println("该吃饭了");
	}

}

class Cat extends Animal {

	public Cat() {
		super();
	}

	public Cat(String name, int age, String color) {
		super(name, age, color);
	}

	public void playGame() {
		System.out.println("猫爱玩游戏");
	}

}

class Dog extends Animal {

	public Dog() {
		super();
	}

	public Dog(String name, int age, String color) {
		super(name, age, color);
	}

	public void lookDoor() {
		System.out.println("狗爱看门");
	}
}