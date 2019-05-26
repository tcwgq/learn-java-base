package com.tcwgq.factorymethodpattern;

public class Test {
	public static void main(String[] args) {
		Factory f = new DogFactory();
		Animal dog = f.createAnimal();
		dog.eat();
		System.out.println("---------------");
		f = new CatFactory();
		Animal cat = f.createAnimal();
		cat.eat();
	}
}
