package com.tcwgq.demo6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BlobDemo {
	public static void main(String[] args) throws SQLException, IOException {
		InputStream is = new BufferedInputStream(new FileInputStream("src/com/tcwgq/demo6/mn.jpg"));
		// InputStream is = new BufferedInputStream(new
		// FileInputStream("src/com/tcwgq/demo6/Darksiders.flv"));
		create(is);
		retrieve();
	}

	public static void create(InputStream is) throws SQLException {
		String sql = "insert into blob_test (id, big_bit) values (null, ?)";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setBinaryStream(1, is);
			int i = ps.executeUpdate();
			System.out.println(i);
		} finally {
			JDBCUtils.free(rs, ps, conn);
		}
	}

	public static void retrieve() throws SQLException, IOException {
		String sql = "select big_bit from blob_test";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				// Blob blob = rs.getBlob(1);
				// InputStream is = blob.getBinaryStream();
				InputStream is = rs.getBinaryStream(1);// 直接获取InputStream
				// OutputStream os = new BufferedOutputStream(new
				// FileOutputStream("copy.flv"));
				OutputStream os = new BufferedOutputStream(new FileOutputStream("copy.jpg"));
				byte[] bys = new byte[1024];
				int len = 0;
				while ((len = is.read(bys)) != -1) {
					os.write(bys, 0, len);
				}
				os.close();
				is.close();
			}
		} finally {
			JDBCUtils.free(rs, ps, conn);
		}
	}

}
