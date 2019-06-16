package com.tcwgq.test;

import java.util.Scanner;

public class TempTest {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		// if(sc.hasNext())
		sc1.nextLine();
		sc1.close();
		//java.util.NoSuchElementException: No line found
		//原因是关闭sc1的同时，System.in也被关闭了！
		Scanner sc2 = new Scanner(System.in);
		sc2.nextLine();
		sc2.close();
	}

}
