package com.tcwgq.demo9;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Date;

public class ProcedureTest {
	public static void main(String[] args) throws SQLException {
		procedure();
	}

	public static void procedure() throws SQLException {
		Connection conn = null;
		CallableStatement cs = null;
		ResultSet rs = null;
		String sql = "{call addUser(?, ?, ?, ?)}";
		try {
			conn = JDBCUtils.getConnection();
			cs = conn.prepareCall(sql);
			cs.registerOutParameter(4, Types.INTEGER);
			cs.setString(1, "aaa");
			cs.setDate(2, new java.sql.Date(new Date().getTime()));
			cs.setFloat(3, 345.56f);
			cs.executeUpdate();
			int id = cs.getInt(4);
			System.out.println(id);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			JDBCUtils.free(rs, cs, conn);
		}
	}

}
