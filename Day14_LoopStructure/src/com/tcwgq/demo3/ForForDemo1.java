package com.tcwgq.demo3;

/**
 * 需求：请输出如下图形
 *  *
 *  **
 *  ***
 *  ****
 *  *****
 */
public class ForForDemo1 {
	public static void main(String[] args) {
		int i;
		int j;
		for(i = 1; i <= 5; i++){
			for(j = 0; j < i; j ++){
				System.out.print("*");
			}
			if(i < 5)//取出最后的换行符
			System.out.println();
		}
	}

}
