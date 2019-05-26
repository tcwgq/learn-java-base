package com.tcwgq.demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * JDBC程序的规范化
 */
public class JDBCDemo1 {
	public static void main(String[] args) throws SQLException {
		template();
	}

	private static void template() throws SQLException {
		String sql = "select * from user";
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getFloat(4));
			}
		} finally {
			JDBCUtils.free(rs, st, conn);
		}
	}
}
