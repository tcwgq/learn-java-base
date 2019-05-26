package com.tcwgq.demo3;

/**
 * 需求：请输出一个4行5列的星星(*)图案。
 */
public class ForForDemo {
	public static void main(String[] args) {
		int i;
		int j;
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print("*");
			}
			if(i < 3)//去掉最后一次打出的换行
			System.out.println();
		}
	}

}
