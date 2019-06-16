package com.tcwgq.jdbc.datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;

public class MyDataSource2 {
	private static String url = "jdbc:mysql://localhost:3306/jdbc?generateSimpleParameterMetadata=true";
	private static String user = "root";
	private static String password = "112113";
	private static int initCount = 1;
	private static int maxCount = 1;
	int currentCount = 0;
	LinkedList<Connection> connectionsPool = new LinkedList<Connection>();

	public MyDataSource2() {
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
		// return DriverManager.getConnection(url, user, password);
		Connection realConnection = DriverManager.getConnection(url, user, password);
		// MyConnection myConnection = new MyConnection(realConnection, this);//
		// 创建Connection时用MyConnection代替
		// return myConnection;
		MyConnectionHandler proxy = new MyConnectionHandler(this);
		return proxy.bind(realConnection);
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
