package com.tcwgq.simplefactorypattern;

public class AnimalFactory {

	private AnimalFactory() {
		super();
	}

	public static Dog createDog() {
		return new Dog();
	}

	public static Cat createCat() {
		return new Cat();
	}

	public static Animal createAnimal(String type) {
		if (type.equalsIgnoreCase("dog")) {
			return new Dog();
		} else if (type.equalsIgnoreCase("cat")) {
			return new Cat();
		} else {
			return null;
		}
	}

}
