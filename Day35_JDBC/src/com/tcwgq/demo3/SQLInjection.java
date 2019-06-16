package com.tcwgq.demo3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLInjection {
	public static void main(String[] args) throws SQLException {
		retrieve("张三");// 正常查询
		retrieve("'or 1 or'");// SQL注入
	}

	private static void retrieve(String name) throws SQLException {
		String sql = "select id, name, birthday, money from user where name = '" + name + "'";
		System.out.println(sql);
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString("name") + "\t" + rs.getString("birthday") + "\t"
						+ rs.getFloat(4));
			}
		} finally {
			JDBCUtils.free(rs, ps, conn);
		}
	}
}
