package com.tcwgq.demo2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.junit.Test;

public class ListIteratorDemo {
	/**
	 * ListIterator概述：
	 * 列表迭代器，允许程序员按任一方向遍历列表、迭代期间修改列表，
	 * 并获得迭代器在列表中的当前位置。ListIterator 没有当前元素；
	 * 它的光标位置 始终位于调用 previous()所返回的元素和调用 next()所返回的元素之间。
	 * 长度为 n 的列表的迭代器有 n+1 个可能的指针位置。
	 * 
	 * 特有方法概述：
	 * boolean hasPrevious()：如果以逆向遍历列表，列表迭代器有多个元素，则返回 true。
	 * E previous()：返回列表中的前一个元素。
	 * 可以重复调用此方法来迭代列表，或混合调用 next来前后移动
	 * （注意交替调用 next 和 previous 将重复返回相同的元素）。
	 * int nextIndex()：对 next 的后续调用所返回元素的索引，如果列表迭代器在列表的结尾，则返回列表大小。
	 * int previousIndex()：对 previous 的后续调用所返回元素的索引，如果列表迭代器在列表的开始，则返回 -1。
	 * void remove()：从列表中移除由 next 或 previous 返回的最后一个元素（可选操作）。
	 * 对于每个 next 或 previous 调用，只能执行一次此调用。
	 * 只有在最后一次调用 next或 previous之后，尚未调用 ListIterator.add时才可以执行该调用。
	 * void set(E e)用指定元素替换 next 或 previous 返回的最后一个元素（可选操作）。
	 * 只有在最后一次调用 next或 previous后既没有调用 ListIterator.remove也没有调用 ListIterator.add 时才可以进行该调用。
	 */
	/**
	 * ListIterator可以实现逆向遍历，但需要先正向遍历。所以开发中不是太常用。
	 */
	@Test
	public void fun0(){
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add("javaee");
		list.add("android");
		ListIterator<String> li = list.listIterator();
		System.out.println(li.nextIndex());
		while(li.hasNext()){
			String s = li.next();
			System.out.println(s);
		}
		//必须先正向遍历后，才能逆向遍历，所以开发中不是很常用。
		System.out.println(li.nextIndex());
		while(li.hasPrevious()){
			String s = li.previous();
			System.out.println(s);
		}
	}

}
