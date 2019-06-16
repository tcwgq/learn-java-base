package com.tcwgq.demo7;

import java.util.HashSet;
import java.util.Random;

import org.junit.Test;

/**
 * 编写一个程序，获取10个1至20的随机数，要求随机数不能重复。
 */
public class HashSetDemo {
	@Test
	public void fun(){
		HashSet<Integer> hs = new HashSet<Integer>();
		Random r = new Random();
		int num;
		while(hs.size()<10){
			num = r.nextInt(20)+1;
			hs.add(num);
		}
		for(Integer i : hs){
			System.out.println(i);
		}
	}

}
