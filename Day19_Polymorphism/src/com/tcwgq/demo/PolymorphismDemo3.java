package com.tcwgq.demo;

/**
 * 多态的弊端 
 * A:不能访问子类特有功能 
 * B:那么我们如何才能访问子类的特有功能呢? 多态中的转型
 * 		a.创建子类对象，调用子类特用功能
 * 		b.把父类引用强制转换为子类对象的引用（向下转型）
 * C:对象键转型问题：
 * 		向上转型：Z z = new Z(); F f = z;
 * 		向下转型：F f = new Z(); Z z = (Z)f;
 */
public class PolymorphismDemo3 {
	public static void main(String[] args) {
		//多态调用
		F f = new Z();
		f.show();
//		f.method();//父类没有这个方法，子类不能访问
		//创建子类对象
//		Z z = new Z();
//		z.show();
//		z.method();
		Z z = (Z)f;
		z.show();
		z.method();
		//向上转型
		Z z1 = new Z();
		F f1 = z1;
		//向下转型
		F f2 = new Z();
		Z z2 = (Z)f2;
	}
}

class F {
	public void show(){
		System.out.println("Fu show");
	}
}

class Z extends F {
	public void show(){
		System.out.println("Zi show");
	}
	
	public void method(){
		System.out.println("Zi method");
	}
}