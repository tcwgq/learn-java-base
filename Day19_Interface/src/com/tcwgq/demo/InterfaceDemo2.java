package com.tcwgq.demo;

/**
 * 类与类,类与接口以及接口与接口的关系 
 * 类与类:继承关系，只能单继承，但是可以多层继承 
 * 类与接口:实现关系，可以单实现，也可以多实现。还可以在继承一个类的同时实现多个接口 
 * 接口与接口:继承关系，可以单继承，也可以多继承
 * 
 * 由此可见Java中是有多继承的，只不过是在接口之间！
 */
public class InterfaceDemo2 {
	public static void main(String[] args) {

	}
}

abstract class Person {
	public abstract void eat();
}

interface Jump {
	public abstract void jump();
}

interface Fly {
	public abstract void fly();
}

interface Swim extends Jump{
	
}

interface Run extends Jump, Fly {
	
}

class Son implements Jump{

	@Override
	public void jump() {
		
	}
	
}

class Father implements Jump, Fly {

	@Override
	public void fly() {
		
	}

	@Override
	public void jump() {
		
	}
	
}

class Mother extends Person implements Jump, Fly {

	@Override
	public void fly() {
		
	}

	@Override
	public void jump() {
		
	}

	@Override
	public void eat() {
		
	}
	
}