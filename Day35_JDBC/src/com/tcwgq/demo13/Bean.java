package com.tcwgq.demo13;

public class Bean {
	private String name;

	public Bean() {

	}

	public Bean(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bean [name=" + name + "]";
	}

}
