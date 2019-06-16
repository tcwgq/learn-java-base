package com.tcwgq.demo;

import java.util.Scanner;

/**
 * switch语句的注意事项：
 * case后面只能是常量，不能是变量，而且，多个case后面的值不能出现相同的 
 * default可以省略吗? 可以省略。一般不建议。除非判断的值是固定的。(单选题) 
 * break可以省略吗? 可以省略，一般不建议。否则结果可能不是你想要的，注意case穿透问题
 * default的位置一定要在最后吗? 可以出现在switch语句任意位置。
 * switch语句的结束条件 遇到break 执行到程序的末尾
 */
public class SwitchDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		switch(s){
			case "hello":
				System.out.println("你好");
				break;
			case "world":
				System.out.println("世界");
				break;
			case "java":
				System.out.println("java");
				break;
			default:
				System.out.println("Oh, my god, you are so powerful");
				break;//default在最后，此处的break可以省略
		}
		sc.close();
	}

}
