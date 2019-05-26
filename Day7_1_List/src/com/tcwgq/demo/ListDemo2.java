package com.tcwgq.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class ListDemo2 {
	/**
	 * List集合储存自定义对象并遍历。
	 */
	@Test
	public void fun() {
		List<User> list = new ArrayList<User>();
		User u1 = new User("aaa", "10");
		User u2 = new User("bbb", "20");
		User u3 = new User("ccc", "30");
		list.add(u1);
		list.add(u2);
		list.add(u3);
		Iterator<User> it = list.iterator();
		while(it.hasNext()){
			User user = it.next();
			System.out.println(user.getUsername()+"--"+user.getPassword());
		}
	}

}

