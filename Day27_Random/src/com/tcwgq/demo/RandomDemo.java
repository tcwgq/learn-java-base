package com.tcwgq.demo;

import java.util.Random;

/**
 * Random:此类的实例用于生成伪随机数流。
 * public Random():创建一个新的随机数生成器。使用系统的当前时间毫秒值作为种子，每次种子都不一样。
 * 此构造方法将随机数生成器的种子设置为某个值，该值与此构造方法的所有其他调用所用的值完全不同。
 * public Random(long seed):使用单个long种子创建一个新的随机数生成器。
 * 该种子是伪随机数生成器的内部状态的初始值，该生成器可通过方法 next(int)维护。
 * 给定种子后，生成的随机数是相同的。
 * public int nextInt():返回下一个伪随机数，它是此随机数生成器的序列中均匀分布的int值。
 * public int nextInt(int n)：返回一个伪随机数，它是取自此随机数生成器序列的、在 0（包括）和指定值（不包括）之间均匀分布的int值。
 */
public class RandomDemo {
	public static void main(String[] args) {
		Random r1 = new Random();
		for(int i = 0; i < 10; i++){
//			System.out.println(r1.nextInt());
//			System.out.println(r1.nextInt(100));//[0, 100)
		}
		Random r2 = new Random(1000l);
		for(int i = 0; i < 10; i++){
//			System.out.println(r2.nextInt());
			System.out.println(r2.nextInt(100));//[0, 100)
		}
	}
}
