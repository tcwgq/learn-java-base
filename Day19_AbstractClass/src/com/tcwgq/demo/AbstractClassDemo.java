package com.tcwgq.demo;

/**
 * 抽象类：包含抽象方法的类！ 
 * 注意：
 * 在《JAVA编程思想》一书中，将抽象类定义为“包含抽象方法的类”，但是后面发现如果一个类不包含抽象方法，只是用abstract修饰的话也是抽象类。
 * 也就是说抽象类不一定必须含有抽象方法。个人觉得这个属于钻牛角尖的问题吧，因为如果一个抽象类不包含任何抽象方法，为何还要设计为抽象类？
 * 所以暂且记住这个概念吧，不必去深究为什么。
 * 抽象类的特点：
 * A:抽象类和抽象方法必须用abstract修饰
 * B:抽象类中不一定有抽象方法，但有抽象方法的类必须为抽象类
 * C:抽象类不能实例化，因为它不是具体的
 * 		抽象类有构造方法，但是不能实例化，构造方法是给子类创建对象时初始化父类数据用的
 * D:抽象类的子类：
 * 		a:子类是抽象类，不必重写父类的抽象方法
 * 		b:不是抽象类，不要重写父类所有的抽象方法
 * 抽象类可以通过具体子类实例化，这是多态的方式
 * 		Animal a = new Cat();
 */
public class AbstractClassDemo {
	public static void main(String[] args) {
//		Animal a = new Animal();//Cannot instantiate the type Animal
		Animal a = new Cat();
		a.eat();
	}
}

abstract class Animal {//The type Animal must be an abstract class to define abstract methods
	public abstract void eat();//Abstract methods do not specify a body
}

abstract class Dog extends Animal {
	
}

class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println("cat eats fish");
	}
	
}
