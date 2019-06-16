package com.tcwgq.demo;

import java.util.ArrayList;

import org.junit.Test;

public class ToStringDemo {
	@Test
	public void fun(){
		ArrayList<String> al = new ArrayList<String>();
		al.add("hello");
		al.add("world");
		al.add("java");
		System.out.println(al.toString());
	}
	/**
	 * toString方法的代码实现：
	 * public String toString() {
        Iterator<E> it = iterator();
        if (! it.hasNext())
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (;;) {
            E e = it.next();
            sb.append(e == this ? "(this Collection)" : e);
            //就是这步不大懂，为什么需要判断e==this?"(this Collection)":e？
            //什么情况下，能出现e == this的情况？
            if (! it.hasNext())
                return sb.append(']').toString();
            sb.append(',').append(' ');
        }
    }
	 */

}
