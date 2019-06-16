package com.tcwgq.demo;

/**
 * 抽象类作为方法的形式参数，实际传递的是抽象类的具体子类的对象
 */
public class FormalParameterDemo1 {
	public static void main(String[] args) {
		PersonDemo pd = new PersonDemo();
		Person p = new Coach();
		pd.show(p);
		System.out.println("--------------");
		Coach c = new Coach();
		pd.show(c);
	}
}

abstract class Person {
	public abstract void eat();
}

class PersonDemo {
	public void show(Person p) {
		p.eat();
	}
}

class Coach extends Person {

	@Override
	public void eat() {
		System.out.println("教练爱吃肉");
	}

}