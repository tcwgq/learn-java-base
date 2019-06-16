package com.tcwgq.demo;

/**
 * Java中继承的特点： 
 * Java只支持单继承，不支持多继承。 一个类只能有一个父类，不可以有多个父类。 
 * class SubDemo extends Demo{} //ok 
 * class SubDemo extends Demo1,Demo2...//error 
 * Java支持多层继承(继承体系)
 * class A{} class B extends A{} class C extends B{}
 */
public class InheritanceDemo2 {
	public static void main(String[] args) {
		Son s = new Son();
		s.show();//继承自GrandFather
		s.method();//继承自Father
		s.function();//自己本身的方法
	}
}

class GrandFather {
	public void show(){
		System.out.println("GrandFather");
	}
	
}

class Father extends GrandFather {
	public void method(){
		System.out.println("Father");
	}
}

class GrandMother {
	
}
class Mother extends GrandMother {

}

//class Son extends Father, Mother {//错误，不支持多继承
//
//}

class Son extends Father {
	public void function(){
		System.out.println("Son");
	}
}