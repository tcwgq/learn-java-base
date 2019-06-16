package com.tcwgq.demo;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		char ch = (char) a;
		System.out.println(ch);
		sc.close();
	}

}
