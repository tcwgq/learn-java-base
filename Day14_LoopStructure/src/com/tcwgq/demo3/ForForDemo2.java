package com.tcwgq.demo3;

/**
 * 需求：在控制台输出九九乘法表。
 *
 */
public class ForForDemo2 {
	public static void main(String[] args) {
		int i;
		int j;
		for (i = 1; i <= 9; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
				//根据乘法表，应该是j在i的前面
				/*
				 * '/x'，x表示任意字符，这种做法叫做转义字符
				 * '\t'，tab键
				 * '\r'，回车
				 * '\n'，换行
				 */
			}
			System.out.println();
		}
	}

}
