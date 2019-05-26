package com.tcwgq.demo4;

import org.junit.Test;

/**
 * continue的使用场景： 在循环语句中 离开使用场景的存在是没有意义的 
 * continue的作用： 单层循环对比break，然后总结两个的区别
 * break 退出当前循环 continue 退出本次循环 也可以带标签的使用(不演示了) 
 * 
 * break:跳出本次循环
 * continue：跳过一次循环，即在本次循环中跳过一次循环
 */
public class ContinueDemo {
	@Test
	public void fun1() {
		int i;
		for(i = 0; i < 10; i++){
			if(i == 5){
//				break;
				continue;
			}
			System.out.println("HelloWorld" + i);
		}
	}
	
	@Test
	public void fun2(){
		int i;
		int j;
		outer:for(i = 0; i < 4; i++){
			inner:for(j = 0; j < 5; j++){
				if(j == 2){
					continue outer;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/*
	 * 练习题：
		for(int x=1; x<=10; x++) {1, 2, 3, 4, 5, 6, 7, 8, 9, 10
			if(x%3==0) {
				//在此处填写代码
			}
			System.out.println(“Java基础班”);
		}
		
		我想在控制台输出2次:“Java基础班“
			break;
		我想在控制台输出7次:“Java基础班“
			continue;//即除去3, 6, 9这3个数
		我想在控制台输出13次:“Java基础班“	
			System.out.println(“Java基础班”);//这一步有时却不好想
	 */

}
