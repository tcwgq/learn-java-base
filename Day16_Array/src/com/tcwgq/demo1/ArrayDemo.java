package com.tcwgq.demo1;

/**
 * 静态初始化：初始化时指定每个数组元素的初始值，由系统决定数组长度。
 * 格式： 数据类型[] 数组名 = new 数据类型[]{元素1,元素2,…}; 
 * 举例：
 * int[] arr = new int[]{1,2,3};
 * 解释：定义了一个int类型的数组，这个数组中可以存放3个int类型的值，并且值分别是1,2,3。
 *  其实这种写法还有一个简化的写法 int[] arr = {1,2,3};
 * 
 * 注意事项： 不要同时动态和静态进行。
 * 如下格式： int[] arr = new int[3]{1,2,3}; //错误
 */
public class ArrayDemo {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3 };
		// int[] b = new int[3]{0, 1, 2};//错误，后面的不用再指定数组长度
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("-----------");
		// 上面的静态初始化可以简化
		int[] c = { 1, 2, 3 };
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
	}
}
