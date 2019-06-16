package com.tcwgq.demo3;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDDemo {
	public static void main(String[] args) throws SQLException {
		long begin = System.currentTimeMillis();
		// read("李四");
		retrieve("李四");
		// retrieve("'or 1 or'");
		long end = System.currentTimeMillis();
		long time = end - begin;
		System.out.println("outer:" + time);

	}

	public static void create(String name, Date birthday, float money) throws SQLException {
		String sql = "insert into user (name, birthday, money) values (?, ?, ?)";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setDate(2, new Date(birthday.getTime()));
			ps.setFloat(3, money);
			int i = ps.executeUpdate();
			System.out.println(i);
		} finally {
			JDBCUtils.free(rs, ps, conn);
		}
	}

	public static void read(String name) throws SQLException {
		String sql = "select id, name, birthday, money from user where name = '" + name + "'";
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			long begin = System.currentTimeMillis();
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString("name") + "\t" + rs.getDate("birthday") + "\t"
						+ rs.getFloat(4));
			}
			long end = System.currentTimeMillis();
			long time = end - begin;
			System.out.println("inner:" + time);
		} finally {
			JDBCUtils.free(rs, st, conn);
		}
	}

	public static void retrieve(String name) throws SQLException {
		String sql = "select id, name, birthday, money from user where name = ?";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			long begin = System.currentTimeMillis();
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString("name") + "\t" + rs.getDate("birthday") + "\t"
						+ rs.getFloat(4));
			}
			long end = System.currentTimeMillis();
			long time = end - begin;
			System.out.println("inner:" + time);
		} finally {
			JDBCUtils.free(rs, ps, conn);
		}
	}

	public static void update(int id) throws SQLException {
		String sql = "update user set money = 500 where id = ?";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			int i = ps.executeUpdate();
			System.out.println(i);
		} finally {
			JDBCUtils.free(rs, ps, conn);
		}
	}

	public static void delete(String name) throws SQLException {
		String sql = "delete from user where name = ?";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			int i = ps.executeUpdate();
			System.out.println(i);
		} finally {
			JDBCUtils.free(rs, ps, conn);
		}
	}
}
