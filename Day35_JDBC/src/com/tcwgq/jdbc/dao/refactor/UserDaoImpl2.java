package com.tcwgq.jdbc.dao.refactor;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.tcwgq.jdbc.domain.User;

public class UserDaoImpl2 {
	private MyDaoTemplate template = new MyDaoTemplate();

	public User findUser(String username, String password) {
		String sql = "select id, name, birthday, money from user where name = ?";
		Object[] args = new Object[] { username };
		return (User) this.template.find(sql, args, new MyRowMapper());
	}

	public String findUserName(int id) {
		String sql = "select name from user where id = ?";
		Object[] args = new Object[] { id };
		return (String) this.template.find(sql, args, new RowMapper() {
			@Override
			public Object rowMapper(ResultSet rs) throws SQLException {
				return rs.getString("name");
			}
		});
	}
}

class MyRowMapper implements RowMapper {

	@Override
	public Object rowMapper(ResultSet rs) throws SQLException {
		User user = new User();
		user.setId(rs.getInt(1));
		user.setName(rs.getString(2));
		user.setBirthday(rs.getDate(3));
		user.setMoney(rs.getFloat(4));
		return null;
	}

}