package com.tcwgq.builder;

public class Car {
	private Brand brand;
	private Color color;
	private Price price;

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand.getBrand() + ", color=" + color.getColor() + ", price=" + price.getPrice() + "]";
	}

}
