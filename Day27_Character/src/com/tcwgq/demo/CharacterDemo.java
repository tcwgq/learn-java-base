package com.tcwgq.demo;

/**
 * Character类在对象中包装一个基本类型 char的值。Character类型的对象包含类型为char的单个字段。
 * public Character(char value):构造一个新分配的Character对象，用以表示指定的char值。
 */
public class CharacterDemo {
	public static void main(String[] args) {
		Character c = new Character((char)97);//不提倡这种做法
		System.out.println(c);
		Character ch = new Character('a');
		System.out.println(ch);
	}
}
