package com.tcwgq.demo;

class Cellphone {
	String brand;
	int price;
	String color;

	public void call(String name) {
		System.out.println("打电话给" + name);
	}

	public void message() {
		System.out.println("发短信");
	}

	public void playGame() {
		System.out.println("玩游戏");
	}
}
