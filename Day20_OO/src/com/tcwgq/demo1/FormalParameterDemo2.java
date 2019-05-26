package com.tcwgq.demo1;

/**
 * 接口作为方法的返回值类型，实际上返回的是该接口实现类的对象
 */
class FormalParameterDemo2 {
	public static void main(String[] args) {
		ActionDemo ad = new ActionDemo();
		Action a = ad.getAction();
		a.eat();
	}
}

interface Action {
	public abstract void eat();
}

class ActionDemo {
	public Action getAction() {
		return new Dog();
	}
}

class Dog implements Action {

	@Override
	public void eat() {
		System.out.println("Dog eats bones");
	}

}