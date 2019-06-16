package com.tcwgq.demo1;

import org.junit.Test;

/**
 * 格式：import static 包名….类名.方法名;
 * 可以直接导入到方法的级别
 * 注意事项
 * 方法必须是静态的
 * 如果有多个同名的静态方法，容易不知道使用谁?这个时候要使用，必须加前缀。
 * 由此可见，意义不大，所以一般不用，但是要能看懂。
 * @author lenovo
 */
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.max;
public class StaticImportDemo {
	@Test
	public void fun(){
		//通过类名直接调用静态方法
		System.out.println(Math.abs(-100));
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.max(10, 20));
		System.out.println("---------------");
		//带包名，类名，调用静态方法
		System.out.println(java.lang.Math.abs(-38));
		System.out.println(java.lang.Math.pow(3, 3));
		System.out.println(java.lang.Math.min(45, 67));
		//使用静态导入，直接调用静态方法
		System.out.println(java.lang.Math.abs(-98));
		System.out.println(pow(5, 2));
		System.out.println(max(5, 9));
	}
	//多个静态的同名方法，调用时必须指明包名。
	public static void abs(String s){
		System.out.println(s);
	}

}
