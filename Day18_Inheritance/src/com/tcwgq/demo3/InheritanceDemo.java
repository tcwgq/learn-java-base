package com.tcwgq.demo3;

/**
 * this和super的区别：
 * this代表本类对象的引用
 * super代表父类存储空间的标识，可以理解为父类对象的引用，能够操作父类的成员
 * 用法：
 * 成员变量：
 * 		this.成员变量  本类的成员变量
 * 		super.成员变量  父类的成员变量
 * 成员方法：
 * 		this.成员方法  本类的成员方法
 * 		super.成员方法  父类的成员方法
 * 构造方法
 * 		this(...)  本类的构造方法
 * 		super(...)  父类的构造方法
 * 
 */
public class InheritanceDemo {
	public static void main(String[] args) {
		Son s = new Son();
//		System.out.println(s.num);
//		System.err.println(this.num);//Cannot use this in a static context
		s.show();
	}
}

class Father {
	int num = 10;
}

class Son extends Father {
	int num = 20;
	public void show(){
		int num = 30;
		System.out.println(num);
		System.out.println(this.num);//访问本类的成员变量
		System.out.println(super.num);//访问父类的成员变量
	}
}