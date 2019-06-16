package com.tcwgq.demo1;

import org.junit.Test;

/**
 * if语句注意事项：
 * 1.关系表达式无论简单还是复杂，结果必须是boolean类型
   2.if语句控制的语句体如果是一条语句，大括号可以省略；
             如果是多条语句，就不能省略。建议永远不要省略。
   3. 一般来说：有左大括号就没有分号，有分号就没有左大括号

 */
public class CaseStructureDemo2 {
	@Test
	public void fun1(){
		int a = 3;
		if(a == 10){
			System.out.println("哈哈，你赢了！");
		}
	}
	
	@Test
	public void fun2(){
		int a = -1;
		if ( a > 0){
			System.out.println("Hello");
			System.out.println("Heheheheh");
		}
	}

	@Test
	public void fun3(){
		int a = 5;
		if(a < 10);//if后面是空语句体
		{
			System.out.println("Hello world, java!");
		}
	}


}
