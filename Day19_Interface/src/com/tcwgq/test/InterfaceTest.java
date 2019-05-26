package com.tcwgq.test;

/**
 * 猫狗案例,加入跳高的额外功能
 */
public class InterfaceTest {
	public static void main(String[] args) {
		
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void eat();

	public void sleep() {
		// 睡觉的动作，子类相同，在此直接给出实现
		System.out.println("sleep");
	}

}

interface Action {
	public abstract void jump();
}

class Dog extends Animal implements Action {

	public Dog() {
		super();
	}

	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void jump() {
		System.out.println("狗跳的不高");
	}

	@Override
	public void eat() {
		System.out.println("狗爱吃骨头");
	}

}

class Cat extends Animal implements Action {

	public Cat() {
		super();
	}

	public Cat(String name, int age) {
		super(name, age);
	}

	@Override
	public void jump() {
		System.out.println("猫跳的很高");
	}

	@Override
	public void eat() {
		System.out.println("猫爱吃鱼");
	}

}
