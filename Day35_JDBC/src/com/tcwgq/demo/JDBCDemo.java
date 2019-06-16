package com.tcwgq.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 一个简单的JDBC程序
 */
public class JDBCDemo {
	public static void main(String[] args) throws Exception {
		test();
	}

	private static void test() throws ClassNotFoundException, SQLException {
		String className = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String user = "root";
		String password = "112113";
		String sql = "select * from user";
		// 注册驱动
		Class.forName(className);// 推荐方式
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		System.setProperty("jdbc.drivers", "com.mysql.jdbc.Driver");
		// 创建连接
		Connection conn = DriverManager.getConnection(url, user, password);
		// 创建语句
		Statement st = conn.createStatement();
		// 执行语句，获取结果集
		ResultSet rs = st.executeQuery(sql);
		// 处理结果
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getFloat(4));
		}
		// 释放资源，按相反顺序关闭
		rs.close();
		st.close();
		conn.close();
	}

}
