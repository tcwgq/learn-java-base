package com.tcwgq.jdbc.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.tcwgq.jdbc.dao.UserDao;
import com.tcwgq.jdbc.domain.User;
import com.tcwgq.jdbc.spring.JDBCUtils;

/**
 * 注意： :之后紧跟字段名称，不能有空格！
 */
public class UserDaoSpringImpl implements UserDao {
	private NamedParameterJdbcTemplate named = new NamedParameterJdbcTemplate(JDBCUtils.getDataSource());

	@Override
	public void addUser(User user) {
		String sql = "insert into user (name, birthday, money) values (:name, :birthday, :money)";
		SqlParameterSource sps = new BeanPropertySqlParameterSource(user);
		KeyHolder keyHolder = new GeneratedKeyHolder();
		named.update(sql, sps, keyHolder);
		int id = keyHolder.getKey().intValue();
		user.setId(id);
	}

	@Override
	public User getUser(int id) {
		String sql = "select id, name, birthday, money from user where id =:id";
		Map<String, Integer> paramMap = new HashMap<String, Integer>();
		paramMap.put("id", id);
		return this.named.queryForObject(sql, paramMap, new BeanPropertyRowMapper<>(User.class));
	}

	@Override
	public User findUser(String username, String password) {
		String sql = "select id, name, birthday, money from user where name =:name";
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("name", username);
		return this.named.queryForObject(sql, paramMap, new BeanPropertyRowMapper<>(User.class));
	}

	@Override
	public void update(User user) {
		String sql = "update user set name =:name, birthday =:birthday, money =:money where id =:id";
		SqlParameterSource paramSource = new BeanPropertySqlParameterSource(user);
		this.named.update(sql, paramSource);
	}

	@Override
	public void delete(User user) {
		String sql = "delete from user where id =:id";
		SqlParameterSource paramSource = new BeanPropertySqlParameterSource(user);
		this.named.update(sql, paramSource);
	}

}
