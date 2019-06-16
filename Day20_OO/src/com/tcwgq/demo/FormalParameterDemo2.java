package com.tcwgq.demo;

/**
 * 接口作为方法的形式参数，实际传递的是接口具体实现类的对象
 */
public class FormalParameterDemo2 {
	public static void main(String[] args) {
		ActionDemo ad = new ActionDemo();
		Action a = new Cat();
		ad.method(a);
		System.out.println("-------------");
		Cat cat = new Cat();
		ad.method(cat);
	}
}

interface Action {
	public abstract void show();
}

class ActionDemo {
	public void method(Action a) {
		a.show();
	}
}

class Cat implements Action {

	@Override
	public void show() {
		System.out.println("猫会跳高了");
	}

}
