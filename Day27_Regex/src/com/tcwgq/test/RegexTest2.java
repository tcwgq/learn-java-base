package com.tcwgq.test;

import java.util.Arrays;

/**
 * 分割功能： 
 * 我有如下一个字符串:”91 27 46 38 50” 请写代码实现最终输出结果是：”27 38 46 50 91”
 */
public class RegexTest2 {
	public static void main(String[] args) {
		String s = "91 27 46 38 50";
		String[] strs = s.split(" ");
		System.out.println(Arrays.toString(strs));
		int[] arr = new int[strs.length];
		for(int i = 0; i < strs.length; i++){
			arr[i] = Integer.parseInt(strs[i]);
		}
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < arr.length; i++){
			if(i < arr.length - 1){
				sb.append(arr[i] + " ");
			}else{
				sb.append(arr[i]);
			}
		}
		String ss = sb.toString();
		System.out.println(ss);
//		System.out.println(Arrays.toString(arr));
	}
}
