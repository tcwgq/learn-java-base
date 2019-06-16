package com.tcwgq.demo4;

import org.junit.Test;

/**
 * break 中断，用于跳出循环 
 * A:跳出单层循环 
 * B:跳出多层循环，可以使用带标签的语句。
 * 		格式：
 * 			标签名：语句
 */
public class BreakDemo {
	@Test
	public void fun1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("HelloWorld" + i);
			if (i == 5)
				break;
		}
	}
	
	@Test
	public void fun2(){
		outer:for (int x = 0; x < 4; x++) {
			inner:for (int y = 0; y < 5; y++) {
				System.out.print("*");
				if(y == 2){
//					break inner;//跳出内层循环
					break outer;//跳出外层循环
				}
			}
			System.out.println();
		}
	}
}
