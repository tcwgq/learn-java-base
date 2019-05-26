package com.tcwgq.demo;

/**
 * 孔子装爹案例
 */
public class PolymorphismDemo4 {
	public static void main(String[] args) {
		FatherOfConfucius fof = new Confucius();
		System.out.println(fof.age);
		fof.teach();
		System.out.println("----------------");
		Confucius c = (Confucius) fof;
		System.out.println(c.age);
		c.teach();
		c.playGame();
	}
}

class FatherOfConfucius {
	int age = 40;

	public void teach() {
		System.out.println("讲解JavaSE");
	}
}

class Confucius extends FatherOfConfucius {
	int age = 25;

	public void teach() {
		System.out.println("讲解论语");
	}

	public void playGame() {
		System.out.println("玩英雄联盟");
	}
}