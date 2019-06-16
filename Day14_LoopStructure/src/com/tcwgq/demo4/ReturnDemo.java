package com.tcwgq.demo4;

/**
 * return不是专门用来跳出循环的，而是用来跳出方法的。
 * 单独使用return，就是跳出方法。
 * 注意：
 * return与return null不同，return可用于跳出任何方法，
 * return null跳出方法，并返回null，用于返回值不为void的方法里面。
 */
public class ReturnDemo {
	public static void main(String[] args) {
		for (int x = 0; x < 10; x++) {
			if (x == 2) {
				System.out.println("退出");
				// break;
				// continue;
				return;
			}
			System.out.println(x);
		}
		System.out.println("over");
	}

}
