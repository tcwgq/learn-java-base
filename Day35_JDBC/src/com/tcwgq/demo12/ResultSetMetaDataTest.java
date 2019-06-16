package com.tcwgq.demo12;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResultSetMetaDataTest {
	public static void main(String[] args) throws SQLException {
		String sql = "select id as userid, name as username from user";
		Map<String, Object> map = read(sql);
		System.out.println(map);
		System.out.println("---------------");
		List<Map<String, Object>> list = list(sql);
		System.out.println(list);
	}

	// 单个查询结果
	public static Map<String, Object> read(String sql) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int count = rsmd.getColumnCount();
			String[] columnNames = new String[count];
			for (int i = 1; i <= count; i++) {
				// System.out.print(rsmd.getColumnClassName(i) + "\t");
				// System.out.print(rsmd.getColumnTypeName(i) + "\t");
				// System.out.print(rsmd.getColumnName(i) + "\t");
				// System.out.println(rsmd.getColumnLabel(i));// 可以获取列的别名
				columnNames[i - 1] = rsmd.getColumnLabel(i);
			}
			Map<String, Object> map = null;
			if (rs.next()) {
				map = new HashMap<String, Object>();
				for (int j = 0; j < count; j++) {
					map.put(columnNames[j], rs.getObject(columnNames[j]));
				}
			}
			return map;
		} finally {
			JDBCUtils.free(rs, ps, conn);
		}
	}

	// 多个查询结果
	public static List<Map<String, Object>> list(String sql) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int count = rsmd.getColumnCount();
			String[] columnNames = new String[count];
			for (int i = 1; i <= count; i++) {
				columnNames[i - 1] = rsmd.getColumnLabel(i);
			}
			List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
			while (rs.next()) {
				Map<String, Object> map = new HashMap<String, Object>();
				for (int j = 0; j < count; j++) {
					map.put(columnNames[j], rs.getObject(columnNames[j]));
				}
				list.add(map);
			}
			return list;
		} finally {
			JDBCUtils.free(rs, ps, conn);
		}
	}
}
