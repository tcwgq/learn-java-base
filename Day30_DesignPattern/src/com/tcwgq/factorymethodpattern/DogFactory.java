package com.tcwgq.factorymethodpattern;

public class DogFactory implements Factory {

	@Override
	public Animal createAnimal() {
		return new Dog();
	}

}
