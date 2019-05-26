package com.tcwgq.demo1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
	public static void main(String[] args) throws SQLException {
		template();
	}

	private static void template() throws SQLException {
		String sql = "select * from user";
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtilsSingleton2.getInstance().getConnection();
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getFloat(4));
			}
		} finally {
			JDBCUtilsSingleton2.getInstance().free(rs, st, conn);
		}
	}
}
