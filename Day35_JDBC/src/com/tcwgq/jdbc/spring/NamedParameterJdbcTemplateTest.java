package com.tcwgq.jdbc.spring;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import com.tcwgq.jdbc.domain.User;

public class NamedParameterJdbcTemplateTest {
	private static NamedParameterJdbcTemplate named = new NamedParameterJdbcTemplate(JDBCUtils.getDataSource());

	public static void main(String[] args) {
		User u = new User();
		u.setName("张三");
		User user = findUser(u);
		System.out.println(user);
	}

	public static int addUser(User user) {
		String sql = "insert into user (name, birthday, money) values (:name, :birthday, :money)";
		SqlParameterSource sps = new BeanPropertySqlParameterSource(user);
		KeyHolder keyHolder = new GeneratedKeyHolder();
		named.update(sql, sps, keyHolder);
		int id = keyHolder.getKey().intValue();
		// Map<String, Object> map = keyHolder.getKeys();// 复合主键获取方式
		return id;
	}

	public static User findUser(User user) {
		String sql = "select id, name, birthday, money from user where name =:name";
		// Map<String, Object> paramMap = new HashMap<String, Object>();
		// paramMap.put("name", user.getName());
		SqlParameterSource sps = new BeanPropertySqlParameterSource(user);
		User u = named.queryForObject(sql, sps, new BeanPropertyRowMapper<>(User.class));
		return u;
	}

}
