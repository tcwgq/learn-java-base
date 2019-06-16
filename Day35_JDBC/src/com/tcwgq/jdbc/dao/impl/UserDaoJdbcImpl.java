package com.tcwgq.jdbc.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.tcwgq.demo7.JDBCUtils;
import com.tcwgq.jdbc.dao.DaoException;
import com.tcwgq.jdbc.dao.UserDao;
import com.tcwgq.jdbc.domain.User;

public class UserDaoJdbcImpl implements UserDao {

	@Override
	public void addUser(User user) {
		String sql = "insert into user (name, birthday, money) values (?, ?, ?)";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, user.getName());
			ps.setDate(2, new Date(user.getBirthday().getTime()));
			ps.setFloat(3, user.getMoney());
			int i = ps.executeUpdate();
			System.out.println(i);
			rs = ps.getGeneratedKeys();
			while (rs.next()) {
				user.setId(rs.getInt(1));
			}
		} catch (SQLException e) {
			throw new DaoException(e.getMessage(), e);
		} finally {
			JDBCUtils.free(rs, ps, conn);
		}
	}

	@Override
	public User getUser(int userId) {
		String sql = "select id, name, birthday, money from user where id = ?";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		User user = null;
		try {
			conn = JDBCUtils.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, userId);
			rs = ps.executeQuery();
			while (rs.next()) {
				user = new User(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getFloat(4));
			}
		} catch (SQLException e) {
			throw new DaoException(e.getMessage(), e);
		} finally {
			JDBCUtils.free(rs, ps, conn);
		}
		return user;
	}

	@Override
	public User findUser(String username, String password) {
		String sql = "select id, name, birthday, money from user where name = ?";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		User user = null;
		try {
			conn = JDBCUtils.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			rs = ps.executeQuery();
			while (rs.next()) {
				user = new User(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getFloat(4));
			}
		} catch (SQLException e) {
			throw new DaoException(e.getMessage(), e);
		} finally {
			JDBCUtils.free(rs, ps, conn);
		}
		return user;
	}

	@Override
	public void update(User user) {
		String sql = "update user set name = ?, birthday = ?, money = ? where id = ?";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getName());
			ps.setDate(2, new Date(user.getBirthday().getTime()));
			ps.setFloat(3, user.getMoney());
			ps.setInt(4, user.getId());
			int i = ps.executeUpdate();
			System.out.println(i);
		} catch (SQLException e) {
			throw new DaoException(e.getMessage(), e);
		} finally {
			JDBCUtils.free(rs, ps, conn);
		}
	}

	@Override
	public void delete(User user) {
		String sql = "delete from user where id = ?";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, user.getId());
			int i = ps.executeUpdate();
			System.out.println(i);
		} catch (SQLException e) {
			throw new DaoException(e.getMessage(), e);
		} finally {
			JDBCUtils.free(rs, ps, conn);
		}
	}

}
