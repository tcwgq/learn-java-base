package com.tcwgq.demo14;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tcwgq.jdbc.domain.User;

public class ORMTest {
	public static void main(String[] args) throws SQLException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, InstantiationException {
		String sql = "select id as Id, name as Name, birthday as Birthday, money as Money from user where id = 1";
		User user = (User) getObject(sql, User.class);
		System.out.println(user);
		System.out.println("-------------");
		Bean b = (Bean) getObject(sql, Bean.class);
		System.out.println(b);
	}

	public static <T> T getInstance(String sql, Class<T> c) throws SQLException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, InstantiationException {
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
			T t = null;
			Method[] methods = c.getMethods();
			if (rs.next()) {
				t = c.newInstance();
				for (int j = 0; j < columnNames.length; j++) {
					String columnName = columnNames[j];
					String methodName = "set" + columnName;
					for (Method m : methods) {
						if (methodName.equals(m.getName())) {
							m.invoke(t, rs.getObject(columnName));
						}
					}
				}
			}
			return t;
		} finally {
			JDBCUtils.free(rs, ps, conn);
		}
	}

	public static Object getObject(String sql, Class<?> c) throws SQLException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, InstantiationException {
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
			Object object = null;
			Method[] methods = c.getMethods();
			if (rs.next()) {
				object = c.newInstance();
				for (int j = 0; j < columnNames.length; j++) {
					String columnName = columnNames[j];
					String methodName = "set" + columnName;
					for (Method m : methods) {
						if (methodName.equals(m.getName())) {
							m.invoke(object, rs.getObject(columnName));
						}
					}
				}
			}
			return object;
		} finally {
			JDBCUtils.free(rs, ps, conn);
		}
	}

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
