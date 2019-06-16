package com.tcwgq.test1;

/**
 * A:静态代码块-->构造代码块-->构造函数 
 * B:静态的内容随类的加载而加载 
 * C:子类初始化之前先进行父类的初始化 
 * 看程序写结果 
 * 我的结果：
 * 静态代码块Zi 
 * 构造代码块Zi 
 * 静态代码块Fu 
 * 构造代码块Fu 
 * 构造方法Fu 
 * 构造方法Zi 
 * 正确结果: 
 * 静态代码块Fu 
 * 静态代码块Zi 
 * 构造代码块Fu
 * 构造方法Fu 
 * 构造代码块Zi 
 * 构造方法Zi
 * 即父类静态的-->子类静态的-->父类构造代码块-->父类构造方法-->子类构造代码块-->子类构造方法
 */
class Fu {
	static {
		System.out.println("静态代码块Fu");
	}

	{
		System.out.println("构造代码块Fu");
	}

	public Fu() {
		System.out.println("构造方法Fu");
	}
}

class Zi extends Fu {
	static {
		System.out.println("静态代码块Zi");
	}

	{
		System.out.println("构造代码块Zi");
	}

	public Zi() {
		System.out.println("构造方法Zi");
	}
}

class ExtendsTest {
	public static void main(String[] args) {
		new Zi();
	}
}
