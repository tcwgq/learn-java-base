package com.tcwgq.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 单例模式懒汉式
 */
public final class JDBCUtilsSingleton2 {
	private static String className = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/jdbc";
	private static String user = "root";
	private static String password = "112113";
	private static JDBCUtilsSingleton2 instance = null;
	private static Object lock = new Object();

	private JDBCUtilsSingleton2() {

	}

	public static JDBCUtilsSingleton2 getInstance() {
		if (instance == null) {
			synchronized (lock) {
				if (instance == null) {
					instance = new JDBCUtilsSingleton2();
				}
			}
		}
		return instance;
	}

	static {
		try {
			Class.forName(className);
		} catch (ClassNotFoundException e) {
			throw new ExceptionInInitializerError(e);
		}
	}

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, user, password);
	}

	public void free(ResultSet rs, Statement st, Connection conn) {
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
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
