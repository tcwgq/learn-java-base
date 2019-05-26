package com.tcwgq.test;

/**
 * 把数组拼接成一个字符串
 */
public class StringBufferTest1 {
	public static void main(String[] args) {
		int[] arr = { 12, 0, 9, 4, 8, 15, 25 };
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if(i < arr.length -1){
				sb.append(arr[i] + ", ");
			}else{
				sb.append(arr[i] + "]");
			}
		}
		String s = new String(sb);
		System.out.println(s);
	}
}
