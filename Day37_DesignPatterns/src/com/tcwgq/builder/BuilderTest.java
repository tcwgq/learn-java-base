package com.tcwgq.builder;

public class BuilderTest {
	public static void main(String[] args) {
		Builder builder = new BuilderImpl();
		Assemble director = new Assemble(builder);
		director.construct();
		Car car = builder.getCar();
		String brand = car.getBrand().getBrand();
		String color = car.getColor().getColor();
		int price = car.getPrice().getPrice();
		System.out.println(brand + "--" + "--" + color + "--" + price);
	}
}
