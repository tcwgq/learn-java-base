package com.tcwgq.demo3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

import org.junit.Test;

public class PokerDemo {
	@Test
	public void fun() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		String[] colors = { "♥", "♠", "♣", "♦" };
		String[] numbers = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2" };
		int index = 0;
		for (String num : numbers) {
			for (String color : colors) {
				hm.put(index, num + color);
				al.add(index);
				index++;
			}
		}
		// index++;//注意次数不需要index++，因为牌的下表从0开始
		hm.put(index, "小王");// 小王
		al.add(index);
		index++;
		hm.put(index, "大王");
		al.add(index);
		Collections.shuffle(al);
		TreeSet<Integer> p1 = new TreeSet<Integer>();
		TreeSet<Integer> p2 = new TreeSet<Integer>();
		TreeSet<Integer> p3 = new TreeSet<Integer>();
		TreeSet<Integer> p = new TreeSet<Integer>();
		for (int i = 0; i < al.size(); i++) {
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
		lookPoker("aaaa", hm, p1);
		lookPoker("bbbb", hm, p2);
		lookPoker("cccc", hm, p3);
		lookPoker("底牌", hm, p);
		/*
		 * System.out.println("--------------"); for (int i = 0; i < p.size();
		 * i++) { if (i == 0) { System.out.print("[" + hm.get(p.get(i))); } else
		 * { System.out.print(", " + hm.get(p.get(i))); if (i == p.size() - 1) {
		 * System.out.println("]"); } } }
		 */
	}

	public static void lookPoker(String name, HashMap<Integer, String> map, TreeSet<Integer> ts) {
		System.out.print(name + "的牌是：");
		int i = 0;
		for (Integer key : ts) {
			String value = map.get(key);
			if(i==0){
				System.out.print("["+value);
			}else{
				System.out.print(", "+value);
				if(i == ts.size()-1){
					System.out.print("]");
				}
			}
			i++;
		}
		System.out.println();
	}

}
