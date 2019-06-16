package com.tcwgq.demo7;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class SavePointTest {
	public static void main(String[] args) throws SQLException {
		test();
	}

	public static void test() throws SQLException {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		Savepoint sp = null;
		try {
			conn = JDBCUtils.getConnection();
			conn.setAutoCommit(false);
			st = conn.createStatement();
			String sql = "update user set money = money - 10 where id = 1";// 张三减少10元
			st.executeUpdate(sql);
			sp = conn.setSavepoint();
			sql = "update user set money = money - 10 where id = 2";// 李四减少10元
			st.executeUpdate(sql);
			sql = "select money from user where id = 3";// 查看王五的金额
			rs = st.executeQuery(sql);
			float money = 0.0f;
			if (rs.next()) {
				money = rs.getFloat(1);
			}
			if (money > 1000) {
				throw new RuntimeException("已经超过最大值！");
			}
			sql = "update user set money = money + 20 where id = 3";// 王五增加20元
			st.executeUpdate(sql);
			conn.commit();
		} catch (RuntimeException e) {
			if (conn != null && sp != null) {
				conn.rollback(sp);
				conn.commit();
			}
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
