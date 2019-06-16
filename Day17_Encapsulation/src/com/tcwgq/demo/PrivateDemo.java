package com.tcwgq.demo;

/**
 * private关键字： 是一个权限修饰符。 
 * 可以修饰成员(成员变量和成员方法) 
 * 被private修饰的成员只在本类中才能访问。
 */
class PrivateDemo {
	public static void main(String[] args) {
		Demo d = new Demo();
//		System.out.println(d.num);//没使用private修饰
//		System.out.println(d.num);//使用private修饰后，The field Student.age is not visible
		d.show();
//		d.method();//The method method() from the type Demo is not visible
		d.fun();
	}
}

class Demo {
//	int num = 10;
	private int num = 10;
	public void show(){
		System.out.println(num);
	}
	private void method(){
		System.out.println("method");
	}
	public void fun(){
		System.out.println("fun");
		method();
	}
}