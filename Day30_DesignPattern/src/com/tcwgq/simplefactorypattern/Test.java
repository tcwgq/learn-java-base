package com.tcwgq.simplefactorypattern;

public class Test {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		Cat c = new Cat();
		c.eat();
		System.out.println("---------------");
		Dog d1 = AnimalFactory.createDog();
		d1.eat();
		Cat c1 = AnimalFactory.createCat();
		c1.eat();
		System.out.println("------------------");
		Animal a1 = AnimalFactory.createAnimal("dog");
		a1.eat();
		Animal a2 = AnimalFactory.createAnimal("cat");
		a2.eat();
		// NullPointerException
		Animal a3 = AnimalFactory.createAnimal("pig");
		if (a3 != null) {
			a3.eat();
		}
	}
}
