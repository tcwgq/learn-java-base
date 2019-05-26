package com.tcwgq.demo1;

/**
 * 匿名内部类： 就是内部类的简化写法。 
 * 前提：存在一个类或者接口 这里的类可以是具体类也可以是抽象类。 
 * 格式： new 类名或者接口名() {重写方法;}
 * 本质： 是一个继承了类或者实现了接口的子类匿名对象
 */
public class AnonymousInnerClassDemo {
	public static void main(String[] args) {
		Student s = new Student();
		s.method();
	}
}

interface Inter {
	public abstract void show();
	public abstract void show1();
}

class Student {
	public void method(){
		new Inter(){
			@Override
			public void show() {
				System.out.println("show");
			}

			@Override
			public void show1() {
				System.out.println("show1");
			}
		};
		//如何调用匿名内部类中的方法？
		new Inter(){
			@Override
			public void show() {
				System.out.println("show");
			}

			@Override
			public void show1() {
				System.out.println("show1");
			}
		}.show();
		//只能一个一个单独调用
		new Inter(){
			@Override
			public void show() {
				System.out.println("show");
			}

			@Override
			public void show1() {
				System.out.println("show1");
			}
		}.show1();
		//这样的调用太过麻烦
		//下面是使用多态的方式调用
		Inter i = new Inter(){
			@Override
			public void show() {
				System.out.println("show");
			}

			@Override
			public void show1() {
				System.out.println("show1");
			}
		};
		i.show();
		i.show1();
	}
}
