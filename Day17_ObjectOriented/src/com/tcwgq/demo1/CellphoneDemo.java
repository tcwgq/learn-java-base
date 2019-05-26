package com.tcwgq.demo1;

class CellphoneDemo {
	public static void main(String[] args) {
		Cellphone cp = new Cellphone();
		System.out.println(cp.brand);
		System.out.println(cp.price);
		System.out.println(cp.color);
		cp.brand = "诺基亚";
		cp.price = 19999;
		cp.color = "黑";
		System.out.println(cp.brand);
		System.out.println(cp.price);
		System.out.println(cp.color);
		cp.call("刘德华");
		cp.message();
		cp.playGame();
	}
}

class Cellphone {
	String brand;
	int price;
	String color;

	public void call(String name) {
		System.out.println("打电话给" + name);
	}

	public void message() {
		System.out.println("群发短信");
	}

	public void playGame() {
		System.out.println("玩游戏");
	}
}
