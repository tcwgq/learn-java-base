package com.tcwgq.builder;

/**
 * 这是生产部件的具体实现类 ，生产出来具体部件后，有
 */
public class BuilderImpl implements Builder {
	private Brand brand;
	private Color color;
	private Price price;

	@Override
	public void buildBrand() {
		this.brand = new Brand();
		this.brand.setBrand("Audi");
	}

	@Override
	public void buildBColor() {
		this.color = new Color();
		this.color.setColor("Black");
	}

	@Override
	public void buildPrice() {
		this.price = new Price();
		this.price.setPrice(499999);
	}

	@Override
	public Car getCar() {
		Car car = new Car();
		car.setBrand(brand);
		car.setColor(color);
		car.setPrice(price);
		return car;
	}

}
