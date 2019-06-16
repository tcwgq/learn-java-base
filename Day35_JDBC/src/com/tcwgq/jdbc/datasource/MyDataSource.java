package com.tcwgq.jdbc.datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;

public class MyDataSource {
	private static String url = "jdbc:mysql://localhost:3306/jdbc?generateSimpleParameterMetadata=true";
	private static String user = "root";
	private static String password = "112113";
	private static int initCount = 5;
	private static int maxCount = 10;
	private int currentCount = 0;
	private LinkedList<Connection> connectionsPool = new LinkedList<Connection>();

	public MyDataSource() {
		try {
			for (int i = 0; i < initCount; i++) {
				this.connectionsPool.addLast(this.createConnection());
				this.currentCount++;
			}
		} catch (SQLException e) {
			throw new ExceptionInInitializerError(e);
		}
	}

	private Connection createConnection() throws SQLException {
		return DriverManager.getConnection(url, user, password);
	}

	public Connection getConnection() throws SQLException {
		synchronized (connectionsPool) {
			if (this.connectionsPool.size() > 0)
				return this.connectionsPool.removeFirst();
			if (this.currentCount < maxCount) {
				this.currentCount++;
				return this.createConnection();
			}
			throw new SQLException("没有连接可用");
		}
	}

	public void free(Connection conn) {
		this.connectionsPool.addLast(conn);
	}
}
