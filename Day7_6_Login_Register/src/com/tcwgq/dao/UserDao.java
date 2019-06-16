package com.tcwgq.dao;

import com.tcwgq.pojo.User;

public interface UserDao {
	public abstract boolean isLogin(String username, String password);
	public abstract void register(User user);
}
