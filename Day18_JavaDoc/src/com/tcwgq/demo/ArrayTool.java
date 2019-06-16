package com.tcwgq.demo;

class ArrayTool {
	//无参构造函数私有化，不能创建该类的实例对象
	private ArrayTool(){
		
	}
	// 静态方法，main方法可直接调用
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i < array.length - 1) {
				System.out.print(array[i] + ", ");
			} else {
				System.out.println(array[i]);
			}
		}
	}

	// 非静态方法，创建对象才能调用
	public void printArray1(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i < array.length - 1) {
				System.out.print(array[i] + ", ");
			} else {
				System.out.println(array[i]);
			}
		}
	}
}
