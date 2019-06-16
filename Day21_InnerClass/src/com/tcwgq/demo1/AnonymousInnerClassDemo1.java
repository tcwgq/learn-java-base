package com.tcwgq.demo1;

/**
 * 匿名内部类在实际开发中的应用
 */
public class AnonymousInnerClassDemo1 {
	public static void main(String[] args) {
		ActionTest at = new ActionTest();
		Teacher t = new Teacher();
		at.show(t);
		System.out.println("---------------");
		// 匿名内部类在开发中的使用
		// 匿名内部类的本质是继承类或者实现了接口的子类匿名对象
		at.show(new Action() {
			@Override
			public void study() {
				System.out.println("爱岗敬业");
			}
		});
		System.out.println("----------------");
		new ActionTest().show(new Action() {

			@Override
			public void study() {
				System.out.println("爱岗敬业");
			}

		});
	}
}

interface Action {
	public abstract void study();
}

class ActionTest {
	public void show(Action a) {
		a.study();
	}
}

class Teacher implements Action {

	@Override
	public void study() {
		System.out.println("爱岗敬业");
	}

}