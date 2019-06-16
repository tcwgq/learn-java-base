package com.tcwgq.demo;
 /**
  * 内部类的分类：
  * 		成员内部类：在成员位置定义的内部类
  * 		局部内部类：在局部位置定义的内部类
  */
public class InnerClassDemo1 {
	public static void main(String[] args) {
		
	}
}

class Outer1 {
	private int num = 10;
	class Inner {
		public void show(){
			System.out.println("成员内部类");
		}
	}
	public void method(){
		class Inner1 {
			public void show1(){
				System.out.println("局部内部类");
			}
		}
	}
}