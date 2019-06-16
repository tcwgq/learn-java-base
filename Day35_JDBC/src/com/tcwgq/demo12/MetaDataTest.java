package com.tcwgq.demo12;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class MetaDataTest {
	public static void main(String[] args) throws SQLException {
		Connection conn = JDBCUtils.getConnection();
		DatabaseMetaData meta = conn.getMetaData();
		System.out.println(meta.getDatabaseMajorVersion());
		System.out.println(meta.getDatabaseMinorVersion());
		System.out.println(meta.getDatabaseProductName());
		System.out.println(meta.getDatabaseProductVersion());
		System.out.println(meta.supportsTransactions());
		conn.close();
	}
}
