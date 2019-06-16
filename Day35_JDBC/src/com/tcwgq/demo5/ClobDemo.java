package com.tcwgq.demo5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClobDemo {
	public static void main(String[] args) throws SQLException, IOException {
		Reader r = new BufferedReader(new FileReader("src/com/tcwgq/demo5/JDBCUtils.java"));
		create(r);
		retrieve();
		r.close();
	}

	public static void create(Reader reader) throws SQLException {
		String sql = "insert into clob_test (id, big_text) values (null, ?)";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setCharacterStream(1, reader);
			int i = ps.executeUpdate();
			System.out.println(i);
		} finally {
			JDBCUtils.free(rs, ps, conn);
		}
	}

	public static void retrieve() throws SQLException, IOException {
		String sql = "select big_text from clob_test";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				// String s = rs.getString(1);// 直接以String方式获取
				Clob clob = rs.getClob("big_text");
				// Reader r = rs.getCharacterStream(1);// 直接获取Reader
				Reader reader = clob.getCharacterStream();
				Writer writer = new BufferedWriter(new FileWriter("copy.java"));
				char[] cbuf = new char[1024];
				int len = 0;
				while ((len = reader.read(cbuf)) != -1) {
					writer.write(cbuf, 0, len);
				}
				writer.close();
				reader.close();
			}
		} finally {
			JDBCUtils.free(rs, ps, conn);
		}
	}

}
