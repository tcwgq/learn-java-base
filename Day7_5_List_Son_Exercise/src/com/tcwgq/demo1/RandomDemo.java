package com.tcwgq.demo1;

import java.util.ArrayList;
import java.util.Random;

/**
 * 获取10个1-20之间的随机数，要求不能重复
 */
public class RandomDemo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		Random r = new Random();
		// 下面这种算法不能拿到10随机数
		// for (int i = 0; i < 10; i++) {
		// int random = r.nextInt(20) + 1;
		// if (!al.contains(random)) {
		// al.add(random);
		// }
		// }
		for (; al.size() < 10;) {
			int random = r.nextInt(20) + 1;
			if (!al.contains(random)) {
				al.add(random);
			}
		}
		for (Integer i : al) {
			System.out.println(i);
		}
	}

}
