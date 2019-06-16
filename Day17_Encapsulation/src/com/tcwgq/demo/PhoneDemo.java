package com.tcwgq.demo;

class PhoneDemo {
	public static void main(String[] args) {
		Phone p = new Phone();
		System.out.println(p.getBrand() + "--" + p.getPrice() + "--" + p.getColor());
		System.out.println("----------");
		p.setBrand("Apple");
		p.setPrice(5288);
		p.setColor("black");
		System.out.println(p.getBrand() + "--" + p.getPrice() + "--" + p.getColor());
	}
}

class Phone {
	private String brand;
	private int price;
	private String color;

	public String getBrand() {
		return this.brand;//这种写法也可以
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
