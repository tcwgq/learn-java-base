package com.tcwgq.demo1;

/**
 * 不同地方饮食文化不同的案例
 */
public class PolymorphismTest1 {
	public static void main(String[] args) {
		Person p = new SouthPerson();
		p.eat();
		SouthPerson sp = (SouthPerson) p;
		sp.eat();
		sp.business();
		p = new NorthPerson();
		p.eat();
		NorthPerson np = (NorthPerson) p;
		np.eat();
		np.research();
	}
}

class Person {
	public void eat() {
		System.out.println("Person eat");
	}
}

class SouthPerson extends Person {
	public void eat() {
		System.out.println("南方人爱吃米饭");
	}

	public void business() {
		System.out.println("南方人爱经商");
	}
}

class NorthPerson extends Person {
	public void eat() {
		System.out.println("北方人爱吃面条");
	}

	public void research() {
		System.out.println("北方人爱研究");
	}
}