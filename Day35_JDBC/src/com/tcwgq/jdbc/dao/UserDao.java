package com.tcwgq.jdbc.dao;

import com.tcwgq.jdbc.domain.User;

public interface UserDao {
	public abstract void addUser(User user);

	public abstract User getUser(int userId);

	public abstract User findUser(String username, String password);

	public abstract void update(User user);

	public abstract void delete(User user);
}
