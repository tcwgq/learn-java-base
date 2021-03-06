package com.tcwgq.jdbc.spring;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;

public final class JDBCUtils {
	private static DataSource dataSource = null;

	private JDBCUtils() {

	}

	static {
		try {
			InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("dbcpconfig.properties");
			Properties prop = new Properties();
			prop.load(is);
			dataSource = BasicDataSourceFactory.createDataSource(prop);
		} catch (Exception e) {
			throw new ExceptionInInitializerError(e);
		}
	}

	public static Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}

	public static DataSource getDataSource() {
		return dataSource;
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
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
