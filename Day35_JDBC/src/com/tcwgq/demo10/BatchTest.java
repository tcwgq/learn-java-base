package com.tcwgq.demo10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BatchTest {
	public static void main(String[] args) throws SQLException {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			create(i);// 这种方式，效率低下
		}
		long end = System.currentTimeMillis();
		long time = end - start;
		System.out.println("create:" + time);
		start = System.currentTimeMillis();
		batch();
		end = System.currentTimeMillis();
		time = end - start;
		System.out.println("batch:" + time);
	}

	public static void create(int i) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "insert into user (name, birthday, money) values (?, ?, ?)";
		try {
			conn = JDBCUtils.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, "no batchname" + i);
			ps.setDate(2, new java.sql.Date(System.currentTimeMillis()));
			ps.setFloat(3, 120f + i);
			ps.executeUpdate();
		} finally {
			JDBCUtils.free(rs, ps, conn);
		}
	}

	public static void batch() throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "insert into user (name, birthday, money) values (?, ?, ?)";
		try {
			conn = JDBCUtils.getConnection();
			ps = conn.prepareStatement(sql);
			for (int i = 0; i < 1000; i++) {
				ps.setString(1, "batchname" + i);
				ps.setDate(2, new java.sql.Date(System.currentTimeMillis()));
				ps.setFloat(3, 120f + i);
			}
			int[] rows = ps.executeBatch();
			for (int row : rows) {
				System.out.println(row);
			}
		} finally {
			JDBCUtils.free(rs, ps, conn);
		}
	}

}
