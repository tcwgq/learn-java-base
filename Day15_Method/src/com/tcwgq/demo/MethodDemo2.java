package com.tcwgq.demo;

import java.util.Scanner;

/**
 * 没有明确返回值的函数调用： 其实就是void类型方法的调用 只能单独调用
 */
public class MethodDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		star(a, b);
		multiplication(a);
		sc.close();
	}
	
	public static void star(int a, int b){
		for(int i = 0; i < a; i++){
			for(int j = 0; j < b; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void multiplication(int n){
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}
			System.out.println();
		}
	}

}
