package com.tcwgq.jdbc.dao.refactor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tcwgq.demo3.JDBCUtils;
import com.tcwgq.jdbc.dao.DaoException;

public class MyDaoTemplate {
	public Object find(String sql, Object[] args, RowMapper rowMapper) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			ps = conn.prepareStatement(sql);
			for (int i = 0; i < args.length; i++) {
				ps.setObject(i + 1, args[i]);
			}
			rs = ps.executeQuery();
			Object obj = null;
			while (rs.next()) {
				obj = rowMapper.rowMapper(rs);
			}
			return obj;
		} catch (SQLException e) {
			throw new DaoException(e.getMessage(), e);
		} finally {
			JDBCUtils.free(rs, ps, conn);
		}
	}
}
