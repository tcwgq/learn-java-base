package com.tcwgq.demo15;

import java.sql.Connection;
import java.sql.SQLException;

public class Test {
	public static void main(String[] args) throws SQLException {
		Connection conn = JDBCUtils.getConnection();
		System.out.println(conn);
		System.out.println(conn.getClass().getName());
		JDBCUtils.free(null, null, conn);
	}
}
