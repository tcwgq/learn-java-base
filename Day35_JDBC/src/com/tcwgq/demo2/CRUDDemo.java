package com.tcwgq.demo2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class CRUDDemo {
	@Test
	public void fun1() throws SQLException {
		create();
	}

	@Test
	public void fun2() throws SQLException {
		retrieve();
	}

	@Test
	public void fun3() throws SQLException {
		update();
	}

	@Test
	public void fun4() throws SQLException {
		delete();
	}

	private static void create() throws SQLException {
		String sql = "insert into user (name, birthday, money) values ('赵六', '1988-8-8', 123.34)";
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			st = conn.createStatement();
			int i = st.executeUpdate(sql);
			System.out.println(i);
		} finally {
			JDBCUtils.free(rs, st, conn);
		}
	}

	private static void retrieve() throws SQLException {
		String sql = "select id, name, birthday, money from user";
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString("name") + "\t" + rs.getString("birthday") + "\t"
						+ rs.getFloat(4));
			}
		} finally {
			JDBCUtils.free(rs, st, conn);
		}
	}

	private static void update() throws SQLException {
		String sql = "update user set money = 500 where id = 1";
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			st = conn.createStatement();
			int i = st.executeUpdate(sql);
			System.out.println(i);
		} finally {
			JDBCUtils.free(rs, st, conn);
		}
	}

	private static void delete() throws SQLException {
		String sql = "delete from user where name = '赵六'";
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			st = conn.createStatement();
			int i = st.executeUpdate(sql);
			System.out.println(i);
		} finally {
			JDBCUtils.free(rs, st, conn);
		}
	}
}
