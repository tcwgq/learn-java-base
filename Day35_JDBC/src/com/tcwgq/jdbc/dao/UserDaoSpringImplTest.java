package com.tcwgq.jdbc.dao;

import java.util.Date;

import com.tcwgq.jdbc.domain.User;

/**
 * Cannot execute statement: impossible to write to binary log since
 * BINLOG_FORMAT = STATEMENT and at least one table uses a storage engine
 * limited to row-based logging. InnoDB is limited to row-logging when
 * transaction isolation level is READ COMMITTED or READ UNCOMMITTED.
 */
public class UserDaoSpringImplTest {
	public static void main(String[] args) {
		UserDao ud = DaoFactory.getInstance().getUserDao();
		User user = new User();
		user.setName("aaa");
		user.setBirthday(new Date());
		user.setMoney(888.88f);
		ud.addUser(user);
		System.out.println("-----------------");
		user = ud.getUser(1);
		System.out.println(user);
		System.out.println("-------------------");
		user = ud.findUser("王五", null);
		System.out.println(user);
		System.out.println("-------------------");
		user.setMoney(600f);
		ud.update(user);
		System.out.println("--------------------");
		user.setId(7);
		ud.delete(user);
	}
}
