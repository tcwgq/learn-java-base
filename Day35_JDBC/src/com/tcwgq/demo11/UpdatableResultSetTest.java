package com.tcwgq.demo11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class UpdatableResultSetTest {
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
			st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				Date birthday = rs.getDate(3);
				float money = rs.getFloat(4);
				System.out.println(id + "\t" + name + "\t" + birthday + "\t" + money);
				// if (name.equals("张三")) {
				// rs.updateFloat(4, 500f);
				// rs.updateRow();
				// }
			}
		} finally {
			JDBCUtils.free(rs, st, conn);
		}
	}
}
