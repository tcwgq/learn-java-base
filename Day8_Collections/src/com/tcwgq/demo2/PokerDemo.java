package com.tcwgq.demo2;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

/**
 * 模拟斗地主洗牌和发牌
 */
public class PokerDemo {
	@Test
	public void fun() {
		ArrayList<String> al = new ArrayList<String>();
		String[] colors = { "♥", "♠", "♣", "♦" };
//		String[] numbers = { "A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };//我就呵呵了，扑克牌中没有1！！！！
		String[] numbers = { "A","2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };//我就呵呵了，扑克牌中没有1！！！！
		for (String num : numbers) {
			for (String color : colors) {
				al.add(num + color);
			}
		}
		al.add("大王");// 大王
		al.add("小王");// 小王
		System.out.println(al.size());
		Collections.shuffle(al);
		// 四个人开始发牌
		ArrayList<String> p1 = new ArrayList<String>();
		ArrayList<String> p2 = new ArrayList<String>();
		ArrayList<String> p3 = new ArrayList<String>();
		ArrayList<String> p = new ArrayList<String>();// 底牌
		for (int i = 0; i < al.size(); i++) {
			//此处可选择前3张或后3张 牌作为底牌！
			if (i < 3) {
				p.add(al.get(i));
			} else if (i % 3 == 0) {
				p1.add(al.get(i));
			} else if (i % 3 == 1) {
				p2.add(al.get(i));
			} else if (i % 3 == 2) {
				p3.add(al.get(i));
			}
		}
		System.out.println(p1.size());
		System.out.println(p2.size());
		System.out.println(p3.size());
		System.out.println(p.size());
	}

}
