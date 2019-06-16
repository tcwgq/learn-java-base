package com.tcwgq.builder;

/**
 * 这是负责生产汽车的接口，规定生产一部汽车需要哪些部件
 */
public interface Builder {
	public abstract void buildBrand();

	public abstract void buildBColor();

	public abstract void buildPrice();

	public abstract Car getCar();
}
