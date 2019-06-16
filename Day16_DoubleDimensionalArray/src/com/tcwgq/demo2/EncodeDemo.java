package com.tcwgq.demo2;

/**
 * 某个公司采用公用电话传递数据信息，数据是小于8位的整数， 
 * 为了确保安全， 在传递过程中需要加密，
 * 加密规则如下： 
 * 首先将数据倒序，
 * 然后将每位数字都加上5，再用和除以10的余数代替该数字， 
 * 最后将第一位和最后一位数字交换。 请任意给定一个小于8位的整数，
 * 然后，把加密后的结果在控制台打印出来。
 */
public class EncodeDemo {
	public static void main(String[] args) {
		// 定义一个数据
		int number = 123456;

		// 定义一个数组
		int[] arr = new int[8];

		// 把数据中每一位上的数据获取到后存储到数组中
		/*
		 * int index = 0; arr[index] = number%10; //arr[0]=6; index++;
		 * arr[index] = number/10%10; //arr[1]=5; index++; arr[index] =
		 * mumber/10/10%10; //arr[2]=4;
		 */

		// 通过观察这个代码，我们发现应该是可以通过循环改进的
		int index = 0;

		while (number > 0) { // number=123456,number=12345,number=1234,number=123,number=12,number=1,number=0
			arr[index] = number % 10; // arr[0]=6,arr[1]=5,arr[2]=4,arr[3]=3,arr[4]=2,arr[5]=1
			index++;// index=1,index=2,index=3,index=4,index=5,index=6
			number /= 10;// number=12345,number=1234,number=123,number=12,number=1,number=0
		}

		// 然后将每位数字都加上5，再用和除以10的余数代替该数字
		for (int x = 0; x < index; x++) {
			arr[x] += 5;
			arr[x] %= 10;
		}

		// 最后将第一位和最后一位数字交换
		int temp = arr[0];
		arr[0] = arr[index - 1];
		arr[index - 1] = temp;

		// 输出数据
		for (int x = 0; x < index; x++) {
			System.out.print(arr[x]);
		}
		System.out.println();
	}
}
