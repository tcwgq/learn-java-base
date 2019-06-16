package com.tcwgq.demo1;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListDemo2 {
	/**
	 * List存储自定义对象，并使用特有方式遍历。
	 */
	@Test
	public void fun0(){
		List<User> list = new ArrayList<User>();
		User u1 = new User("aaa", "111");
		User u2 = new User("bbb", "222");
		User u3 = new User("ccc", "333");
		list.add(u1);
		list.add(u2);
		list.add(u3);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getUsername()+"--"+list.get(i).getPassword());
		}
	}

}
