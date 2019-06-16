package com.tcwgq.demo2;
/**
 * 继承中成员变量之间的关系：
 * 成员变量
 * 成员方法
 * 构造方法
 * 
 * 继承中成员变量之间的关系
 * A:子类中成员变量与父类中成员变量的名称不同
 * B:子类中成员变量与父类中成员变量的名称相同
 * 	在子类中访问一个变量的查找顺序：
 * 		a.先在子类的局部范围找，找到就使用
 * 		b.在子类的成员范围找，找到就使用
 * 		c.在父类的成员范围找，找到就使用
 * 		d.如果还没有，就报错
 * 	即按照就近原则寻找成员变量
 * 
 */
public class InheritanceDemo {
	public static void main(String[] args) {
		Son s = new Son();
//		System.out.println(s.a);
//		System.out.println(s.b);
		s.show();		
	}
}

class Father {
	public Father(){
		
	}
	int a = 10;
}

class Son extends Father {
	int a = 30;
	int b = 20;
	public Son(){
		
	}
	public void show(){
		int a = 40;
		System.out.println(a);
		System.out.println(b);
	}
	
}