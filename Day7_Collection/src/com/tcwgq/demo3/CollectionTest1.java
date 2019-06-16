package com.tcwgq.demo3;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

public class CollectionTest1 {
	/**
	 * 集合存储自定义对象并遍历。
	 */
	@Test
	public void fun(){
		ArrayList<User> al = new ArrayList<User>();
		User u1 = new User("aaa", "111");
		User u2 = new User("bbb", "222");
		User u3 = new User("ccc", "333");
		al.add(u1);
		al.add(u2);
		al.add(u3);
		Iterator<User> it = al.iterator();
		while(it.hasNext()){
			User user = it.next();
			System.out.println(user.getUsername()+"--"+user.getPassword());
		}
	}

}
