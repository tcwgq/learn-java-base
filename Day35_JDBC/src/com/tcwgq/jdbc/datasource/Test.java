package com.tcwgq.jdbc.datasource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {
	public static void main(String[] args) throws SQLException {
		for (int i = 0; i < 10; i++) {
			Connection conn = JDBCUtils.getConnection();
			System.out.println(conn);
			JDBCUtils.free(null, null, conn);
		}
		retrieve();
	}

	public static void retrieve() throws SQLException {
		String sql = "select * from user";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString("name") + "\t" + rs.getDate("birthday") + "\t"
						+ rs.getFloat(4));
			}
		} finally {
			JDBCUtils.free(rs, ps, conn);
		}
	}
}
