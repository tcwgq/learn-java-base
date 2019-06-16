package com.tcwgq.jdbc.dao.refactor;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.tcwgq.jdbc.domain.Student;

public class StudentDaoImpl extends AbstractDao {
	public Student findStudent(String name, int age) {
		String sql = "select name, age from student where name = ?";
		Object[] args = new Object[] { name, age };
		return (Student) super.find(sql, args);
	}

	@Override
	protected Object rowMapper(ResultSet rs) throws SQLException {
		Student s = new Student();
		s.setName(rs.getString(1));
		s.setAge(rs.getInt(2));
		return s;
	}

}
