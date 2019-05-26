package com.tcwgq.demo6;

/**
 * 1.final,finally和finalize的区别： final:修饰类，方法，变量 修饰类，类不能被继承 修饰方法，方法不能被重写
 * 修饰变量，变量成常量，不能被修改
 * finally：异常处理机制中的关键字，finally中的代码一般都会执行，特殊情况JVM退出了，则finally中的代码不会执行，常用来释放资源。
 * finalize：Objec类中的方法，用来垃圾回收。
 * 
 * 2.如果catch里面有return语句，请问finally的代码还会执行吗？如果会，请问是在return前还是return后？
 * 会执行，因为JVM还没有退出。
 * 前，因为return后JVM退出，要想finally中的语句执行，则其中的代码要在return之前执行
 * 确切大说，应该是在return语句的中间执行。
 * 此题断点查看，没有什么好的方法。
 * 
 * 3.try...catch...finally...的格式变形：
 *    A:try...catch...
 *    B:try...catch...catch...
 *    C:try...catch...catch...
 *    D:try...catch...finally...
 *    E:try...catch...catch...finally...
 *    F:try...finally...
 *      这种格式也是可以的，用来释放资源
 */
public class FinallyDemo1 {
	public static void main(String[] args) {
		System.out.println(getInt());
	}

	public static int getInt() {
		int a = 10;
		try {
			System.out.println(a / 0);
			a = 20;
		} catch (ArithmeticException e) {
			a = 30;
			return a;
		} finally {
			a = 40;
//			return a;//如果这样，就返回40了
		}
		return a;
	}

}
