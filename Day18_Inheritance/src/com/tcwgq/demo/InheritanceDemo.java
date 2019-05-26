package com.tcwgq.demo;

/**
 * 继承概述 多个类中存在相同属性和行为时，将这些内容抽取到单独一个类中，那么多个类无需再定义这些属性和行为，只要继承那个类即可。
 * 通过extends关键字可以实现类与类的继承 class 子类名 extends 父类名 {}
 * 单独的这个类称为父类，基类或者超类；这多个类可以称为子类或者派生类。
 * 有了继承以后，我们定义一个类的时候，可以在一个已经存在的类的基础上，还可以定义自己的新成员。
 * 
 * 继承的好处 提高了代码的复用性 多个类相同的成员可以放到同一个类中 提高了代码的维护性 如果功能的代码需要修改，修改一处即可
 * 让类与类之间产生了关系，是多态的前提 其实这也是继承的一个弊端：类的耦合性很强
 * 
 */
public class InheritanceDemo {
	public static void main(String[] args) {
		Student s = new Student();
		s.eat();
		Teacher t = new Teacher();
		t.eat();
	}
}

class Person {
	String name;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void eat() {
		System.out.println("吃饭");
	}
}

class Student {
	String name;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void eat() {
		System.out.println("吃饭");
	}
}

class Teacher {
	String name;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void eat() {
		System.out.println("吃饭");
	}

}