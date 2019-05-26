package com.tcwgq.demo;

/**
 * 代码块 
 * 在Java中，使用{}括起来的代码被称为代码块。
 * 根据其位置和声明的不同，可以分为局部代码块，构造代码块，静态代码块，同步代码块(多线程讲解)。
 * A.局部代码块 
 * 		在方法中出现；限定变量生命周期，及早释放，提高内存利用率 
 * B.构造代码块
 * 		在类中方法外出现；多个构造方法方法中相同的代码存放到一起，每次调用构造都执行，并且在构造方法前执行 
 * C.静态代码块 
 * 		在类中方法外出现，并加上static修饰；用于给类进行初始化，在加载的时候就执行，并且值执行一次。
 * 面试题:静态代码块,构造代码块,构造方法的执行顺序?
 * 		静态代码块 -- 构造代码块 -- 构造方法
 * 		静态代码块：只执行一次
 * 		构造代码块：每次调用构造方法都执行
 */
public class CodeBlockDemo {
	public static void main(String[] args) {
		{
			int x = 10;
			System.out.println(x);
		}
//		超过这个括号，x就变为垃圾，可被JVM回收
//		error,x cannot be resolved to a variable
//		System.out.println(x);
		System.out.println("--------------");
		new Code();
		System.out.println("--------------");
		new Code();
		System.out.println("---------------");
		new Code(456);
	}
}

class Code {
	//静态代码块
	static {
		System.out.println("静态代码块一");
	}
	//构造代码块
	{
		System.out.println("构造代码块一");
	}
	//无参构造函数
	public Code(){
		System.out.println("无参构造函数");
	}
	//带参构造函数
	public Code(int a){
		System.out.println("带参构造函数");
	}
	//构造代码块
	{
		System.out.println("构造代码块二");
	}
	//静态代码块
	static {
		System.out.println("静态代码块二");
	}
}
