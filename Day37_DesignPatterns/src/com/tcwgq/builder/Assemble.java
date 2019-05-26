package com.tcwgq.builder;

/**
 * 这是负责装配汽车的组装类，它将生产好的具体部件组装成一个汽车
 */
public class Assemble {
	private Builder builder;

	public Assemble(Builder builder) {
		super();
		this.builder = builder;
	}

	public void construct() {
		builder.buildBrand();
		builder.buildBColor();
		builder.buildPrice();
	}

}
