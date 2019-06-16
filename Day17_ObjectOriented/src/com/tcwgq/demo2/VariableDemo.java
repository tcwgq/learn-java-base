package com.tcwgq.demo2;

/**
 * 1.在类中的位置不同 
 * 		成员变量 类中方法外 
 * 		局部变量 方法内或者方法声明上 
 * 2.在内存中的位置不同 
 * 		成员变量 堆内存 
 * 		局部变量 栈内存 
 * 3.生命周期不同 
 * 		成员变量 随着对象的存在而存在，随着对象的消失而消失 
 * 		局部变量 随着方法的调用而存在，随着方法的调用完毕而消失 
 * 4.初始化值不同 
 * 		成员变量 有默认的初始化值 
 * 		局部变量 没有默认的初始化值，必须先定义，赋值，才能使用。
 * 注意：
 * 局部变量名称可以和成员变量名称一样，在方法中使用的时候，采用的是就近原则。
 */
class VariableDemo {
	public static void main(String[] args) {
		Variable v = new Variable();
		System.out.println(v.num);
		v.show();
	}

}

class Variable {
	int num = 10;
//	int num;
	public void show(){
		int num1 = 20;
		System.out.println(num1);
//		int num1;
//		System.out.println(num1);//The local variable num1 may not have been initialized
		int num = 20;
		System.out.println(num);
	}
}
