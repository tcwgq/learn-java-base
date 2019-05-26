package com.tcwgq.demo6;
/**
 * 方法的重写(覆盖)
 * 方法重写：子类中出现和父类中方法声明一样的方法，强调不同类
 * 方法重载：同一个类中出现方法名称相同，参数列表不同的方法，与返回值无关
 * 子类调用时，先调用子类中的方法，如果子类没有，则调用父类的方法
 * 应用：
 * 当子类需要父类的功能，而功能主体子类有自己特有内容时，可以重写父类中的方法，
 * 这样，即沿袭了父类的功能，又定义了子类特有的内容。
 */
public class InheritanceDemo1 {
	public static void main(String[] args) {
		Z z = new Z();
//		z.show();//调用父类的方法
		z.show("aaa");//调用子类重写的方法
	}
}

class F {
	public void show(){
		System.out.println("F show()");
	}
}

class Z extends F {
	public void show(String name){
		super.show();
		/*
		 * 通过super调用父类的方法
		 * 这样既可拥有父类基本的功能，又可设定子类的特有功能
		 */
		System.out.println("Z:" + name);
	}
}
