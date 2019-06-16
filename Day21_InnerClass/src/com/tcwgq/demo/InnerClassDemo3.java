package com.tcwgq.demo;

/**
 * 成员内部类的常见修饰符：
 * private:为了保证数据的安全性
 * static:为了方便访问数据
 * 注意：静态内部类访问的外部类数据必须是静态的
 */
public class InnerClassDemo3 {
	public static void main(String[] args) {
		//The type Body.Heart is not visible
//		Body.Heart bh = new Body().new Heart();
//		bh.operate();
		Body b = new Body();
		b.method();
		System.out.println("-------------");
		//限定新的静态类
//		Body.Inner bi = new Body().new Inner();
//		bi.show();
//		bi.show1();
		//成员内部类被静态修饰后的访问方式是:
		//格式：外部类名.内部类名 对象名 = new 外部类名.内部类名();
		Body.Inner bi = new Body.Inner();
		bi.show();
		//The static method show1() from the type Body.Inner should be accessed in a static way
		bi.show1();
		System.out.println("-----------------");
		//show1的另一种调用方式
		Body.Inner.show1();
	}
}

class Body {
	private int num = 10;
	private static int num1 = 20;
	private class Heart {
		public void operate() {
			System.out.println("心脏移植手术");
		}
	}
	//成员内部类可用static修饰，此时内部类看成是外部类的成员
	public static class Inner {
		public void show(){
			//Cannot make a static reference to the non-static field num
//			System.out.println(num);
			System.out.println(num1);
		}
		public static void show1(){
			//Cannot make a static reference to the non-static field num
//			System.out.println(num);
			System.out.println(num1);
		}
	}
	public void method() {
		Heart h = new Heart();
		h.operate();
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}