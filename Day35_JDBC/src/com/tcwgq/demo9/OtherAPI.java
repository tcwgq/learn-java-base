package com.tcwgq.demo9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.tcwgq.demo3.JDBCUtils;

public class OtherAPI {
	public static void main(String[] args) throws SQLException {
		int id = create("zhangSan", new Date(), 700);
		System.out.println(id);
	}

	public static int create(String name, Date birthday, float money) throws SQLException {
		String sql = "insert into user (name, birthday, money) values (?, ?, ?)";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, name);
			ps.setDate(2, new java.sql.Date(birthday.getTime()));
			ps.setFloat(3, money);
			ps.executeUpdate();
			rs = ps.getGeneratedKeys();
			int id = 0;
			while (rs.next()) {
				id = rs.getInt(1);
			}
			return id;
		} finally {
			JDBCUtils.free(rs, ps, conn);
		}
	}

}
