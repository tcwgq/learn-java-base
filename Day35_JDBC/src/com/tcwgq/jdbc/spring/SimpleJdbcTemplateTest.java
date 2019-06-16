package com.tcwgq.jdbc.spring;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import com.tcwgq.jdbc.domain.User;

public class SimpleJdbcTemplateTest {
	private static SimpleJdbcTemplate simple = new SimpleJdbcTemplate(JDBCUtils.getDataSource());

	public static void main(String[] args) {
		User user = findUser("张三");
		System.out.println(user);
	}

	public static User findUser(String name) {
		String sql = "select id, name, birthday, money from user where name = ?";
		User user = simple.queryForObject(sql, ParameterizedBeanPropertyRowMapper.newInstance(User.class), name);
		return user;
	}
}
