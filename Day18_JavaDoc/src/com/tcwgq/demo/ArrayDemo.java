package com.tcwgq.demo;

/**
 * 制作帮助文档 
 * 制作工具类 
 * ArrayTools 
 * 制作帮助文档(API) javadoc -d 目录 -author -version ArrayTool.java
 * 目录是指生成的帮助文档的目录
 * 注意：
 * 在同一个文件夹下，类定义在两个文件中和定义在一个文件中其实一样的。
 */
class ArrayDemo {
	public static void main(String[] args) {
		int[] arr = {1, 3, 6, 19, 0, 15, 20};
		printArray(arr);//静态方法，直接调用
		ArrayDemo ad = new ArrayDemo();
		ad.printArray1(arr);//非静态方法，创建对象调用
//		ArrayTool at = new ArrayTool();
//		at.printArray1(arr);
		ArrayTool.printArray(arr);
	}
	//静态方法，main方法可直接调用
	public static void printArray(int[] array){
		for(int i = 0; i < array.length; i++){
			if(i < array.length -1){
				System.out.print(array[i] + ", ");
			}else{
				System.out.println(array[i]);
			}
		}
	}
	//非静态方法，创建对象才能调用
	public void printArray1(int[] array){
		for(int i = 0; i < array.length; i++){
			if(i < array.length -1){
				System.out.print(array[i] + ", ");
			}else{
				System.out.println(array[i]);
			}
		}
	}
}	

