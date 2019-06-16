package com.tcwgq.demo5;

/**
 * 类及其成员可用的修饰符
 * 常见的修饰符：
 * 		权限修饰符：private, default, protected, public
 * 		状态修饰符：static, final
 * 		抽象修饰符：abstract
 * 类：
 * 		权限修饰符：default, public
 * 		状态修饰符：final
 * 		抽象修饰符：abstract
 * 		          最常用：public
 * 成员变量：
 * 		权限修饰符：private, default, protected, public
 * 		状态修饰符：static, final
 * 		抽象修饰符：
 * 		          最常用：private
 * 构造方法：
 * 		权限修饰符：private, default, protected, public
 * 		状态修饰符：
 * 		抽象修饰符：
 * 		          最常用：public
 * 成员方法：
 * 		权限修饰符：private, default, protected, public
 * 		状态修饰符：static, final
 * 		抽象修饰符：abstract
 * 		          最常用：public
 * 
 * 常见的修饰符组合：
 * 		成员变量：public static final
 * 		成员方法：public static, public abstract, public final
 */
//Illegal modifier for the class Test; only public, abstract & final are permitted
//Illegal modifier for the class Test; only public, abstract & final are permitted
//Illegal modifier for the class Test; only public, abstract & final are permitted
public class Test {
	//成员变量
	private int a = 10;
	int b = 20;
	protected int c = 30;
	static int d = 40;
	final int e = 50;
	//Illegal modifier for the field f; only public, protected, private, static, final, transient & volatile are permitted
//	abstract int f = 60;
	//构造方法
	private Test(){
		
	}
	Test(String name){
		
	}
	protected Test(String name, int age){
		
	}
	public Test(String name, int age, String address){
		
	}
	//Illegal modifier for the constructor in type Test; only public, protected & private are permitted
//	public static Test(int a, int b){
//		
//	}
	//Illegal modifier for the constructor in type Test; only public, protected & private are permitted
//	public final Test(int a, String s){
//		
//	}
	//Illegal modifier for the constructor in type Test; only public, protected & private are permitted
//	public abstract Test(int a, int b, int c){
//		
//	}
	//成员方法
	private void show1(){
		
	}
	void show2(){
		
	}
	protected void show3(){
		
	}
	public void show4(){
		
	}
	static void show5(){
		
	}
	final void show6(){
		
	}
	//The abstract method show7 in type Test can only be defined by an abstract class
//	abstract void show7();

	
}
