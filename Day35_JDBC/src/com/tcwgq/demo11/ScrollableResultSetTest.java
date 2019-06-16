package com.tcwgq.demo11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ScrollableResultSetTest {
	public static void main(String[] args) throws SQLException {
		read();
	}

	public static void read() throws SQLException {
		String sql = "select id, name, birthday, money from user";
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			rs = st.executeQuery(sql);
			rs.absolute(3);// 从第3行开始
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString("name") + "\t" + rs.getString("birthday") + "\t"
						+ rs.getFloat(4));
			}
			System.out.println("----------------");
			while (rs.previous()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString("name") + "\t" + rs.getString("birthday") + "\t"
						+ rs.getFloat(4));
			}
		} finally {
			JDBCUtils.free(rs, st, conn);
		}
	}

}
