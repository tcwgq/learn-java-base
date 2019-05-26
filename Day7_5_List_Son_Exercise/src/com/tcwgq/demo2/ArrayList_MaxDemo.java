package com.tcwgq.demo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 键盘录入多个数据，以0结束，要求在控制台输出这多个数据中的最大值
 */
/**
 * public <T> T[] toArray(T[] a):
 * 按适当顺序（从第一个到最后一个元素）返回包含此列表中所有元素的数组；
 * 返回数组的运行时类型是指定数组的运行时类型。
 * 如果指定的数组能容纳列表，则将该列表返回此处。
 * 否则，将分配一个具有指定数组的运行时类型和此列表大小的新数组。 
 * 如果指定的数组能容纳队列，并有剩余的空间（即数组的元素比队列多），
 * 那么会将数组中紧接 collection 尾部的元素设置为 null。
 * （仅 在调用者知道列表中不包含任何 null 元素时才能用此方法确定列表长度）。 
 */
public class ArrayList_MaxDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		int num;
		while(true){
			num = sc.nextInt();
			if(num!=0){
				al.add(num);
			}else{
				break;
			}
		}
//		Integer max = Collections.max(al);//还没学到这个方法
		Integer[] in = new Integer[al.size()];
//		Integer[] ins = al.toArray(in);
		in = al.toArray(in);
		System.out.println(in);//两次打的地址值相同
//		System.out.println(ins);
		//使用Arrays的sort方法自然排序
		Arrays.sort(in);
		int max = in[in.length-1];
		System.out.println(max);
		sc.close();
	}

}
