package com.tcwgq.demo1;

import java.util.Scanner;

/**
 * 打印杨辉三角形(行数可以键盘录入) 
 * 杨辉三角： 
 * 1 
 * 1  1 
 * 1 2  1 
 * 1 3 3  1 
 * 1 4 6 4  1 
 * 1 5 10 10 5 1
 * 构造一个N阶方阵，第一列和对角线都是1，
 * 从第3行开始满足a[i][j] = a[i-1][j-1] + a[i-1][j]。
 */
public class DoubleDimensionalArrayTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		for(int i = 0; i < n; i++){//初始化第一列和对角线部分
			for(int j = 0; j < n; j++){
				if(j == 0){
					a[i][j] = 1;
				}else if(i == j){
					a[i][j] = 1;
				}
			}
		}
		for(int i = 2; i < n; i++){//初始化其他部分
			//这里如果y<=x是有个小问题的，就是最后一列的问题
			//所以这里要减去1
			//并且y也应该从1开始，因为第一列也是有值了
			for(int j = 1; j < n; j++){
				a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
			}
		}
		/*
		for(int i = 2; i < n; i++){//初始化其他部分
			for(int j = 1; j < n; j++){
				a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
			}
		}
		//这种情况结果也正确，但是思维考虑的不周密
		*/
		for(int i = 0; i < a.length; i ++){//遍历方阵的下三角阵
			for(int j = 0; j <= i; j ++){
				if(j < i){
					System.out.print(a[i][j]+"\t");
				}else{
					System.out.println(a[i][j]);
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
