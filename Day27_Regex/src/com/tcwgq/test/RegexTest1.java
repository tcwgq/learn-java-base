package com.tcwgq.test;

import java.util.Arrays;

/**
 * 分割功能练习
 */
public class RegexTest1 {
	public static void main(String[] args) {
		String s = "aa,bb,cc";
		System.out.println(Arrays.toString(s.split(",")));
		System.out.println("---------------------------");
		String s1 = "ee.gg.hh";
		System.out.println(Arrays.toString(s1.split("\\.")));
		System.out.println("---------------------------");
		String s2 = "aa    bb                cc";
		System.out.println(Arrays.toString(s2.split(" +")));
		System.out.println("--------------------------");
		String s3 = "D:\\Workspace\\Eclipse\\Day27_Regex\\src\\com";
		System.out.println(Arrays.toString(s3.split("\\\\")));

	}
}
