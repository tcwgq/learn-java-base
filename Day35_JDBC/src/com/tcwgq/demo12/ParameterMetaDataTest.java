package com.tcwgq.demo12;

import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ParameterMetaDataTest {
	public static void main(String[] args) throws SQLException {
		String sql = "select * from user where name = ? and birthday < ? and money > ?";
		Object[] params = new Object[] { "张三", new java.sql.Date(System.currentTimeMillis()), 100f };
		read(sql, params);
	}

	public static void read(String sql, Object[] params) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			ps = conn.prepareStatement(sql);
			ParameterMetaData pmd = ps.getParameterMetaData();// 连接的URL后面需要有相应配置参数
			int count = pmd.getParameterCount();
			for (int i = 1; i <= count; i++) {
				// System.out.print(pmd.getParameterClassName(i) + "\t");
				// System.out.print(pmd.getParameterType(i) + "\t");
				// System.out.println(pmd.getParameterTypeName(i));
				ps.setObject(i, params[i - 1]);// 数组下标从0开始
			}
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString("name") + "\t" + rs.getDate("birthday") + "\t"
						+ rs.getFloat(4));
			}
		} finally {
			JDBCUtils.free(rs, ps, conn);
		}
	}
}
