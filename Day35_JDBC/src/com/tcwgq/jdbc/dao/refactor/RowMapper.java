package com.tcwgq.jdbc.dao.refactor;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface RowMapper {
	public abstract Object rowMapper(ResultSet rs) throws SQLException;
}
