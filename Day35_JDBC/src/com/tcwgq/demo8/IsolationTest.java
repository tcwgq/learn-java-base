package com.tcwgq.demo8;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 脏读意味着一个事务读取了另一个事务未提交的数据,而这个数据是有可能回滚。
 * 不可重复读意味着，在数据库访问中，一个事务范围内两个相同的查询却返回了不同数据。这是由于查询时系统中其他事务修改的提交而引起的。
 * 例如：事务B中对某个查询执行两次，当第一次执行完时，事务A对其数据进行了修改。事务B中再次查询时，数据发生了改变。
 * 幻读,是指当事务不是独立执行时发生的一种现象，例如第一个事务对一个表中的数据进行了修改，这种修改涉及到表中的全部数据行。同时，
 * 第二个事务也修改这个表中的数据，这种修改是向表中插入一行新数据。那么，以后就会发生操作第一个事务的用户发现表中还有没有修改的数据行，就好象发生了幻觉一样。
 */
public class IsolationTest {
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
			conn.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
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
