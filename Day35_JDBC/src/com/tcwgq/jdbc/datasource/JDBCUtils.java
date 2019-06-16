package com.tcwgq.jdbc.datasource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public final class JDBCUtils {
	private static String className = "com.mysql.jdbc.Driver";
	private static MyDataSource2 dataSource = null;

	private JDBCUtils() {

	}

	static {
		try {
			Class.forName(className);
			dataSource = new MyDataSource2();
		} catch (ClassNotFoundException e) {
			throw new ExceptionInInitializerError(e);
		}
	}

	public static Connection getConnection() throws SQLException {
		// return DriverManager.getConnection(url, user, password);
		return dataSource.getConnection();
	}

	public static void free(ResultSet rs, Statement st, Connection conn) {
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (st != null)
					st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if (conn != null)
						conn.close();
					// dataSource.free(conn);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
