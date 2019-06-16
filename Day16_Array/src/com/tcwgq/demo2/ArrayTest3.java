package com.tcwgq.demo2;

import java.util.Scanner;

/**
 * 数组查表法(根据键盘录入索引,查找对应星期)
 */
public class ArrayTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		String[] s = { "星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期天" };
		if (index >= 1 && index <= 7) {
			System.out.println("你要查找的日期为：" + s[index - 1]);
		} else {
			System.out.println("你输入的数据有误！");
		}
		sc.close();
	}

}
