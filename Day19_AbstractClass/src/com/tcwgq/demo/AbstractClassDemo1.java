package com.tcwgq.demo;

/**
 * 抽象类的成员特点 
 * 成员变量：可以为变量，也可以为常量，服从编译看左边，运行看左边 
 * 构造方法：有，用于子类访问父类数据的初始化 
 * 成员方法：可以为抽象方法，也可以为普通方法，服从编译看左边，运行看右边
 * 
 * 抽象类成员方法的特点：
 * 		A:抽象方法：强制子类必须实现的功能
 * 		B:非抽象方法，用于子类的继承，提高代码复用性
 */
public class AbstractClassDemo1 {
	public static void main(String[] args) {
		Animal1 a = new Dog1();
		// a.num = 20;
		System.out.println(a.num);
		// a.num1 = 200;//错误，不能再次赋值
		System.out.println(a.num1);
		a.eat();
		a.show();
	}
}

abstract class Animal1 {
	int num = 10;
	final int num1 = 100;

	public Animal1() {

	}

	public Animal1(String name, int age) {

	}

	abstract public void eat();
	public void show(){
		System.out.println("Animal show");
	}
}

class Dog1 extends Animal1 {
	int num = 1000;
	final int num1 = 2000;

	@Override
	public void eat() {

	}
	
	public void show(){
		System.out.println("Dog show");
	}
}