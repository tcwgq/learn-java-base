package com.tcwgq.demo4;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * java.util.Date与java.sql.Date的相互转化： 
 * java.util.Date包含日期和时间 
 * java.sql.Date只包含日期
 * java.sql.Date date = new java.sql.Date(new java.util.Date().getTime());
 */
public class DateDemo {
	public static void main(String[] args) throws SQLException {
		create("zhangSan", new Date(), 456.78f);
		Date date = retrieve(1);
		System.out.println(date);
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
			ps.setDate(2, new java.sql.Date(birthday.getTime()));
			ps.setFloat(3, money);
			int i = ps.executeUpdate();
			System.out.println(i);
		} finally {
			JDBCUtils.free(rs, ps, conn);
		}
	}

	public static Date retrieve(int id) throws SQLException {
		String sql = "select * from user where id = ?";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Date date = null;
		try {
			conn = JDBCUtils.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				date = new Date(rs.getDate("birthday").getTime());
			}
		} finally {
			JDBCUtils.free(rs, ps, conn);
		}
		return date;
	}

}
