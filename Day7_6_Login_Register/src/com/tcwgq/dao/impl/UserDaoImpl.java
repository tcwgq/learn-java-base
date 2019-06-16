package com.tcwgq.dao.impl;

import java.util.ArrayList;

import com.tcwgq.dao.UserDao;
import com.tcwgq.pojo.User;
/**
 * 注意：while循环内，每次创建的都是新的集合对象，导致前后数据不一致。
 * 需要将ArrayList按静态初始化。
 * @author lenovo
 *
 */
public class UserDaoImpl implements UserDao {
	private static ArrayList<User> al = new ArrayList<User>();

	@Override
	public boolean isLogin(String username, String password) {
		User user = new User(username, password);
		if(al.contains(user)){
			return true;
		}
		return false;
	}

	@Override
	public void register(User user) {
		al.add(user);
	}

}
