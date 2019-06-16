package com.tcwgq.demo7;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TranscationTest {
	public static void main(String[] args) throws SQLException {
		test();
	}

	public static void test() throws SQLException {
		String sql = "update user set money = money - 10 where id = 1";
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			conn.setAutoCommit(false);
			st = conn.createStatement();
			st.executeUpdate(sql);
			sql = "select money from user where id = 2";
			rs = st.executeQuery(sql);
			float money = 0.0f;
			if (rs.next()) {
				money = rs.getFloat(1);
			}
			if (money > 400) {
				throw new RuntimeException("已经超过最大值！");
			}
			sql = "update user set money = money + 10 where id = 2";
			st.executeUpdate(sql);
			conn.commit();
		} catch (SQLException e) {
			if (conn != null) {
				conn.rollback();
			}
			throw e;
		} finally {
			JDBCUtils.free(rs, st, conn);
		}
	}

}
