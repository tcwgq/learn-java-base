package com.tcwgq.jdbc.dao.refactor;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.tcwgq.jdbc.domain.User;

public class UserDaoImpl extends AbstractDao {
	public User findUser(String username, String password) {
		String sql = "select id, name, birthday, money from user where name = ?";
		Object[] args = new Object[] { username };
		return (User) super.find(sql, args);
	}

	public String findUserName(int id) {
		String sql = "select id, name, birthday, money from user where id = ?";
		Object[] args = new Object[] { id };
		return ((User) super.find(sql, args)).getName();
	}

	public void update(User user) {
		String sql = "update user set name = ?, birthday = ?, money = ? where id = ?";
		Object[] args = new Object[] { user.getName(), user.getBirthday(), user.getMoney(), user.getId() };
		super.update(sql, args);
	}

	public void delete(User user) {
		String sql = "delete from user where id=?";
		Object[] args = new Object[] { user.getId() };
		super.update(sql, args);
	}

	@Override
	protected Object rowMapper(ResultSet rs) throws SQLException {
		User user = new User();
		user.setId(rs.getInt(1));
		user.setName(rs.getString(2));
		user.setBirthday(rs.getDate(3));
		user.setMoney(rs.getFloat(4));
		return user;
	}
}
