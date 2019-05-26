package com.tcwgq.demo1;

public enum Direction1 {
	FRONT("前"), BEHIND("后"), LEFT("左"), RIGHT("右");

	private Direction1(String name) {
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

}
