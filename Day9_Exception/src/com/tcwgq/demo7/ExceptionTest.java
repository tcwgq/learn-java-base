package com.tcwgq.demo7;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入成绩：");
		int score =  sc.nextInt();
		try {
			check(score);
		} catch (MyException e) {
			e.printStackTrace();
		}
		sc.close();
	}
	public static void check(int score) throws MyException{
		if(score<0||score>100){
			throw new MyException("成绩必须在0-100之间");
		}else{
			System.out.println("成绩合法");
		}
	}

}
