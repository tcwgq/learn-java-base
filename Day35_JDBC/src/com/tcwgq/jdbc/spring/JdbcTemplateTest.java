package com.tcwgq.jdbc.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.ConnectionCallback;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.tcwgq.jdbc.domain.User;

public class JdbcTemplateTest {
	private static JdbcTemplate jdbc = new JdbcTemplate(JDBCUtils.getDataSource());

	// JdbcTemplate是线程安全的
	public static void main(String[] args) {
		User user = findUser("张三");
		System.out.println(user);
		System.out.println("--------------");
		List<User> list = listUser(4);
		System.out.println(list);
		System.out.println("--------------");
		int count = getUserCount();
		System.out.println(count);
		System.out.println("--------------");
		String name = getUserName(1);
		System.out.println(name);
		System.out.println("---------------");
		System.out.println(getData(1));
	}

	public static int addUser(User user) {
		return jdbc.execute(new ConnectionCallback<Integer>() {
			@Override
			public Integer doInConnection(Connection conn) throws SQLException, DataAccessException {
				String sql = "insert into user (name, birthday, money) values (?, ?, ?)";
				PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				ps.setString(1, user.getName());
				ps.setDate(2, new java.sql.Date(user.getBirthday().getTime()));
				ps.setFloat(3, user.getMoney());
				ps.executeUpdate();
				ResultSet rs = ps.getGeneratedKeys();
				int id = 0;
				while (rs.next()) {
					id = rs.getInt(1);
				}
				return id;
			}
		});
	}

	public static User findUser(String name) {
		String sql = "select id, name, birthday, money from user where name = ?";
		Object[] args = new Object[] { name };
		User user = jdbc.queryForObject(sql, args, new BeanPropertyRowMapper<>(User.class));
		return user;
	}

	public static List<User> listUser(int id) {
		String sql = "select id, name, birthday, money from user where id < ?";
		int[] argsType = new int[] { Types.INTEGER };
		Object[] args = new Object[] { id };
		List<User> list = jdbc.query(sql, args, argsType, new BeanPropertyRowMapper<>(User.class));
		return list;
	}

	public static int getUserCount() {
		String sql = "select count(*) from user";
		return jdbc.queryForInt(sql);
	}

	public static String getUserName(int id) {
		String sql = "select name from user where id = ?";
		Object[] args = new Object[] { id };
		String name = jdbc.queryForObject(sql, args, String.class);
		return name;
	}

	public static Map<String, Object> getData(int id) {
		String sql = "select id as userId, name, birthday, money from user where id = ?";
		Object[] args = new Object[] { id };
		return jdbc.queryForMap(sql, args);
	}

	public static User findUser1(String name) {
		String sql = "select id, name, birthday, money from user where name = ?";
		Object[] args = new Object[] { name };
		User user = jdbc.queryForObject(sql, args, new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User();
				user.setId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setBirthday(rs.getDate(3));
				user.setMoney(rs.getFloat(4));
				return user;
			}
		});
		return user;
	}
}
