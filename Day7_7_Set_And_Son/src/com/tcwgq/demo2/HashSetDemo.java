package com.tcwgq.demo2;

import java.util.HashSet;

import org.junit.Test;

/**
 * HashSet存储自定义对象并遍历，要求不要有重复的元素出现，元素的属性值都相同，则视为重复。
 * @author lenovo
 *
 */
public class HashSetDemo {
	@Test
	public void fun(){
		HashSet<User> hs = new HashSet<User>();
		User u1 = new User("aaa", "aaa");
		User u2 = new User("bbb", "bbb");
		User u3 = new User("ccc", "ccc");
		User u4 = new User("aaa", "111");
		User u5 = new User("222", "bbb");
		User u6 = new User("ccc", "ccc");
		hs.add(u1);
		hs.add(u2);
		hs.add(u3);
		hs.add(u4);
		hs.add(u5);
		hs.add(u6);
		for(User user:hs){
			System.out.println(user.getUsername()+"---"+user.getPassword());
		}
	}
}
