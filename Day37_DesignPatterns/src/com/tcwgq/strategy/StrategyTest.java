package com.tcwgq.strategy;

public class StrategyTest {
	public static void main(String[] args) {
		Package p;
		// 刚到吴国的时候拆开第一个
		System.out.println("----------刚刚到吴国的时候拆开第一个---------------");
		p = new Package(new BackDoor());
		p.operate();// 拆开执行
		// 当刘备乐不思蜀时，拆开第二个
		System.out.println("----------刘备乐不思蜀，拆第二个了---------------");
		p = new Package(new GreenLight());
		p.operate();// 拆开执行
		// 孙权的小追兵了，咋办？拆开第三个锦囊
		System.out.println("----------孙权的小追兵了，咋办？拆开第三个锦囊---------------");
		p = new Package(new BlockEnemy());
		p.operate();// 拆开执行
	}

}
